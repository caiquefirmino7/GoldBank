package com.example.goldbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.goldbank.databinding.ActivityBalanceBinding;

public class Balance extends AppCompatActivity {

    private ActivityBalanceBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityBalanceBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


    }
}