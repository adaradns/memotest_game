package com.adaradenis.tpfinalutn;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adara on 4/21/2017.
 */
public class MyAdapter extends RecyclerView.Adapter {

    private ArrayList<Level> levels;

    public MyAdapter(ArrayList<Level> levels){
        this.levels = levels;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        RecyclerView.ViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Level level = this.levels.get(position);

        View v = holder.itemView;

        TextView txtNombre = (TextView) v.findViewById(R.id.txtNombre);
        TextView txtDificultad = (TextView) v.findViewById(R.id.txtDificultad);

        txtNombre.setText(level.getNombre());
        txtDificultad.setText(level.getDificultad());

    }

    @Override
    public int getItemCount() {
        return levels.size();
    }
}
