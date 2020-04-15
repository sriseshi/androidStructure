package com.srise.androidstucture.mvvm.view;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.srise.androidstucture.R;
import com.srise.androidstucture.databinding.ActivityMainMvvcBinding;
import com.srise.androidstucture.mvvm.viewModel.MyViewModel;

public class MVVCActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainMvvcBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main_mvvc);
        final MyViewModel myViewModel = new MyViewModel();

        binding.setMyViewModel(myViewModel);

        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.click();
            }
        });
    }
}
