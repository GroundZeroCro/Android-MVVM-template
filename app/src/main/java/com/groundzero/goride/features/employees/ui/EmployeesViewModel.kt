package com.groundzero.goride.features.employees.ui

import androidx.lifecycle.ViewModel
import com.groundzero.goride.features.employees.data.EmployeesRepository
import javax.inject.Inject

class EmployeesViewModel @Inject constructor(repository: EmployeesRepository) : ViewModel() {
    val themes = repository.themes
}