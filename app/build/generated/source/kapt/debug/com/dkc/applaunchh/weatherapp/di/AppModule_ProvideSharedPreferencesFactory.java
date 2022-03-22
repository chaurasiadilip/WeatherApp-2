// Generated by Dagger (https://dagger.dev).
package com.dkc.applaunchh.weatherapp.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideSharedPreferencesFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(contextProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideSharedPreferencesFactory(contextProvider);
  }

  public static SharedPreferences provideSharedPreferences(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSharedPreferences(context));
  }
}
