package com.androiddevs.runningappyt.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.androiddevs.runningappyt.R

class RunFragmentDirections private constructor() {
  companion object {
    fun actionRunFragmentToTrackingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_runFragment_to_trackingFragment)
  }
}
