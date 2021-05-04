package com.example.exercise31;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class AuthorFragment extends Fragment {

    //Depending on which bookfragment String[pos] the user is clicking, show the author on position pos.

    //public Controller controller;

    public String author;
    private Button bookButton;
    //private View view;

    private BookFragment bFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
       View  view = inflater.inflate(R.layout.fragment_author, container, false);
        bookButton = view.findViewById(R.id.button);
        bookButton.setOnClickListener(buttonListener);

        return view;
    }

    private View.OnClickListener buttonListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            MainActivity.fragmentManager.beginTransaction().replace(R.id.container, bFragment, null).commit();
        }
    };

    public void setAuthor(String s){
        TextView v = this.getView().findViewById(R.id.tvAuthor);
        v.setText(s);
    }

    public void GetComponents(BookFragment bFragment){
        this.bFragment = bFragment;
    }

   /* public void SetController(Controller controller){
        this.controller = controller;
    }*/

}
