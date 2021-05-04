package com.example.exercise3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class StaticFragment2 extends Fragment{
    @Override

    //Vad är layoutInflater?
    //Vad är Bundle?
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2, container, false);

    }

}
