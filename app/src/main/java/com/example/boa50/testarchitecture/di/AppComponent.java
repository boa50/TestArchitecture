package com.example.boa50.testarchitecture.di;

import com.example.boa50.testarchitecture.TestApplication;
import com.example.boa50.testarchitecture.data.DataModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        DataModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class
})
public interface AppComponent extends AndroidInjector<TestApplication>{
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<TestApplication> {}
}
