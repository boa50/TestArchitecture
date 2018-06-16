package com.example.boa50.testarchitecture.di;

import com.example.boa50.testarchitecture.MainActivity;
import com.example.boa50.testarchitecture.test.TestActivity;
import com.example.boa50.testarchitecture.test.TestModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = TestModule.class)
    abstract TestActivity testActivity();
}
