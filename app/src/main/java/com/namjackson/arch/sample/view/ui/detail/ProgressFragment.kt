package com.namjackson.arch.sample.view.ui.detail

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.namjackson.arch.sample.R
import com.namjackson.arch.sample.databinding.ProgressFragmentBinding
import com.namjackson.arch.sample.view.base.BaseFragment

class ProgressFragment :
    BaseFragment<ProgressFragmentBinding>(R.layout.progress_fragment) {

    private lateinit var viewModel: ProgressViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ProgressViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = ProgressFragment()
    }

}
