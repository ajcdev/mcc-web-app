package com.example.mccnewdesignapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link news_and_updates_screen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class news_and_updates_screen extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public news_and_updates_screen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment news_and_updates_screen.
     */
    // TODO: Rename and change types and number of parameters
    public static news_and_updates_screen newInstance(String param1, String param2) {
        news_and_updates_screen fragment = new news_and_updates_screen();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_news_and_updates_screen, container, false);

        ImageButton btnUpd = view.findViewById(R.id.updatesbtn);
        ImageButton btnNews = view.findViewById(R.id.newsbtn);
        ImageButton btnCal = view.findViewById(R.id.calendarbtn);

        btnUpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, new updates_screen()).addToBackStack(null).commit();
            }
        });

        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, new news()).addToBackStack(null).commit();
            }
        });

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, new calendar_and_events()).addToBackStack(null).commit();
            }
        });

        return view;
    }
}