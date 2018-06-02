package com.example.boa50.testarchitecture.test;

import com.example.boa50.testarchitecture.di.ActivityScoped;
import com.example.boa50.testarchitecture.di.FragmentScoped;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class TestModule {
    @FragmentScoped
    @ContributesAndroidInjector
    abstract TestFragment testFragment();

    @ActivityScoped
    @Binds
    abstract TestContract.Presenter presenter(TestPresenter testPresenter);
}
