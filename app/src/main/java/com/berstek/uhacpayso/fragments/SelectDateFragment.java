package com.berstek.uhacpayso.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.berstek.uhacpayso.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectDateFragment extends Fragment {

    public SelectDateFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_select_date, container, false);


        return view;
    }
}
