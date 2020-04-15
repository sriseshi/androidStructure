package com.srise.androidstucture.mvp.view;

import android.view.View;
import android.widget.TextView;

import com.srise.androidstucture.R;
import com.srise.androidstucture.mvp.model.CustomModel;
import com.srise.androidstucture.mvp.presenter.IPresenter;

public class CustomActivity extends BaseCustomActivity<IPresenter.ICustomPresenter.ICustomModel> {

    protected void init() {
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCustomPresenter.showText();
            }
        });
    }

    protected IPresenter.ICustomPresenter.ICustomModel getModel() {
        return new CustomModel(mCustomPresenter);
    }

    protected int getLayout() {
        return R.layout.activity_main_mvp;
    }

    @Override
    public void setTxt(String str) {
        ((TextView) findViewById(R.id.txt)).setText(str);
    }
}
