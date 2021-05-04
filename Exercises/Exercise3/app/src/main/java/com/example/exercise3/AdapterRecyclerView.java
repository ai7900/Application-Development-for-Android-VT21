package com.example.exercise3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private String[] mContent;

    public AdapterRecyclerView(String[] content){
        mContent = content;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AdapterRecyclerView.ViewHolder viewHolder, int position){
        String s = mContent[position];
        viewHolder.tvTitle.setText(s);
        viewHolder.tvGenrer.setText(s);
        viewHolder.tvAuthor.setText(s);
    }

    @Override
    public int getItemCount(){
        return mContent.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitle, tvGenrer, tvAuthor;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView)itemView.findViewById(R.id.tvTitle);
            tvGenrer = (TextView)itemView.findViewById(R.id.tvGenrer);
            tvAuthor = (TextView)itemView.findViewById(R.id.tvAuthor);
        }
    }

}
