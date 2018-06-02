package com.example.boa50.testarchitecture;

//Interface padrão para todos os presenters da aplicação
public interface BasePresenter {
    //Métodos para a utilização junto ao RxJava
    void subscribe(BaseView view);
    void unsubscribe();
}
