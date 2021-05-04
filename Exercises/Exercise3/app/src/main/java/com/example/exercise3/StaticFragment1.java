package com.example.exercise3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

public class StaticFragment1 extends Fragment{

    private Button btnOpenFragment;
    public StaticFragment1(){
        // Required empty public constructor
    }

    @Override

    //Vad är layoutInflater?
    //Vad är Bundle?
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment1, container, false);
        InitializeComponents(view);

        return view;
    }

    private void InitializeComponents(View view){

    }

}
