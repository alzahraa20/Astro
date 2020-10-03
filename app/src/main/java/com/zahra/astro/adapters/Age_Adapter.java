package com.zahra.astro.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zahra.astro.R;
import com.zahra.astro.data.Age_Item;

import java.util.ArrayList;

public class Age_Adapter extends RecyclerView.Adapter<Age_Adapter.AgeViewHolder> {
    ArrayList<Age_Item> list;

    public Age_Adapter(ArrayList<Age_Item> list) {
        this.list=list;
    }

    @NonNull
    @Override
    public AgeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.age_custom,null,false);
        AgeViewHolder viewHolder = new AgeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AgeViewHolder holder, int position) {
        Age_Item item = list.get(position);
        holder.planetIv.setImageResource(item.getPlanetImg());
        holder.planetTv.setText(item.getPlanetName());
        holder.yearEt.setText(item.getYearEt());
        holder.dayEt.setText(item.getDayEt());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class AgeViewHolder extends RecyclerView.ViewHolder{
        ImageView planetIv;
        TextView planetTv;
        EditText yearEt;
        EditText dayEt;

        public AgeViewHolder(@NonNull View itemView) {
            super(itemView);
            planetIv = itemView.findViewById(R.id.planet_img);
            planetTv = itemView.findViewById(R.id.planet_name);
            yearEt = itemView.findViewById(R.id.years_et);
            dayEt = itemView.findViewById(R.id.days_et);
        }
    }
}
