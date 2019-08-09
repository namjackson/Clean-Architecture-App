package com.namjackson.arch.sample.view.ui.detail

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.namjackson.arch.sample.R
import com.namjackson.arch.sample.databinding.DetailFragmentBinding
import com.namjackson.arch.sample.view.base.BaseFragment

class DetailFragment :
    BaseFragment<DetailFragmentBinding>(R.layout.detail_fragment) {

    private lateinit var viewModel: DetailViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = DetailFragment()
    }

}
