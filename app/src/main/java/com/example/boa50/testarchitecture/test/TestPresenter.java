package com.example.boa50.testarchitecture.test;

import com.example.boa50.testarchitecture.BaseView;
import com.example.boa50.testarchitecture.data.AppDataSource;
import com.example.boa50.testarchitecture.util.schedulers.BaseSchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class TestPresenter implements TestContract.Presenter {

    private final AppDataSource mAppDataSource;

    private final BaseSchedulerProvider mSchedulerProvider;

    private CompositeDisposable mCompositeDisposable;

    private TestContract.View mView;

    @Inject
    TestPresenter(AppDataSource appDataSource, BaseSchedulerProvider schedulerProvider) {
        mAppDataSource = appDataSource;
        mSchedulerProvider = schedulerProvider;

        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void subscribe(BaseView view) {
        mView = (TestContract.View) view;
        getFirstTest();
    }

    @Override
    public void unsubscribe() {
        mCompositeDisposable.clear();
        mView = null;
    }

    private void getFirstTest() {
        mCompositeDisposable.clear();
        Disposable disposable = mAppDataSource.getFirstTest()
                .subscribeOn(mSchedulerProvider.io())
                .observeOn(mSchedulerProvider.ui())
                .subscribe(
                        test -> mView.mostrarTest(test)
                );
        mCompositeDisposable.add(disposable);
    }
}
