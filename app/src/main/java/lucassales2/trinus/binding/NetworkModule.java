package lucassales2.trinus.binding;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lucassales2.trinus.network.ApiServiceGenerator;
import lucassales2.trinus.network.MatchApiService;
import lucassales2.trinus.network.PlayerApiService;
import lucassales2.trinus.network.SearchApiService;

@Module
public class NetworkModule {


    @Provides
    @Singleton
    MatchApiService provideMatchApiService() {
        return ApiServiceGenerator.generateService(MatchApiService.class);
    }

    @Provides
    @Singleton
    PlayerApiService provideQuoteApiService() {
        return ApiServiceGenerator.generateService(PlayerApiService.class);
    }

    @Provides
    @Singleton
    SearchApiService provideSearchApiService() {
        return ApiServiceGenerator.generateService(SearchApiService.class);
    }


}