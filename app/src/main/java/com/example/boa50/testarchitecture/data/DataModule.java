package com.example.boa50.testarchitecture.data;

import android.arch.persistence.room.Room;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DataModule {
    @Singleton
    @Provides
    static AppDatabase providerAppDatabase(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "AppDatabase.db").build();
    }

    @Singleton
    @Binds
    abstract AppDataSource appDataSource(AppRepository appRepository);
}
