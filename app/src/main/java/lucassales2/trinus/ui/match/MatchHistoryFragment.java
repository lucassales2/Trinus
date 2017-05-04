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
import lucassales2.trinus.network.dto.match.MatchDto;

/**
 * Created by Lucas Sales on 27/04/2017.
 */

public class MatchHistoryFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_match_history, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView_match_history);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        Observable.just(getContext().getAssets())
                .map(new Function<AssetManager, InfoHolder>() {
                    @Override
                    public InfoHolder apply(AssetManager assets) throws Exception {
                        InputStream is = assets.open("matchhistory.json");
                        int size = is.available();

                        byte[] buffer = new byte[size];

                        is.read(buffer);

                        is.close();

                        String json = new String(buffer, "UTF-8");
                        Gson gson = new GsonBuilder().create();
                        List<MatchDto> matchDtos = gson.fromJson(json, new TypeToken<ArrayList<MatchDto>>() {
                        }.getType());

                        InputStream is2 = assets.open("heroes.json");
                        int size2 = is2.available();

                        byte[] buffer2 = new byte[size2];

                        is2.read(buffer2);

                        is2.close();

                        String json2 = new String(buffer2, "UTF-8");
                        List<HeroDto> heroDtos = gson.fromJson(json2, new TypeToken<ArrayList<HeroDto>>() {
                        }.getType());

                        return new InfoHolder(matchDtos, heroDtos);
                    }
                })
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<InfoHolder>() {
                    @Override
                    public void accept(InfoHolder infoHolder) throws Exception {
                        recyclerView.setAdapter(new MatchHistoryAdapter(infoHolder.matchDtos, infoHolder.heroDtos));
                    }
                });


        return rootView;
    }

    private class InfoHolder {
        List<MatchDto> matchDtos;
        SparseArray<HeroDto> heroDtos;

        public InfoHolder(List<MatchDto> matchDtos, List<HeroDto> heroDtos) {
            this.matchDtos = matchDtos;
            this.heroDtos = new SparseArray<>();
            for (HeroDto heroDto : heroDtos) {
                this.heroDtos.put(heroDto.getId(), heroDto);
            }

        }
    }
}
