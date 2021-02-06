package com.example.a1hw6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class ThirdFragmentOne extends Fragment {
    SwitchCompat switchCompat;
    Boolean aBoolean = false;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        switchCompat = view.findViewById(R.id.swiiitch);
        ThirdFragmentOne one = new ThirdFragmentOne();
        ThirdFragmentTwo two = new ThirdFragmentTwo();
        switchCompat.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.one,two);
                transaction.commit();
            }


            });
        switchCompat.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.one,two);
                transaction.commit();

                return false;
            }
        });
    }


}
