package lucassales2.trinus.network;

import java.util.List;

import io.reactivex.Single;
import lucassales2.trinus.network.dto.PlayerWinLoss;
import lucassales2.trinus.network.dto.match.MatchDto;
import lucassales2.trinus.network.response.PlayerResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Lucas Sales on 20/04/2017.
 */

public interface PlayerApiService {

    @GET("players/{account_id}")
    Single<PlayerResponse> getPlayerById(@Path("account_id") int accountId);

    @GET("players/{account_id}/recentmatches")
    Single<List<MatchDto>> getPlayerRecentMatches(@Path("account_id") int accountId);

    @GET("players/{account_id}/wl")
    Single<PlayerWinLoss> getPlayerWinLoss(@Path("account_id") int accountId);


}
