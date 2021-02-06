package com.example.a1hw6;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterExchange extends RecyclerView.Adapter {

    ArrayList<Label>list;


    public AdapterExchange(FirstFragment firstFragment) {

        ArrayList<Label>list = new ArrayList<>();
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void addText(ArrayList<Label> list) {
        ArrayList<Label> label = null;
        list = label;
       notifyDataSetChanged();

        }

    }

