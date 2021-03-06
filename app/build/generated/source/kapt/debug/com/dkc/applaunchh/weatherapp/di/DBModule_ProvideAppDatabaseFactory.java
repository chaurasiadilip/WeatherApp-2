// Generated by Dagger (https://dagger.dev).
package com.dkc.applaunchh.weatherapp.di;

import android.content.Context;
import com.dkc.applaunchh.weatherapp.db.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DBModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> contextProvider;

  public DBModule_ProvideAppDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(contextProvider.get());
  }

  public static DBModule_ProvideAppDatabaseFactory create(Provider<Context> contextProvider) {
    return new DBModule_ProvideAppDatabaseFactory(contextProvider);
  }

  public static AppDatabase provideAppDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DBModule.INSTANCE.provideAppDatabase(context));
  }
}
