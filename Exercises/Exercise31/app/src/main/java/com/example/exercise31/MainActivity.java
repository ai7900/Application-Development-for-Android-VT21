package com.example.exercise31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private String[] content = {"test", "test2", "test3"};

    @Override
    /*
    * If you save the state of the application in a bundle,
    * it can be passed back to onCreate if the activity needs
    * to be recreated so that you don't lose this prior information.
    * If no data was supplied, savedInstanceState is null.
    */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
    }

    private void initializeComponents(){

        FragmentManager fm = getSupportFragmentManager();
        BookFragment booksFrag = (BookFragment)fm.findFragmentById(R.id.fragment);
        AuthorFragment authorFrag = (AuthorFragment)fm.findFragmentById(R.id.fragment2);

        Controller controller = new Controller(booksFrag, authorFrag);
        booksFrag.setController(controller);
        //rView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content));

    }


}