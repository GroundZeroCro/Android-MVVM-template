package com.groundzero.goride.api

import com.groundzero.goride.features.employees.data.EmployeesModel
import retrofit2.Response
import retrofit2.http.GET

interface EmployeesApi {

    @GET("employees")
    suspend fun getData(): Response<EmployeesModel>

    companion object {
        const val BASE_URL = "https://dummy.restapiexample.com/api/v1/"
    }
}