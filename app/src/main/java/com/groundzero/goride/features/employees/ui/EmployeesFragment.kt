package com.groundzero.goride.features.employees.ui


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.groundzero.goride.databinding.FragmentRandomBinding
import com.groundzero.goride.di.helper.Injectable
import com.groundzero.goride.di.helper.injectViewModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class EmployeesFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var car: Car

    private lateinit var viewModel: EmployeesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRandomBinding.inflate(inflater, container, false)
        viewModel = injectViewModel(viewModelFactory)
        viewModel.employeesLive.observe(this, Observer { t -> println(t.data) })
        println(car.name())
        return binding.root
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}
