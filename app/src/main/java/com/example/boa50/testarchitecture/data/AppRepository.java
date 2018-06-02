package com.example.boa50.testarchitecture.data;

import com.example.boa50.testarchitecture.data.entity.Test;

import java.util.List;
import java.util.concurrent.Executors;

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

    @Override
    public Flowable<Test> getFirstTest() {
        return mDb.testDao().loadFirstTest();
    }

    @Override
    public void initializeDatabase() {
        Test[] tests = new Test[] {
                new Test("1", "primeiro"),
                new Test("2", "segundo"),
                new Test("3", "terceiro")
        };
        Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
            @Override
            public void run() {
                mDb.testDao().deleteAll();
                mDb.testDao().insertAll(tests);
            }
        });
    }
}
