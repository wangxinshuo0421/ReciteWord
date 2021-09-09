package com.example.reciteword;
import android.app.Person;
import android.content.res.AssetManager;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Word {
    private String word;    //单词
    private String pron;    //音标
    private String definition;  //翻译
    private int showNum;        //出现次数
    private int flag;           //标志（错题）

    public Word(String word, String pron, String definition, int showNum, int flag){
        this.word = word;
        this.pron = pron;
        this.definition = definition;
        this.showNum = showNum;
        this.flag = flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setShowNum(int showNum) {
        this.showNum = showNum;
    }

    public String getWord(){ return  word; }
    public String getPron(){ return  pron; }
    public String getDefinition(){ return  definition; }
    public int getShowNum(){ return  showNum; }
    public int getFlag(){ return  flag; }
}

