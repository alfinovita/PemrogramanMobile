package com.alfidwi.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnGabung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnGabung = findViewById(R.id.BtnRegister);
        btnGabung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent register = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(register);
    }
}
