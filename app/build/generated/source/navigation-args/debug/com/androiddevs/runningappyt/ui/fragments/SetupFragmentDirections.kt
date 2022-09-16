package com.androiddevs.runningappyt.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.androiddevs.runningappyt.R

class SetupFragmentDirections private constructor() {
  companion object {
    fun actionSetupFragmentToRunFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_setupFragment_to_runFragment)
  }
}
