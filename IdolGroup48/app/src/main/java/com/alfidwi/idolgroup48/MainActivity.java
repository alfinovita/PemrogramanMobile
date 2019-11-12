package com.alfidwi.idolgroup48;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView rvIdol;
    private ArrayList<Idol> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("JKT48-Idol");
        }

        rvIdol = findViewById(R.id.rv_idol);
        rvIdol.setHasFixedSize(true);

        list.addAll(IdolData.getListData());
        showRecycleList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    private void showRecycleList() {
        rvIdol.setLayoutManager(new LinearLayoutManager(this));
        CardIdolAdapter cardIdolAdapter = new CardIdolAdapter(this, list);
        rvIdol.setAdapter(cardIdolAdapter);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.profil){
            startActivity(new Intent(MainActivity.this, profil.class));
        }
        return true;
    }

}




