package com.groundzero.goride.di.coremodules

import com.groundzero.goride.features.employees.ui.EmployeesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentsModule {
    @ContributesAndroidInjector
    abstract fun contributeThemeFragment(): EmployeesFragment
}