package lucassales2.trinus.ui.match;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import lucassales2.trinus.R;
import lucassales2.trinus.network.dto.HeroDto;
import lucassales2.trinus.network.dto.ItemDto;
import lucassales2.trinus.network.dto.match.MatchDetailDto;
import lucassales2.trinus.network.response.ItemResponse;

/**
 * Created by Lucas Sales on 04/05/2017.
 */

public class MatchScoreFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_match_score, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView_match_details);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Observable.just(getContext().getAssets())
                .map(new Function<AssetManager, MatchScoreAdapter>() {
                    @Override
                    public MatchScoreAdapter apply(AssetManager assetManager) throws Exception {
                        MatchDetailDto detailDto;
                        ItemResponse itemResponse;
                        List<HeroDto> heroDtos;
                        Gson gson = new GsonBuilder().create();
                        {
                            InputStream is = assetManager.open("match.json");
                            int size = is.available();

                            byte[] buffer = new byte[size];

                            is.read(buffer);

                            is.close();

                            String json = new String(buffer, "UTF-8");
                            detailDto = gson.fromJson(json, MatchDetailDto.class);
                        }

                        {
                            InputStream is = assetManager.open("items.json");
                            int size = is.available();

                            byte[] buffer = new byte[size];

                            is.read(buffer);

                            is.close();

                            String json = new String(buffer, "UTF-8");

                            itemResponse = gson.fromJson(json, ItemResponse.class);
                        }
                        {
                            InputStream is2 = assetManager.open("heroes.json");
                            int size2 = is2.available();

                            byte[] buffer2 = new byte[size2];

                            is2.read(buffer2);

                            is2.close();

                            String json2 = new String(buffer2, "UTF-8");
                            heroDtos = gson.fromJson(json2, new TypeToken<ArrayList<HeroDto>>() {
                            }.getType());
                        }

                        SparseArray<HeroDto> heroDtoSparseArray = new SparseArray<>();
                        for (HeroDto heroDto : heroDtos) {
                            heroDtoSparseArray.put(heroDto.getId(), heroDto);
                        }

                        SparseArray<ItemDto> itemDtoSparseArray = new SparseArray<>();
                        for (ItemDto itemDto : itemResponse.getResult().getItems()) {
                            itemDtoSparseArray.put(itemDto.getId(), itemDto);
                        }


                        return new MatchScoreAdapter(detailDto, itemDtoSparseArray, heroDtoSparseArray);
                    }
                })
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<MatchScoreAdapter>() {
                    @Override
                    public void accept(MatchScoreAdapter adapter) throws Exception {
                        recyclerView.setAdapter(adapter);
                    }
                });
        return rootView;
    }
}
