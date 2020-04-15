package com.srise.androidstucture.mvc.model;

public abstract class Model {
    protected ViewCallBack mViewCallBack;

    public Model(ViewCallBack viewCallBack) {
        mViewCallBack = viewCallBack;
    }

    public abstract void showTxt();

    public interface ViewCallBack {
        void showTxt(String text);
    }
}
