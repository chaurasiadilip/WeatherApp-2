package com.dkc.applaunchh.weatherapp.di

import android.content.Context
import android.content.SharedPreferences
import com.dkc.applaunchh.weatherapp.utils.PreferenceHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
       return PreferenceHelper.customPreference(context)
    }
}