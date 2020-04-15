package com.srise.androidstucture.mvp.presenter;

public class MyCustomPresenter<M extends IPresenter.ICustomPresenter.ICustomModel, V extends IPresenter.ICustomPresenter.ICustomView> implements IPresenter.ICustomPresenter {
    private M mModel;
    private V mView;

    public void setModel(M model) {
        mModel = model;
    }

    public void setView(V view) {
        mView = view;
    }

    @Override
    public void showText() {
        mModel.getTxt();
    }

    @Override
    public void receiveTxt(String str) {
        mView.setTxt(str);
    }
}
