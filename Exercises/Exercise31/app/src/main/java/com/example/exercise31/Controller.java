package com.example.exercise31;

import android.widget.TextView;

public class Controller {

    public BookFragment bFragment;
    public AuthorFragment aFragment;

    public Controller(BookFragment bFragment, AuthorFragment aFragment){
        this.bFragment = bFragment;
        this.aFragment = aFragment;
    }

    /*
    public void setTitle(String s){

    }

    public void setGenre(String s){

    }
    */

    public void setAuthor(String s){
        TextView v = aFragment.getView().findViewById(R.id.tvAuthor);
        v.setText(s);

    }


}
