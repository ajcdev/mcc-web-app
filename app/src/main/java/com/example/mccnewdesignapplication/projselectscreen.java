package com.example.mccnewdesignapplication;

import android.media.Image;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class projselectscreen extends Fragment {

    CardView btnComp;
    CardView btnOng;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_compproject, container, false);

        btnComp = (CardView) getView().findViewById(R.id.compProj);
        btnOng = (CardView) getView().findViewById(R.id.ongProj);

        btnComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment compFrag = new compproject();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.fragmentContainerView2, compFrag).commit();
            }
        });

        btnOng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment ongFrag = new compproject();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.fragmentContainerView2, ongFrag).commit();
            }
        });


        return view;
    }
}