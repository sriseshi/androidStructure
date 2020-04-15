package com.srise.androidstucture.mvp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.srise.androidstucture.mvp.presenter.IPresenter;
import com.srise.androidstucture.mvp.presenter.MyCustomPresenter;

public abstract class BaseCustomActivity<M extends IPresenter.ICustomPresenter.ICustomModel> extends AppCompatActivity implements IPresenter.ICustomPresenter.ICustomView {
    MyCustomPresenter mCustomPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        init();
        mCustomPresenter = new MyCustomPresenter();
        mCustomPresenter.setModel(getModel());
        mCustomPresenter.setView(this);
    }

    protected abstract void init();

    protected abstract M getModel();

    protected abstract int getLayout();

    @Override
    public void setTxt(String str) {

    }
}
