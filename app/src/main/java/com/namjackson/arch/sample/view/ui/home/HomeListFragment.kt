package com.namjackson.arch.sample.view.ui.home

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.namjackson.arch.sample.R
import com.namjackson.arch.sample.databinding.HomeListFragmentBinding
import com.namjackson.arch.sample.view.base.BaseFragment

class HomeListFragment :
    BaseFragment<HomeListFragmentBinding>(R.layout.home_list_fragment) {

    private lateinit var viewModel: HomeListViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeListViewModel::class.java)
    }

    companion object {
        fun newInstance() = HomeListFragment()
    }

}
