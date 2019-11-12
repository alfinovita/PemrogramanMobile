package com.alfidwi.idolgroup48;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class profil extends AppCompatActivity {

    private int idol_id;
    ImageView imgDetail;
    private ArrayList<Idol> listidol = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        //idol_id = getIntent().getIntExtra("idol_id", 19);
        //imgDetail = findViewById(R.id.img_profil);

        //listidol.addAll(IdolData.getListData());
        //setLayout();

    }


    //void setLayout(){
      //  Glide.with(this)
        //        .load(listidol.get(idol_id).getPhoto())
          //      .apply(new RequestOptions().fitCenter())
            //    .into(imgDetail);
    }

