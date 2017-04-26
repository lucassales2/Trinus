package lucassales2.trinus.network;

import org.junit.Test;

import java.util.List;

import io.reactivex.functions.BiConsumer;
import lucassales2.trinus.network.dto.SearchDto;

import static org.junit.Assert.*;

/**
 * Created by Lucas Sales on 20/04/2017.
 */
public class SearchApiServiceTest {
    @Test
    public void search() throws Exception {
        SearchApiService searchApiService = ApiServiceGenerator.generateService(SearchApiService.class);
        searchApiService.search("Brian").subscribe(new BiConsumer<List<SearchDto>, Throwable>() {
            @Override
            public void accept(List<SearchDto> searchDto, Throwable throwable) throws Exception {

            }
        });
    }

}