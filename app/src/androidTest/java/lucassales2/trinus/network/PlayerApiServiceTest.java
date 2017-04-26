package lucassales2.trinus.network;

import org.junit.Test;

import io.reactivex.functions.BiConsumer;
import io.reactivex.observers.TestObserver;
import lucassales2.trinus.network.response.PlayerResponse;

import static org.junit.Assert.*;

/**
 * Created by Lucas Sales on 20/04/2017.
 */
public class PlayerApiServiceTest {
    @Test
    public void getPlayerById() throws Exception {
        PlayerApiService playerApiService = ApiServiceGenerator.generateService(PlayerApiService.class);
        playerApiService.getPlayerById(40803012)
                .subscribe(new BiConsumer<PlayerResponse, Throwable>() {
                    @Override
                    public void accept(PlayerResponse playerResponse, Throwable throwable) throws Exception {

                    }
                });
    }


}