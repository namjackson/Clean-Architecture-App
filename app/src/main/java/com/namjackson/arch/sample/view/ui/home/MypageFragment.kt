package com.namjackson.arch.sample.view.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.namjackson.arch.sample.R
import com.namjackson.arch.sample.databinding.HomeListFragmentBinding
import com.namjackson.arch.sample.databinding.MypageFragmentBinding
import com.namjackson.arch.sample.view.base.BaseFragment

class MypageFragment  :
    BaseFragment<MypageFragmentBinding>(R.layout.mypage_fragment) {

    private lateinit var viewModel: MypageViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MypageViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = MypageFragment()
    }
}
