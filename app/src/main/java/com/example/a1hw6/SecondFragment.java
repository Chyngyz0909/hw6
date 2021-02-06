package com.example.a1hw6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class SecondFragment extends Fragment {

    TextView textVdate;
    Button change;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        textVdate = view.findViewById(R.id.textVdate);
        change = view.findViewById(R.id.change);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        change = view.findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textVdate.setText(getCurrentDate());
            }
        });

    }

    private String getCurrentDate(){


        Calendar calendar = Calendar. getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE,dd-MMM-yyy hh-mm-ss");
        String dateTime = simpleDateFormat.format(calendar.getTime());

        return dateTime;
    }
}



