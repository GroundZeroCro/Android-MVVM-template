package com.groundzero.goride.di.coremodules

import com.groundzero.goride.di.modules.RemoteModule
import com.groundzero.goride.di.modules.ViewModelModule
import dagger.Module

@Module(includes = [RemoteModule::class, ViewModelModule::class])
interface AppModule