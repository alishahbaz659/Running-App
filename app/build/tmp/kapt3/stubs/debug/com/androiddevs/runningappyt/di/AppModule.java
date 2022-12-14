package com.androiddevs.runningappyt.di;

import java.lang.System;

/**
 * Created by Alpha on 14,September,2022
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/androiddevs/runningappyt/di/AppModule;", "", "()V", "provideRunDao", "Lcom/androiddevs/runningappyt/db/RunDao;", "db", "Lcom/androiddevs/runningappyt/db/RunningDatabase;", "provideRunningDatabase", "app", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final com.androiddevs.runningappyt.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.androiddevs.runningappyt.db.RunningDatabase provideRunningDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.androiddevs.runningappyt.db.RunDao provideRunDao(@org.jetbrains.annotations.NotNull()
    com.androiddevs.runningappyt.db.RunningDatabase db) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}