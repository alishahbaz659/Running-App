package com.androiddevs.runningappyt.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.androiddevs.runningappyt.R
import com.androiddevs.runningappyt.ui.viewModels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_run.*

/**
 * Created by Alpha on 16,September,2022
 */
@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel:MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.setOnClickListener{
            findNavController().navigate(R.id.action_runFragment_to_trackingFragment)
        }
    }

}