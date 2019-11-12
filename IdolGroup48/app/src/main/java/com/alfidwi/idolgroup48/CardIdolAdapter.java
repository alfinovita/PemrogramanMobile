package com.alfidwi.idolgroup48;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardIdolAdapter extends RecyclerView.Adapter<CardIdolAdapter.ListViewHolder>
{
    private ArrayList<Idol> listIdol;
    private Context context;

    public CardIdolAdapter(Context context, ArrayList<Idol> listIdol){
        this.listIdol = listIdol;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_idol,
                parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardIdolAdapter.ListViewHolder holder, int position) {
        final Idol idol = listIdol.get(position);
        Glide.with(holder.itemView.getContext())
                .load(idol.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);

        holder.tvName.setText(idol.getName());
        holder.tvDesc.setText(idol.getDescription());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailIdol = new Intent(context, DetailListIdol.class);
                detailIdol.putExtra("idol_id", idol.getId());
                context.startActivity(detailIdol);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listIdol.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_idol_list);
            tvName = itemView.findViewById(R.id.name_idol_list);
            tvDesc = itemView.findViewById(R.id.desc_idol_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}