package com.example.boa50.testarchitecture.test;

import com.example.boa50.testarchitecture.BasePresenter;
import com.example.boa50.testarchitecture.BaseView;
import com.example.boa50.testarchitecture.data.entity.Test;

//Contrato para definir as interfaces da view e do presenter
public interface TestContract {

    interface View extends BaseView {
        void mostrarTest(Test test);
    }

    interface Presenter extends BasePresenter {

    }
}
