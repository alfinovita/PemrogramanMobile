package com.alfidwi.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnWebsite;
    Button btnExplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWebsite = findViewById(R.id.btn_web);
        btnWebsite.setOnClickListener(this);

        btnExplicit = findViewById(R.id.intent_explicit);
        btnExplicit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveActtivity = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveActtivity);
                break;
            case R.id.btn_move_data:
                Intent moveWithdata = new Intent (MainActivity.this, MoveActivityWithData.class);
                //moveWithData = object baru
                moveWithdata.putExtra(MoveActivityWithData.EXTRA_NAME, "Alfi DN");
                moveWithdata.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveWithdata);
                break;
            case R.id.btn_dial:
                String phoneNumber = "+6285743805085";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_web:
                String url = "https://www.polines.ac.id/";
                Intent website = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(website);
                break;
            case R.id.intent_explicit:
                Intent intentexplicit = new Intent(MainActivity.this, ExplicitActivity.class);
                startActivity(intentexplicit);
                break;
        }
    }
}
