package com.fm_example.roulette;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class AnbayashiViewHolder extends RecyclerView.ViewHolder {


    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public AnbayashiViewHolder(View v) {
        super(v);
        this.base = v;
        this.textViewNumber = (TextView) v.findViewById(R.id.number);
        this.textViewComment = (TextView) v.findViewById(R.id.comment);
    }

}
