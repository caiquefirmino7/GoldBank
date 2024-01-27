package com.example.goldbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.goldbank.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.btnEnter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        String cpf = binding.txtCpf.getText().toString();
        String password = binding.txtPassword.getText().toString();

        if (cpf.isEmpty()) {
            binding.txtCpf.setError("Informe o seu CPF");
        } if (password.isEmpty()) {
            binding.txtPassword.setError("Informe a sua senha");
        } else if(id == R.id.btnEnter){
            Intent intent = new Intent(MainActivity.this, Menu.class);
            startActivity(intent);
        }

        }



    }

