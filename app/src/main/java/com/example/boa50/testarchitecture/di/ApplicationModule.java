package com.example.boa50.testarchitecture.di;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.boa50.testarchitecture.TestApplication;
import com.example.boa50.testarchitecture.data.AppDataSource;
import com.example.boa50.testarchitecture.data.AppDatabase;
import com.example.boa50.testarchitecture.data.AppRepository;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ApplicationModule {
    @Binds
    abstract Context bindContext(TestApplication application);
}
