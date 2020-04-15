package com.srise.androidstucture.mvc.model;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;

public class MyModel extends Model {
    public MyModel(ViewCallBack viewCallBack) {
        super(viewCallBack);
    }

    public void showTxt() {
        Flowable.just("Hello world").subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Throwable {
                mViewCallBack.showTxt(s);
            }
        });
    }
}
