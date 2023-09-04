package com.example.sampleproject;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private List<VideoItem> videoList;
    private RecyclerView homeRecycleView;
    private VideoAdapter videoAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        videoList = generateVideoItems();

        homeRecycleView = rootView.findViewById(R.id.homeRecycleView);
        homeRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        videoAdapter = new VideoAdapter(videoList);
        homeRecycleView.setAdapter(videoAdapter);

        return rootView;
    }

    private List<VideoItem> generateVideoItems(){
        List<VideoItem> videoItems = new ArrayList<>();
        videoItems.add(new VideoItem(R.drawable.wallpaper11, "Viral lele blonde go International",
                "JuraganLele", R.drawable.channel5));
        videoItems.add(new VideoItem(R.drawable.wallpaper12, "Viral ikan berkepala lele",
                "JuraganBakso", R.drawable.channel2));
        videoItems.add(new VideoItem(R.drawable.wallpaper13, "Akibat putus cinta, pekerja Epson ternak lele",
                "JuraganTahu", R.drawable.channel3));
        videoItems.add(new VideoItem(R.drawable.wallpaper14, "Indonesia juara dunia lomba makan kerupuk",
                "JuraganKerupuk", R.drawable.channel4));

        return videoItems;
    }
}