package com.hh1995.carrotclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WriteAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<WriteItem> writeItems;

    public WriteAdapter(Context context, ArrayList<WriteItem> writeItems) {
        this.context = context;
        this.writeItems = writeItems;
    }

    public WriteAdapter() {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.home_write,parent,false);
        VH holder=new VH(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh=(VH)holder;
        WriteItem writeItem=writeItems.get(position);
        vh.proName.setText(writeItem.name);
        vh.proPrice.setText(writeItem.price);
        vh.proMeet.setText(writeItem.meet);

        //Glide.with(context).load(writeItem.file).into(vh.proimg);
    }

    @Override
    public int getItemCount() {
        return writeItems.size();
    }

    class VH extends RecyclerView.ViewHolder{

        ImageView proimg;
        TextView proName;
        TextView proMeet;
        TextView proPrice;

        public VH(@NonNull View itemView) {
            super(itemView);

            proimg=itemView.findViewById(R.id.productImg);
            proName=itemView.findViewById(R.id.productName);
            proMeet=itemView.findViewById(R.id.productLocation);
            proPrice=itemView.findViewById(R.id.productPrice);
        }
    }
}
