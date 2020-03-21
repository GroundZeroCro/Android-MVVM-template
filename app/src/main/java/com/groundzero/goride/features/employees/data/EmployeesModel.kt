package com.groundzero.goride.features.employees.data

import com.google.gson.annotations.SerializedName

data class EmployeesModel(
    @SerializedName("status")
    val status: String,
    @SerializedName("data")
    val data: List<Any>
)