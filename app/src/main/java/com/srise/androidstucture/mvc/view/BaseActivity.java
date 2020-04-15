package com.srise.androidstucture.mvc.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.srise.androidstucture.mvc.controler.Controller;
import com.srise.androidstucture.mvc.model.Model;

public abstract class BaseActivity extends AppCompatActivity implements Model.ViewCallBack {
    protected Controller mController;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mController = getController();
        init();
    }

    public abstract void init();

    public abstract int getLayout();

    public abstract Controller getController();

    @Override
    public void showTxt(String text) {

    }
}
