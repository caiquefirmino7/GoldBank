package com.example.goldbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.goldbank.databinding.ActivityMenuBinding;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        getSupportActionBar().hide();



    }

    @Override
    public void onClick(View v){

        int id = v.getId();



    }
}