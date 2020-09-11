package com.nmajawa.gads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class skillAdapter extends RecyclerView.Adapter<skillAdapter.skillViewHolder> {
    String[] langData = {};
    private LayoutInflater mLayoutInflater;

    skillAdapter(String[] _data) {
        langData = _data;
    }

    @NonNull
    @Override
    public skillViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mLayoutInflater = LayoutInflater.from(parent.getContext());
        View view = mLayoutInflater.inflate(R.layout.list_skill, parent, false);
        return new skillViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull skillViewHolder holder, int position) {
        String title = langData[position];
        holder.title.setText(title);

    }

    @Override
    public int getItemCount() {
        return langData.length;
    }

    public class skillViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView title;

        public skillViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            title = itemView.findViewById(R.id.title);
        }
    }
}



