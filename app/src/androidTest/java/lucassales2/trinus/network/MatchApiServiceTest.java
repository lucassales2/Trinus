package lucassales2.trinus.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

import lucassales2.trinus.network.dto.match.MatchDetailDto;

/**
 * Created by Lucas Sales on 20/04/2017.
 */
public class MatchApiServiceTest {

//    @Test
//    public void getMatchById() throws Exception {
//        MatchApiService matchApiService = ApiServiceGenerator.generateService(MatchApiService.class);
//
//
//        matchApiService.getMatchById(3121080943L)
//                .subscribe(new BiConsumer<MatchDetailDto, Throwable>() {
//                    @Override
//                    public void accept(MatchDetailDto matchDto, Throwable throwable) throws Exception {
//
//                    }
//                });
//    }

    @Test
    public void deserializeJson() throws Exception {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("assets/match.json");
        int size = is.available();

        byte[] buffer = new byte[size];

        is.read(buffer);

        is.close();

        String json = new String(buffer, "UTF-8");
        Gson gson = new GsonBuilder().create();
        MatchDetailDto matchDto = gson.fromJson(json, MatchDetailDto.class);
        Assert.assertNotNull(matchDto);
    }


}