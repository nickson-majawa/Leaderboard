package com.nmajawa.gads;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class skillFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private  RecyclerView.LayoutManager mLayoutManager;
    private String[] lang = {"Java", "Kotlin", "C++", "ReactNative", "Flutter", "Native Script", "Google",
            "Angular", "React"};

    private  View listItemsView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        listItemsView = inflater.inflate(R.layout.skill_fragment, container, false);


        mRecyclerView = listItemsView.findViewById(R.id.skill_recyclerview);
        mLayoutManager =  new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new skillAdapter(lang);
        mRecyclerView.setAdapter(mAdapter);

        return listItemsView;
    }
}
