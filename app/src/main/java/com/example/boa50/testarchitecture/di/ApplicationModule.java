package com.example.boa50.testarchitecture.di;

import android.content.Context;

import com.example.boa50.testarchitecture.TestApplication;
import com.example.boa50.testarchitecture.util.schedulers.BaseSchedulerProvider;
import com.example.boa50.testarchitecture.util.schedulers.SchedulerProvider;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ApplicationModule {
    @Binds
    abstract Context bindContext(TestApplication application);

    @Binds
    abstract BaseSchedulerProvider bindBaseSchedulerProvider(SchedulerProvider scheduleProvider);
}
