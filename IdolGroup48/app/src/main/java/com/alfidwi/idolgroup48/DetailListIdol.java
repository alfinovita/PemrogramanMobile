package com.alfidwi.idolgroup48;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListIdol extends AppCompatActivity {

    private int idol_id;

    Toolbar toolbar;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Idol> listidol = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_idol);

        idol_id = getIntent().getIntExtra("idol_id", 0);
        tvName = findViewById(R.id.name_idol);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listidol.addAll(IdolData.getListData());
        setLayout();
    }


    void setLayout(){
        this.setTitle(listidol.get(idol_id).getName());
        tvName.setText(listidol.get(idol_id).getName());
        tvDesc.setText(listidol.get(idol_id).getDescription());
        Glide.with(this)
                .load(listidol.get(idol_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}