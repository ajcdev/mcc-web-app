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

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public projselectscreen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ongproject.
     */
    // TODO: Rename and change types and number of parameters
    public static projselectscreen newInstance(String param1, String param2) {
        projselectscreen fragment = new projselectscreen();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

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
        return inflater.inflate(R.layout.fragment_projselectscreen, container, false);
    }
}