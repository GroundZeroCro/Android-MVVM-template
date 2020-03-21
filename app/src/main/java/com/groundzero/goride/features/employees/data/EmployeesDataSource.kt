package com.groundzero.goride.features.employees.data

import com.groundzero.goride.api.BaseDataSource
import com.groundzero.goride.api.EmployeesApi
import javax.inject.Inject

class EmployeesDataSource @Inject constructor(private val api: EmployeesApi): BaseDataSource() {
    suspend fun fetchThemes() = getResult{api.getData()}
}