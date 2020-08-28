package com.hh1995.carrotclone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragmentSecondhand extends Fragment {

    ArrayList<WriteItem> writeItems=new ArrayList<>();
    WriteAdapter writeAdapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home_secondhand,container,false);
        writeItems.clear();
        writeItems.add(new WriteItem(R.drawable.hp,"핸드폰","혜화동","100000원","오래된거"));
        writeItems.add(new WriteItem(R.drawable.com,"컴퓨터","이화동","1000000원","최신"));
        writeItems.add(new WriteItem(R.drawable.note,"노트북","명륜동","500000원","1년정도사용"));
        writeItems.add(new WriteItem(R.drawable.book,"공책","부암동","1000원","새거"));
        recyclerView=view.findViewById(R.id.secondRecycler);
        writeAdapter=new WriteAdapter(getContext(),writeItems);
        recyclerView.setAdapter(writeAdapter);

        return view;
    }
}
