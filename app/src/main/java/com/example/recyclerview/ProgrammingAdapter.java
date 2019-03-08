package com.example.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private String[] data;
    public ProgrammingAdapter(String[] data) {
     this.data=data;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup Parent, int ViewType) {
        LayoutInflater inflater=LayoutInflater.from(Parent.getContext());
        View view=inflater.inflate(R.layout.list_item_layout,Parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.txttitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView ImgIcon;
        TextView txttitle;


       public ProgrammingViewHolder(@NonNull View itemView) {
           super(itemView);
           ImgIcon=itemView.findViewById(R.id.ImageIcon);
           txttitle=itemView.findViewById(R.id.texttitle);
       }
   }
}
