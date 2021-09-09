package com.example.reciteword;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    public int resourceId;
    public WordAdapter(Context context, int textViewResourceId, List<Word> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Word word = getItem(position); //获取当前项的实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView wordContext = (TextView)view.findViewById(R.id.word_context);
        TextView wordDefinition = (TextView)view.findViewById(R.id.word_definition);
        TextView wordPron = (TextView)view.findViewById(R.id.word_pron);
        TextView wordFlag = (TextView)view.findViewById(R.id.word_flag);
        wordContext.setText(word.getWord());
        wordDefinition.setText(word.getDefinition());
        wordPron.setText(word.getPron()+"");
        wordFlag.setText(word.getShowNum()+"");
        return view;
    }
}
