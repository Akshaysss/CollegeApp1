package com.eoneservices.pavan.collegeapp.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eoneservices.pavan.collegeapp.Activities.AdminDrawer;
import com.eoneservices.pavan.collegeapp.R;


public class Approve_HOD_Frag extends Fragment {

    Context context;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    public Approve_HOD_Frag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_approve_hod, container, false);

        ((AdminDrawer) getActivity()).getSupportActionBar().setTitle("Approve HOD");


        return v;
    }


}
