package ru.com.bulat.daggerhiltlesson

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent::class)
object MAinModule {

    @Provides
    @Singleton
    fun provideWiFiManager(settings: WiFiSettings) : WiFiManager {

        return WiFiManager(settings)
    }

    @Provides
    fun provideWiFiSettings (): WiFiSettings {
        return WiFiSettings()
    }
}