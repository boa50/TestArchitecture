package com.example.boa50.testarchitecture.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.boa50.testarchitecture.data.dao.TestDao;
import com.example.boa50.testarchitecture.data.entity.Test;

@Database(entities = {Test.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract TestDao testDao();
}
