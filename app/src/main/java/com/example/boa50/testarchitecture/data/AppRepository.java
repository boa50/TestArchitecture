package com.example.boa50.testarchitecture.data;

import com.example.boa50.testarchitecture.data.entity.Test;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class AppRepository implements AppDataSource {
    private AppDatabase mDb;

    @Inject
    AppRepository(AppDatabase db) {
        mDb = db;
    }

    @Override
    public Flowable<List<Test>> getTests() {
        return mDb.testDao().loadTests();
    }

    @Override
    public Flowable<Test> getTestById(String id) {
        return mDb.testDao().loadTestById(id);
    }
}
