package com.example.boa50.testarchitecture.data.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.example.boa50.testarchitecture.data.entity.Test;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface TestDao {
    @Query("SELECT * FROM Test")
    Flowable<List<Test>> loadTests();

    @Query("SELECT * FROM Test WHERE id = :id")
    Flowable<Test> loadTestById(String id);
}
