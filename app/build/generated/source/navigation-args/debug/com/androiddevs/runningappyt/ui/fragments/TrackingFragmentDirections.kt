package com.androiddevs.runningappyt.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.androiddevs.runningappyt.R

class TrackingFragmentDirections private constructor() {
  companion object {
    fun actionTrackingFragmentToRunFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_trackingFragment_to_runFragment)
  }
}
