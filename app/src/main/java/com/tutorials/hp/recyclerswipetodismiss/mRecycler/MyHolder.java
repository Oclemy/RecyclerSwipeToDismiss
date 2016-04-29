package com.tutorials.hp.recyclerswipetodismiss.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.recyclerswipetodismiss.R;

/**
 * Created by Oclemmy on 4/29/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class MyHolder extends RecyclerView.ViewHolder {

    TextView nametxt;
    ImageView img;

    public MyHolder(View itemView) {
        super(itemView);

        this.nametxt= (TextView) itemView.findViewById(R.id.nameTxt);
        this.img= (ImageView) itemView.findViewById(R.id.movieImage);

    }
}
