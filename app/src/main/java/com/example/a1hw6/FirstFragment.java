package com.example.a1hw6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    RecyclerView recyclerView;
    AdapterExchange adapter;
    ArrayList<Label> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        adapter =new AdapterExchange(this);
        recyclerView.setAdapter(adapter);
        list = new ArrayList<Label>();
        list.add(0,new Label("USA","USD",89));
        list.add(1,new Label("EURO","EUR",120));
        list.add(2,new Label("KGS","SOM",89));
        list.add(3,new Label("KOR","WON",1200));
        list.add(4,new Label("JAP","YEN",105));
        list.add(5,new Label("CAN","CAN$",2));
        adapter.addText(list);
    }
}