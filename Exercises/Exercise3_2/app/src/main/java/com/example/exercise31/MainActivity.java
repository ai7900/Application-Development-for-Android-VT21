package com.example.exercise31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    /*
    * If you save the state of the application in a bundle,
    * it can be passed back to onCreate if the activity needs
    * to be recreated so that you don't lose this prior information.
    * If no data was supplied, savedInstanceState is null.
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents(savedInstanceState);
    }

    private void initializeComponents(Bundle savedInstanceState){

        BookFragment bookfragment = new BookFragment();
        AuthorFragment authorfragment = new AuthorFragment();
       // Controller controller = new Controller(bookfragment, authorfragment);

        fragmentManager = getSupportFragmentManager();
        if(findViewById(R.id.container) != null){
            if(savedInstanceState != null)
                return;

            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, bookfragment, null);
            fragmentTransaction.commit();
        }

        authorfragment.GetComponents(bookfragment);
        bookfragment.GetComponents(authorfragment);
       // bookfragment.setController(controller);


/*        fragmentTransaction = fragmentManager.beginTransaction();
        AuthorFragment aFrag = new AuthorFragment();
        fragmentTransaction.add(R.id.fragment2, aFrag, null);
        fragmentTransaction.commit();*/

/*        fragmentTransaction = fragmentManager.beginTransaction();
        BookFragment bFrag = new BookFragment();
        AuthorFragment aFrag = new AuthorFragment();
        fragmentTransaction.add(R.id.fragment, bFrag, null);
        fragmentTransaction.add(R.id.fragment2, aFrag, null);
        fragmentTransaction.commit();*/
    }



}