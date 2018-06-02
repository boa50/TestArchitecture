package com.example.boa50.testarchitecture.test;

import com.example.boa50.testarchitecture.BaseView;
import com.example.boa50.testarchitecture.data.AppDataSource;
import com.example.boa50.testarchitecture.util.schedulers.BaseSchedulerProvider;

import javax.inject.Inject;

public class TestPresenter implements TestContract.Presenter {

    private final AppDataSource mAppDataSource;

    private final BaseSchedulerProvider mSchedulerProvider;

    private TestContract.View mView;

    @Inject
    TestPresenter(AppDataSource appDataSource, BaseSchedulerProvider schedulerProvider) {
        mAppDataSource = appDataSource;
        mSchedulerProvider = schedulerProvider;
    }

    @Override
    public void subscribe(BaseView view) {
        mView = (TestContract.View) view;
    }

    @Override
    public void unsubscribe() {
        mView = null;
    }
}
