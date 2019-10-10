package com.alfidwi.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ExplicitActivity extends AppCompatActivity {

    String var_input;
    EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        input = (EditText) findViewById(R.id.edt_polines);

        Button submit = (Button) findViewById(R.id.btn_hal2);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var_input = input.getText().toString();
                Intent i = null;
                i = new Intent(ExplicitActivity.this, ExplicithalActivity.class);
                Bundle b = new Bundle();
                b.putString("parse_input", var_input);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }

    }
