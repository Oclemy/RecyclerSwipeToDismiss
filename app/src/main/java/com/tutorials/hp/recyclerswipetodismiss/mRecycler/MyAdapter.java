package com.tutorials.hp.recyclerswipetodismiss.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclerswipetodismiss.R;
import com.tutorials.hp.recyclerswipetodismiss.mDataObject.TVShow;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 4/29/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<TVShow> tvShows;

    public MyAdapter(Context c, ArrayList<TVShow> tvShows) {
        this.c = c;
        this.tvShows = tvShows;
    }

    //INITIALIE VH
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        MyHolder holder=new MyHolder(v);
        return holder;
    }

    //BIND DATA
    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.nametxt.setText(tvShows.get(position).getName());
        holder.img.setImageResource(tvShows.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return tvShows.size();
    }

    //DISMISS
    public void dismissTVShow(int pos)
    {
        tvShows.remove(pos);
        this.notifyItemRemoved(pos);
    }
}
