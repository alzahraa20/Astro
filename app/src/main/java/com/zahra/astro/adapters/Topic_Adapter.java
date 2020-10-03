package com.zahra.astro.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zahra.astro.R;
import com.zahra.astro.data.Topic_Item;

import java.util.ArrayList;

public class Topic_Adapter extends RecyclerView.Adapter<Topic_Adapter.TopicViewHolder> {
    ArrayList<Topic_Item> list;
    OnTopicClick onTopicClick;

    public Topic_Adapter(ArrayList<Topic_Item> topicList,OnTopicClick onTopicClick) {
        this.list = topicList;
        this.onTopicClick = onTopicClick;
    }




    @NonNull
    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_custom,null,false);
        TopicViewHolder topicViewHolder = new TopicViewHolder(view);
        return topicViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TopicViewHolder holder, final int position) {
        Topic_Item item = list.get(position);
        holder.item_iv.setImageResource(item.getTopic_image());
        holder.item_tv.setText(item.getTopic_name());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    onTopicClick.OnClick(position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class TopicViewHolder extends RecyclerView.ViewHolder{
        ImageView item_iv;
        TextView item_tv;

        public TopicViewHolder(@NonNull View itemView) {
            super(itemView);
            item_iv = itemView.findViewById(R.id.topic_iv);
            item_tv = itemView.findViewById(R.id.topic_tv);
        }
    }

    public interface OnTopicClick{
        void OnClick(int pos);
    }
}
