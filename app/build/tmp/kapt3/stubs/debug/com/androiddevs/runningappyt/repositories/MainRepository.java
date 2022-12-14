package com.androiddevs.runningappyt.repositories;

import java.lang.System;

/**
 * Created by Alpha on 16,September,2022
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\rJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\rJ\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/androiddevs/runningappyt/repositories/MainRepository;", "", "runDao", "Lcom/androiddevs/runningappyt/db/RunDao;", "(Lcom/androiddevs/runningappyt/db/RunDao;)V", "getRunDao", "()Lcom/androiddevs/runningappyt/db/RunDao;", "deleteRun", "", "run", "Lcom/androiddevs/runningappyt/db/Run;", "(Lcom/androiddevs/runningappyt/db/Run;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRunsSortedByAvgSpeed", "Landroidx/lifecycle/LiveData;", "", "getAllRunsSortedByCaloriesBurned", "getAllRunsSortedByDate", "getAllRunsSortedByDistance", "getAllRunsSortedByMillis", "getTotalAvgSpeed", "", "getTotalCaloriesBurned", "", "getTotalDistance", "getTotalTimeInMillis", "", "insertRun", "app_debug"})
public final class MainRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.androiddevs.runningappyt.db.RunDao runDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertRun(@org.jetbrains.annotations.NotNull()
    com.androiddevs.runningappyt.db.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteRun(@org.jetbrains.annotations.NotNull()
    com.androiddevs.runningappyt.db.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.runningappyt.db.Run>> getAllRunsSortedByDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.runningappyt.db.Run>> getAllRunsSortedByDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.runningappyt.db.Run>> getAllRunsSortedByMillis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.runningappyt.db.Run>> getAllRunsSortedByAvgSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.androiddevs.runningappyt.db.Run>> getAllRunsSortedByCaloriesBurned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Float> getTotalAvgSpeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotalDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getTotalCaloriesBurned() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getTotalTimeInMillis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.androiddevs.runningappyt.db.RunDao getRunDao() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.androiddevs.runningappyt.db.RunDao runDao) {
        super();
    }
}