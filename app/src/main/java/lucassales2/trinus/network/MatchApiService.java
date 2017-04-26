package lucassales2.trinus.network;

import io.reactivex.Single;
import lucassales2.trinus.network.dto.match.MatchDetailDto;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Lucas Sales on 20/04/2017.
 */

public interface MatchApiService {
    @GET("matches/{match_id}")
    Single<MatchDetailDto> getMatchById(@Path("match_id") long matchId);
}
