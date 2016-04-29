package com.tutorials.hp.recyclerswipetodismiss;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.tutorials.hp.recyclerswipetodismiss.mDataObject.TVShow;
import com.tutorials.hp.recyclerswipetodismiss.mDataObject.TVShowsCollection;
import com.tutorials.hp.recyclerswipetodismiss.mRecycler.MyAdapter;
import com.tutorials.hp.recyclerswipetodismiss.mSwiper.SwipeHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    MyAdapter adapter;
    ArrayList<TVShow> tvShows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        //RECYCLER
        rv= (RecyclerView) findViewById(R.id.mRecycler);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //DATA
        tvShows= TVShowsCollection.getTVShows();

        //ADAPTER
        adapter=new MyAdapter(this,tvShows);
        rv.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, String.valueOf(tvShows.size()), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ItemTouchHelper.Callback callback=new SwipeHelper(adapter);
        ItemTouchHelper helper=new ItemTouchHelper(callback);
        helper.attachToRecyclerView(rv);


    }


}
