package com.brcaninovich.hakaton2.recyclerDataRaspored;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brcaninovich.hakaton2.MainActivityTest;
import com.brcaninovich.hakaton2.R;
import com.brcaninovich.hakaton2.recyclerData.RecyclerViewHolder;

import java.util.Random;

public class RandomNumListAdapter2 extends RecyclerView.Adapter<RecyclerViewHolderRaspored> {
    private Random random;
    private Integer brojac = 0;

    public RandomNumListAdapter2(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.recycler_view_row_raspored;
    }

    @NonNull
    @Override
    public RecyclerViewHolderRaspored onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new RecyclerViewHolderRaspored(view);
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolderRaspored holder, int position) {

        //holder.getView().setText(String.valueOf(random.nextInt()));
            holder.getView().setText("Ponedjeljak");
            holder.getView2().setText("Matematika");
            holder.getView3().setText("Matematika");
            holder.getView4().setText("Matematika");
            holder.getView5().setText("Matematika");
            holder.getView6().setText("Matematika");
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}