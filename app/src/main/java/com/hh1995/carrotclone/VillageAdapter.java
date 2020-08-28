package com.hh1995.carrotclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class VillageAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<VillageItem> villageItems;

    public VillageAdapter() {
    }

    public VillageAdapter(Context context, ArrayList<VillageItem> villageItems) {
        this.context = context;
        this.villageItems = villageItems;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.village_list,parent,false);
        VH holder=new VH(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh=(VH) holder;
        VillageItem villageItem=villageItems.get(position);
        vh.nick.setText(villageItem.nick);
        vh.question.setText(villageItem.question);
        Glide.with(context).load(villageItem.img).into(vh.cirImg);

    }

    @Override
    public int getItemCount() {
        return villageItems.size();
    }

    class VH extends RecyclerView.ViewHolder{

        CircleImageView cirImg;
        TextView nick;
        TextView question;

        public VH(@NonNull View itemView) {
            super(itemView);
            cirImg=itemView.findViewById(R.id.vilCirImg);
            nick=itemView.findViewById(R.id.vilNick);
            question=itemView.findViewById(R.id.question);
        }
    }
}
