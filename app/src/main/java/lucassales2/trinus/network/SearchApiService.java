package lucassales2.trinus.network;

import java.util.List;

import io.reactivex.Single;
import lucassales2.trinus.network.dto.SearchDto;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Lucas Sales on 20/04/2017.
 */

public interface SearchApiService {
    @GET("search")
    Single<List<SearchDto>> search(@Query("q") String searchString);
}
