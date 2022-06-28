package com.example.leeson15m.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;

import com.example.leeson15m.R;
import com.example.leeson15m.databinding.ActivityMainBinding;
import com.example.leeson15m.model.view.Contract;
import com.example.leeson15m.model.view.Injector.Injector;
import com.example.leeson15m.presenter.Presenter;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements Contract.CounterView {

    private ActivityMainBinding binding;
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getPresenter();
        presenter.attach(this);
        updateTv();
    }

    private void updateTv() {

        binding.btnIncrement.setOnClickListener(v -> {
            presenter.modelIncrement();

        });

        binding.btnDecrement.setOnClickListener(v -> {
            presenter.modelDecrement();
        });

    }


    @Override
    public void updateText(int count) {

        binding.txtTv.setText(String.valueOf(count));

    }

    @Override
    public void showFirstToast() {

            Toasty.custom(this, "Поздравляю, вы достигли числа 10",
                     ContextCompat.getDrawable(this, R.drawable.ic_baseline_check_24),
                    ContextCompat.getColor(this, android.R.color.black),
                    ContextCompat.getColor(this, android.R.color.holo_orange_dark),
                    Toasty.LENGTH_SHORT, true, true).show();
            Toasty.Config.reset();
    }

    @Override
    public void showToast(int green) {

        Toasty.custom(this, "Поздравляю, вы достигли числа 15",
                ContextCompat.getDrawable(this, R.drawable.ic_baseline_check_24),
                ContextCompat.getColor(this, android.R.color.black),
                ContextCompat.getColor(this, android.R.color.holo_green_dark),
                Toasty.LENGTH_SHORT, true, true).show();
        Toasty.Config.reset();
        binding.txtTv.setTextColor(green);
    }

}