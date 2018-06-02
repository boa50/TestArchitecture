package com.example.boa50.testarchitecture.data;

import com.example.boa50.testarchitecture.data.entity.Test;

import java.util.List;

import javax.inject.Singleton;

import io.reactivex.Flowable;

@Singleton
public interface AppDataSource {
    Flowable<List<Test>> getTests();
    Flowable<Test> getTestById(String id);
    Flowable<Test> getFirstTest();
    void initializeDatabase();
}
