package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customlistview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageList = {};
        int[] ingredientList = {};
        int[] descList = {};
        String[] nameList = {};
        String[] timeList = {};
    }
}