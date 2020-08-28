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

public class HomeFragmentVillage extends Fragment {

    ArrayList<VillageItem> villageItems=new ArrayList<>();
    VillageAdapter villageAdapter;
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home_village,container,false);

        villageItems.add(new VillageItem(R.drawable.kk,"꼬북이","주변에 수영장이 있을까요?"));
        villageItems.add(new VillageItem(R.drawable.p,"파이리","주변에 사우나가 있을까요?"));
        villageItems.add(new VillageItem(R.drawable.pp,"피카츄","같이 공부하실분??"));

        recyclerView=view.findViewById(R.id.villageRecycler);
        villageAdapter=new VillageAdapter(getContext(),villageItems);
        recyclerView.setAdapter(villageAdapter);
        return view;
    }
}
