package com.example.boa50.testarchitecture.test;

import com.example.boa50.testarchitecture.BaseView;
import com.example.boa50.testarchitecture.data.AppDataSource;

import javax.inject.Inject;

public class TestPresenter implements TestContract.Presenter {

    private final AppDataSource mAppDataSource;

    @Inject
    TestPresenter(AppDataSource appDataSource) {
        mAppDataSource = appDataSource;
    }

    @Override
    public void subscribe(BaseView view) {

    }

    @Override
    public void unsubscribe() {

    }
}
