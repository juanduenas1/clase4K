package com.example.usuario.ejemplo1a;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by usuario on 13/01/2018.
 */

public class BotonesButterknife extends AppCompatActivity {
    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.et_pass)
    EditText etPass;
    @BindView(R.id.btn_ingresa)
    Button btnIngresa;
    @BindView(R.id.btn_facebook)
    Button btnFacebook;
    @BindView(R.id.tv_text)
    TextView tvText;
    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_ingresa, R.id.btn_facebook, R.id.btn_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_ingresa:
                // tvText.setText("INGRESABUTTER");
                Intent intent =new Intent(this,Main2Activity.class);

                intent.putExtra("nombre","Kath");
                startActivity(intent);

                break;
            case R.id.btn_facebook:
                tvText.setText("FACEBOOKBUTTER");
                break;
            case R.id.btn_register:
                tvText.setText("REGISTROBUTTER");
                break;
        }
    }
}
