package com.example.exercise31;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BooklistAdapter extends RecyclerView.Adapter<BooklistAdapter.ViewHolder> {

  //  Controller controller;

    private static String[] titles = {"Foundation", "Heroes Die", "Edge of the Grave", "Solaris", "Saving Missy", "And Then There Where None"};
    private static String[] genres = {"Science Fiction", "Fantasy", "Crime fiction", "Science Fiction", "Feel-good", "Mystery"};
    private static String[] authors = {"Isaac Asimov", "Michael Strover", "Robbie Morrison", "Stanislaw Lem", "beth Morrey", "Agatha Christie", "Keith Stuarth", "J.R.R", "Tolkien"};

    private AuthorFragment authorFragment;

    //A data collection is initialized at the instantation of the adapter
    public BooklistAdapter(){

    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BooklistAdapter.ViewHolder viewHolder, int position){
        String sTitle = titles[position];
        String sGenre = genres[position];
        viewHolder.tvTitle.setText(sTitle);
        viewHolder.tvGenre.setText(sGenre);

    }

    @Override
    public int getItemCount(){
        return titles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tvTitle;
        private TextView tvGenre;

        public ViewHolder(View itemView){
            super(itemView);
            tvTitle = (TextView)itemView.findViewById(R.id.tvTitle);
            tvGenre = (TextView)itemView.findViewById(R.id.tvGenre);
            itemView.setOnClickListener(this);
        }

        public void onClick(View v){
            Log.d("onClick", "CLICK");
            authorFragment.setAuthor(authors[getLayoutPosition()]);     //Get the position from the list which coorespont to the array
            MainActivity.fragmentManager.beginTransaction().replace(R.id.container, new AuthorFragment(), null).commit();
        }

    }

    public void GetComponents(AuthorFragment authorFragment){
        this.authorFragment = authorFragment;
    }

    //public void setController(Controller controller){
       // this.controller = controller;
   // }

}
