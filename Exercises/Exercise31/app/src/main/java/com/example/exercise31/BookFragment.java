package com.example.exercise31;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;


public class BookFragment extends Fragment {

    RecyclerView rView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View view = inflater.inflate(R.layout.fragment_booklist, container, false);
        Context context = view.getContext();

        rView = (RecyclerView)view.findViewById(R.id.rView);
        rView.setLayoutManager(new LinearLayoutManager(context));
        BooklistAdapter adapter = new BooklistAdapter();
        rView.setAdapter(adapter);

        return view;
    }

    public void setController(Controller controller){
        BooklistAdapter adapter = (BooklistAdapter) rView.getAdapter();
        adapter.setController(controller);
    }

}
