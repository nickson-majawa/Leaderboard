package com.nmajawa.gads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class learnerAdapter extends RecyclerView.Adapter<learnerAdapter.learnerViewHolder> {
    String[] langData = {};
    private LayoutInflater mLayoutInflater;

    learnerAdapter(String[] _data) {
        langData = _data;
    }
    @NonNull
    @Override
    public learnerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mLayoutInflater = LayoutInflater.from(parent.getContext());
       View view = mLayoutInflater.inflate(R.layout.list_learner, parent, false);
        return new learnerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull learnerViewHolder holder, int position) {
        String title = langData[position];
        holder.title.setText(title);

    }

    @Override
    public int getItemCount() {
        return langData.length;
    }
    public  class learnerViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView title;
        public learnerViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            title = itemView.findViewById(R.id.title);
        }
    }
}
