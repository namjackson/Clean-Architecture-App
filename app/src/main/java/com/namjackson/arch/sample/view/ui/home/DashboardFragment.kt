package com.namjackson.arch.sample.view.ui.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.namjackson.arch.sample.R
import com.namjackson.arch.sample.databinding.DashboardFragmentBinding
import com.namjackson.arch.sample.view.base.BaseFragment

class DashboardFragment :
    BaseFragment<DashboardFragmentBinding>(R.layout.dashboard_fragment) {

    private lateinit var viewModel: DashboardViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = DashboardFragment()
    }
}
