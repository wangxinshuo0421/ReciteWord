package com.example.reciteword;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class brushFragment extends Fragment {
    private List<Word> wordList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_brush, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        initWordList();
        WordAdapter adapter = new WordAdapter(getActivity(),R.layout.word_item,wordList);
        ListView listView = (ListView) getActivity().findViewById(R.id.word_list_view);
        listView.setAdapter(adapter);
    }

    private void initWordList(){
        int[] ints =new int[90];
        wordList.clear();

        for(int i=0;i<90;i++) {
            ints[i] = i;
        }
        for (int i=0;i<90;i++){
            int temp,x;
            x=getNum(90);
            temp = ints[x];
            ints[x] = ints[i];
            ints[i] = temp;
        }
        for (int i=0;i<90;i++){
            Word word = new Word(Data.getWord(ints[i]),Data.getPron(ints[i]),Data.getwordDefine(ints[i]),getNum(3),0);
            wordList.add(word);
        }
    }
    private static int getNum(int endNum){
        if(endNum > 0){
            Random random = new Random();
            return random.nextInt(endNum);
        }
        return 0;
    }

}