package com.groundzero.goride.features.employees.data

import com.groundzero.goride.data.resultLiveData
import javax.inject.Inject


class EmployeesRepository @Inject constructor(private val dataSource: EmployeesDataSource) {
    val employees = resultLiveData(networkCall = {dataSource.fetchEmployees()})
}