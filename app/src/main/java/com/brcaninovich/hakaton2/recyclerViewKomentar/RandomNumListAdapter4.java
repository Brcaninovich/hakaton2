package com.brcaninovich.hakaton2.recyclerViewKomentar;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.brcaninovich.hakaton2.R;
import com.brcaninovich.hakaton2.UserDataFetch;
import com.brcaninovich.hakaton2.recyclerViewOcjene.RecyclerViewHolderOcjene;

import java.util.Random;

public class RandomNumListAdapter4 extends RecyclerView.Adapter<RecyclerViewHolderKomentar> {
    private Random random;
    private Integer brojac = 0;




    public RandomNumListAdapter4(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.recyler_view_row_komentar;
    }

    @NonNull
    @Override
    public RecyclerViewHolderKomentar onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new RecyclerViewHolderKomentar(view);
    }


    String vrati_string(String[] string,int broj){

        if(broj >= string.length) {
            return  "";
        }else{
            return  string[broj];
        }
    }




    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolderKomentar holder, int position) {

        //holder.getView().setText(String.valueOf(random.nextInt()));
            String[] stringArr = UserDataFetch.komentari.get(brojac).split(",");

            if(stringArr[0].equals("Ukor")){
                holder.getView3().setCardBackgroundColor(Color.parseColor("#FFF43D3D"));
                holder.getView().setTextColor(Color.WHITE);
                holder.getView2().setTextColor(Color.WHITE);
            }else if(stringArr[0].equals("Sugestija")){
                holder.getView3().setCardBackgroundColor(Color.parseColor("#FFF43D3D"));
            }

                holder.getView().setText(stringArr[0]);
                holder.getView2().setText(stringArr[1]);



            brojac++;
    }

    @Override
    public int getItemCount() {
        return UserDataFetch.komentari.size();
    }
}