package com.awesomeapp.search.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.search.Viewmodel12_1
import com.awesomeapp.search.Activity12_2
import com.awesomeapp.search.Activity12_3
import com.awesomeapp.search.Fragment12_4
import com.awesomeapp.search.Repository12_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.search.Api12_6

@Module
@InstallIn(SingletonComponent::class)
object Module_12 {
    @Provides
    @Singleton
    fun provideRepository12_5(
        api0: Api4_6 = Api4_6(),
        api1: Api8_6 = Api8_6()
    ): Repository12_5 {
        return Repository12_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi12_6(): Api12_6 {
        return Api12_6()
    }
}