package com.srise.androidstucture.mvvm.model;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;

public class Model {
    private int mClick = 0;
    private CallBack mCallBack;

    public Model(CallBack callBack) {
        mCallBack = callBack;
    }

    public void click() {
        Flowable.just(mClick).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer s) throws Throwable {
                mCallBack.receiveClickTime(mClick++);
            }
        });
    }

    public interface CallBack {
        void receiveClickTime(int i);
    }
}
