// Generated by Dagger (https://dagger.dev).
package com.dkc.applaunchh.weatherapp.userdetail;

import com.dkc.applaunchh.weatherapp.repository.DBRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserDetailViewModel_Factory implements Factory<UserDetailViewModel> {
  private final Provider<DBRepository> dbRepositoryProvider;

  public UserDetailViewModel_Factory(Provider<DBRepository> dbRepositoryProvider) {
    this.dbRepositoryProvider = dbRepositoryProvider;
  }

  @Override
  public UserDetailViewModel get() {
    return newInstance(dbRepositoryProvider.get());
  }

  public static UserDetailViewModel_Factory create(Provider<DBRepository> dbRepositoryProvider) {
    return new UserDetailViewModel_Factory(dbRepositoryProvider);
  }

  public static UserDetailViewModel newInstance(DBRepository dbRepository) {
    return new UserDetailViewModel(dbRepository);
  }
}
