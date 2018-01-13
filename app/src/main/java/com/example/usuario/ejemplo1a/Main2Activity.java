package com.example.usuario.ejemplo1a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.tv_nombre)
    TextView tvNombre;
String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.actividad2);
        ButterKnife.bind(this);


        nombre=getIntent().getExtras().getString("nombre");

        tvNombre.setText(nombre);

    }
}
