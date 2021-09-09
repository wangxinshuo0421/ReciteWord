package com.example.reciteword;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import java.util.Timer;
import java.util.TimerTask;


public class fightFragment extends Fragment {

    private LinearLayout fighLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fight, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fighLayout = (LinearLayout)getActivity().findViewById(R.id.fighLayout);
        fighLayout.setAlpha((float) 0.5);
        TimerTask task = new TimerTask(){
            public void run(){
                Intent intent = new Intent(getActivity(), battleActivity.class);
                startActivity(intent);
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,3500);
    }
}