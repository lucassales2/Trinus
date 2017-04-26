package lucassales2.trinus.ui.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiConsumer;
import io.reactivex.schedulers.Schedulers;
import lucassales2.trinus.R;
import lucassales2.trinus.network.ApiServiceGenerator;
import lucassales2.trinus.network.SearchApiService;
import lucassales2.trinus.network.dto.SearchDto;

/**
 * Created by Lucas Sales on 26/04/2017.
 */

public class SearchPlayerResultFragment extends Fragment {

    private RecyclerView recyclerView;

    public static SearchPlayerResultFragment newInstance(String search) {
        SearchPlayerResultFragment fragment = new SearchPlayerResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("search", search);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search_result, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView_search_result);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        SearchApiService searchApiService = ApiServiceGenerator.generateService(SearchApiService.class);
        searchApiService.search(getArguments().getString("search"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BiConsumer<List<SearchDto>, Throwable>() {
            @Override
            public void accept(List<SearchDto> list, Throwable throwable) throws Exception {
                recyclerView.setAdapter(new SearchPlayerResultAdapter(list));
            }
        });
        return rootView;
    }
}
