// Generated by Dagger (https://dagger.dev).
package com.androiddevs.runningappyt.ui.viewModels;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StatisticsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static StatisticsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(StatisticsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final StatisticsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new StatisticsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}