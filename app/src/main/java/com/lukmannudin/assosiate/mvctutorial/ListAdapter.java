package com.lukmannudin.assosiate.mvctutorial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Model> listData;

    public ListAdapter(Context context, ArrayList<Model> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.poke_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.tvName.setText(listData.get(position).getName());
        viewHolder.tvRarity.setText(listData.get(position).getRarity());
        viewHolder.tvSet.setText(listData.get(position).getSet());
        Glide.with(context)
                .load(listData.get(position).getImage())
                .into(viewHolder.ivPoke);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView ivPoke;
        TextView tvRarity;
        TextView tvSet;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.name);
            tvRarity = itemView.findViewById(R.id.rarity);
            tvSet = itemView.findViewById(R.id.set);
            ivPoke = itemView.findViewById(R.id.ivPoke);
        }
    }
}
