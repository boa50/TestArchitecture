package com.example.boa50.testarchitecture.test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.boa50.testarchitecture.R;
import com.example.boa50.testarchitecture.data.entity.Test;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerFragment;

public class TestFragment extends DaggerFragment implements TestContract.View{

    @Inject
    TestContract.Presenter mPresenter;

    @BindView(R.id.tv_text)
    TextView tvText;

    private Unbinder unbinder;

    @Inject
    public TestFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test_frag, container, false);
        unbinder = ButterKnife.bind(this, view);
        mPresenter.subscribe(this);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void mostrarTest(Test test) {
        tvText.setText(test.getName());
    }
}
