package com.androiddevs.runningappyt.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.androiddevs.runningappyt.R
import com.androiddevs.runningappyt.ui.viewModels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Alpha on 16,September,2022
 */

@AndroidEntryPoint
class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()

}