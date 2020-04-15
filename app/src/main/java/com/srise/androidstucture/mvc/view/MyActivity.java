package com.srise.androidstucture.mvc.view;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.srise.androidstucture.R;
import com.srise.androidstucture.mvc.controler.Controller;
import com.srise.androidstucture.mvc.controler.MyController;
import com.srise.androidstucture.mvc.model.Model;
import com.srise.androidstucture.mvc.model.MyModel;

public class MyActivity extends BaseActivity {
    @Override
    public void init() {
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mController.showTxt();
            }
        });
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main_mvc;
    }

    @Override
    public Controller getController() {
        Controller controller = new MyController();
        Model model = new MyModel(this);
        controller.setMyModel(model);
        return controller;
    }

    @Override
    public void showTxt(String text) {
        ((TextView) findViewById(R.id.txt)).setText(text);
    }
}
