package com.example.boa50.testarchitecture.util.schedulers;

import javax.inject.Singleton;

import io.reactivex.Scheduler;

@Singleton
public interface BaseSchedulerProvider {
    Scheduler computation();
    Scheduler io();
    Scheduler ui();
}
