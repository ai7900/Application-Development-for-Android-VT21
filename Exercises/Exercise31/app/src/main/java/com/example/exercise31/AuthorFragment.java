package com.example.exercise31;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class AuthorFragment extends Fragment {

    //Depending on which bookfragment String[pos] the user is clicking, show the author on position pos.

    public String author;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_author, container, false);
        return view;
    }

    public void setAuthor(String s){

    }
}
