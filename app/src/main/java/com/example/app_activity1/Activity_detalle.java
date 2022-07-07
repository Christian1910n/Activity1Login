package com.example.app_activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.app_activity1.databinding.ActivityDetalleBinding;
import com.example.app_activity1.databinding.ActivityMainBinding;

public class Activity_detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetalleBinding binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();

        binding.txtuser.setText(extras.getString("user"));
    }
}