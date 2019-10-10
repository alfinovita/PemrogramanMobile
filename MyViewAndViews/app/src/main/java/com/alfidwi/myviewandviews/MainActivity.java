package com.alfidwi.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnDonasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }
        btnDonasi = findViewById(R.id.Donasi);
        btnDonasi.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent donasi = new Intent(MainActivity.this, DonasiActivity.class);
        startActivity(donasi);
    }
}
