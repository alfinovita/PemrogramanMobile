package com.alfidwi.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExplicithalActivity extends AppCompatActivity {

    TextView input;
    String get_input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicithal);

        input = (TextView) findViewById(R.id.txt_hasil);

        Bundle b = getIntent().getExtras();

        get_input = b.getString("parse_input");

        input.setText(get_input);



    }

 }