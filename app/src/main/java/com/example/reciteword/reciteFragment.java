package com.example.reciteword;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class reciteFragment extends Fragment {


    private Button knowButton,unknowButton;
    private ImageButton tipsButton;
    private TextView wordText,definitionText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recite, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        knowButton = (Button)getActivity().findViewById(R.id.knowButton);
        unknowButton = (Button)getActivity().findViewById(R.id.unknowButton);
        tipsButton = (ImageButton)getActivity().findViewById(R.id.tipsButton);
        wordText = (TextView)getActivity().findViewById(R.id.wordText);
        definitionText = (TextView)getActivity().findViewById(R.id.definitionText);
        super.onActivityCreated(savedInstanceState);
        final SharedPreferences sharedPre = getActivity().getSharedPreferences("t",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPre.edit();

        wordText.setText(Data.getWord(Data.getRandNum()));
        definitionText.setText("");
        final int[] wrongNum = {sharedPre.getInt("wrongNum", 0)};
        int cnt = sharedPre.getInt("word"+Data.getRandNum(),0);
        cnt++;
        editor.putInt("word"+Data.getRandNum(),cnt);
        editor.apply();

        knowButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Data.setRandNum();
                definitionText.setText("");
                int cnt = sharedPre.getInt("word"+Data.getRandNum(),0);
                cnt++;
                editor.putInt("word"+Data.getRandNum(),cnt);
                editor.apply();
                wordText.setText(Data.getWord(Data.getRandNum()));
            }
        });
        unknowButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                wrongNum[0]++;
                editor.putInt("wrongNum",wrongNum[0]);
                editor.putInt("wrong"+wrongNum[0],Data.getRandNum());
                Data.setRandNum();
                int cnt = sharedPre.getInt("word"+Data.getRandNum(),0);
                cnt++;
                editor.putInt("word"+Data.getRandNum(),cnt);
                System.out.println(Data.getRandNum()+":"+cnt);
                editor.apply();
                definitionText.setText("");
                wordText.setText(Data.getWord(Data.getRandNum()));

            }
        });
        tipsButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                definitionText.setText(Data.getPron(Data.getRandNum())+"\n"+Data.getwordDefine(Data.getRandNum()));
            }
        });
    }
}