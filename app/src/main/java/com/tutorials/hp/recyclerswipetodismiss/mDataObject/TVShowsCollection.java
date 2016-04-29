package com.tutorials.hp.recyclerswipetodismiss.mDataObject;

import com.tutorials.hp.recyclerswipetodismiss.R;

import java.util.ArrayList;

/**
 * Created by Oclemmy on 4/29/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class TVShowsCollection {

    public static ArrayList<TVShow> getTVShows()
    {
        ArrayList<TVShow> tvShows=new ArrayList<>();
        TVShow tv=new TVShow("Shuttle Carrier", R.drawable.shuttlecarrier);

        tvShows.add(tv);

        tv=new TVShow("Fruits",R.drawable.fruits);
        tvShows.add(tv);

        tv=new TVShow("Breaking Bad",R.drawable.breaking);
        tvShows.add(tv);

        tv=new TVShow("Crisis",R.drawable.crisis);
        tvShows.add(tv);

        tv=new TVShow("Ghost Rider",R.drawable.rider);
        tvShows.add(tv);

        tv=new TVShow("Star Wars",R.drawable.starwars);
        tvShows.add(tv);

        tv=new TVShow("BlackList",R.drawable.red);
        tvShows.add(tv);



        tv=new TVShow("Men In Black",R.drawable.meninblack);
        tvShows.add(tv);

        tv=new TVShow("Game Of Thrones",R.drawable.thrones);
        tvShows.add(tv);

        return tvShows;
    }

}
