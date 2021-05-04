package com.example.exercise31;

import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Controller {

    public BookFragment bFragment;
    public AuthorFragment aFragment;

    public Controller(BookFragment bFragment, AuthorFragment aFragment){
        this.bFragment = bFragment;
        this.aFragment = aFragment;
    }

    public void setAuthor(String s){
        TextView v = aFragment.getView().findViewById(R.id.tvAuthor);
        v.setText(s);
    }

}
