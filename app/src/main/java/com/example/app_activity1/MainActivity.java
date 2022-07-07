package com.example.app_activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.app_activity1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.txtnombre.getText().toString().length() > 0) {
                    if (binding.txtclave.getText().toString().length() < 5) {
                        binding.txtConfirmacion.setText("Clave minimo 5 digitos");
                    } else {
                        if (binding.txtclave.getText().toString().equals(binding.txtclave2.getText().toString())) {
                            abrir(binding.txtnombre.getText().toString());
                        } else {
                            binding.txtConfirmacion.setText("Contraseñas no coinciden");
                        }
                    }
                } else {
                    binding.txtConfirmacion.setText("Llene todos los campos");
                }
            }
        });
    }

    private void abrir(String user){
        Intent intent = new Intent(this,Activity_detalle.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }


}