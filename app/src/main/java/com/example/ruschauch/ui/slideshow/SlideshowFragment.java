package com.example.ruschauch.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.ruschauch.R;


public class SlideshowFragment extends Fragment {

    View rootView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        rootView = inflater.inflate(R.layout.fragment_slideshow, container, false);



        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}