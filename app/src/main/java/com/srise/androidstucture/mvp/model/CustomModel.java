package com.srise.androidstucture.mvp.model;

import com.srise.androidstucture.mvp.presenter.IPresenter;
import com.srise.androidstucture.mvp.presenter.MyCustomPresenter;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;

public class CustomModel implements IPresenter.ICustomPresenter.ICustomModel {
    private MyCustomPresenter mMyCustomPresenter;

    public CustomModel(MyCustomPresenter mCustomPresenter) {
        mMyCustomPresenter = mCustomPresenter;
    }

    @Override
    public void getTxt() {
        Flowable.just("Hello world").subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Throwable {
                mMyCustomPresenter.receiveTxt(s);
            }
        });
    }
}
