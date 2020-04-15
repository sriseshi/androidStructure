package com.srise.androidstucture.mvvm.viewModel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.srise.androidstucture.BR;
import com.srise.androidstucture.mvvm.model.Model;

public class MyViewModel extends BaseObservable implements Model.CallBack {
    private int mClickTime = 0;
    private Model mModel;

    public MyViewModel() {
        mModel = new Model(this);
    }

    @Bindable
    public String getClickTime() {
        return String.valueOf(mClickTime);
    }

    public void click() {
        mModel.click();
    }

    @Override
    public void receiveClickTime(int i) {
        mClickTime = i;
        notifyPropertyChanged(BR.clickTime);
    }
}
