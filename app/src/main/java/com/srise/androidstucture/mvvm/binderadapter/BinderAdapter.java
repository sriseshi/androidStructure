package com.srise.androidstucture.mvvm.binderadapter;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class BinderAdapter {
    @BindingAdapter("clickTime")
    public static void my(TextView view, String str) {
        view.setText(String.valueOf(Integer.valueOf(str) * 10));
    }
}
