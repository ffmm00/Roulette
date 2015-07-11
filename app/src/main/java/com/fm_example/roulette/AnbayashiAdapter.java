package com.fm_example.roulette;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class AnbayashiAdapter extends RecyclerView.Adapter<AnbayashiViewHolder>{

    private ArrayList<AnbayashiData> rouletteDataSet;
    public AnbayashiAdapter(ArrayList<AnbayashiData> roulette){
        this.rouletteDataSet=roulette;
    }

    public AnbayashiViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent,false);

        return new AnbayashiViewHolder(view);

    }

    public void onBindViewHolder(final AnbayashiViewHolder holder , final int listPosition) {
        holder.textViewNumber.setText(rouletteDataSet.get(listPosition).getNumber() + "本");
        holder.textViewComment.setText(rouletteDataSet.get(listPosition).getComment());
        holder.base.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "おまけ" + rouletteDataSet.get(listPosition).getAdd() + "本", Toast.LENGTH_SHORT).show();

            }
        });
    }

        public int getItemCount(){
        return rouletteDataSet.size();
    }

}
