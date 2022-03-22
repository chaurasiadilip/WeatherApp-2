// Generated by Dagger (https://dagger.dev).
package com.dkc.applaunchh.weatherapp.di;

import com.dkc.applaunchh.weatherapp.network.WeatherApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidesWeatherApiFactory implements Factory<WeatherApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvidesWeatherApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WeatherApi get() {
    return providesWeatherApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvidesWeatherApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidesWeatherApiFactory(retrofitProvider);
  }

  public static WeatherApi providesWeatherApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesWeatherApi(retrofit));
  }
}