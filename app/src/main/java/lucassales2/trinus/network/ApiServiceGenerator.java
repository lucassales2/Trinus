package lucassales2.trinus.network;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lucas Sales on 10/04/2017.
 */

public class ApiServiceGenerator {

    public static final String API_BASE_URL = "https://api.opendota.com/api/";
    private static final Gson gson = new GsonBuilder().create();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson));

    public static <S> S generateService(Class<S> serviceClass) {
        OkHttpClient client =
                new OkHttpClient.Builder()
                        .build();
        Retrofit retrofit = builder.client(client).build();
        return retrofit.create(serviceClass);

    }


}
