package com.zahra.astro.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zahra.astro.R;
import com.zahra.astro.data.Conversation_Item;

import java.util.ArrayList;

public class Conversation_Adapter extends RecyclerView.Adapter<Conversation_Adapter.ConViewHolder> {
    ArrayList<Conversation_Item> list;

    public Conversation_Adapter(ArrayList<Conversation_Item> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ConViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.conversation_custom,null,false);
        ConViewHolder viewHolder = new ConViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ConViewHolder holder, int position) {
        Conversation_Item item = list.get(position);
        holder.textView1.setText(item.getText1());
        holder.textView2.setText(item.getText2());
        holder.icon.setImageResource(R.drawable.astronaut);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ConViewHolder extends RecyclerView.ViewHolder{
        TextView textView1;
        TextView textView2;
        ImageView icon;

        public ConViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
            icon = itemView.findViewById(R.id.text_icon);
        }
    }
}
