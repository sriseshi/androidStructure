package com.srise.androidstucture.mvc.controler;

import com.srise.androidstucture.mvc.model.Model;

public abstract class Controller {
    protected Model mMyModel;

    public void setMyModel(Model myModel) {
        mMyModel = myModel;
    }


    public abstract void showTxt();
}
