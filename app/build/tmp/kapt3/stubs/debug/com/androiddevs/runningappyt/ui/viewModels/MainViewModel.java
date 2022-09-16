package com.androiddevs.runningappyt.ui.viewModels;

import java.lang.System;

/**
 * Created by Alpha on 16,September,2022
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/androiddevs/runningappyt/ui/viewModels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/androiddevs/runningappyt/repositories/MainRepository;", "(Lcom/androiddevs/runningappyt/repositories/MainRepository;)V", "getMainRepository", "()Lcom/androiddevs/runningappyt/repositories/MainRepository;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.androiddevs.runningappyt.repositories.MainRepository mainRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.androiddevs.runningappyt.repositories.MainRepository getMainRepository() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.androiddevs.runningappyt.repositories.MainRepository mainRepository) {
        super();
    }
}