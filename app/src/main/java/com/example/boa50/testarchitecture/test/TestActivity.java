package com.example.boa50.testarchitecture.test;

import android.os.Bundle;

import com.example.boa50.testarchitecture.R;
import com.example.boa50.testarchitecture.util.ActivityUtils;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class TestActivity extends DaggerAppCompatActivity {
    @Inject
    TestFragment testFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_act);

        ActivityUtils.addFragmentToActivity(
                getSupportFragmentManager(),
                testFragment,
                R.id.conteudo_frame
        );
    }
}
