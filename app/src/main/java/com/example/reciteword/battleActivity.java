package com.example.reciteword;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class battleActivity extends AppCompatActivity {
    private Button choose1Button,choose2Button,choose3Button;
    private TextView user1Score,user2Score,wordFightText;
    private int round = 1,rightNum = 0,myScore = 0,youScore = 0,fullScore = 50,thisWordNum;
    private String word,definition1,definition2,definition3;
    private SharedPreferences sharedPre;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
        final SharedPreferences sharedPre = this.getSharedPreferences("t",Context.MODE_PRIVATE);
        final int[] wrongNum = {sharedPre.getInt("wrongNum", 0)};
        System.out.println(wrongNum[0]);

        choose1Button = (Button)findViewById(R.id.choose1Button);
        choose2Button = (Button)findViewById(R.id.choose2Button);
        choose3Button = (Button)findViewById(R.id.choose3Button);
        user1Score = (TextView)findViewById(R.id.user1Score);
        user2Score = (TextView)findViewById(R.id.user2Score);
        wordFightText = (TextView)findViewById(R.id.wordFightText);

        initWord();
        choose1Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(myScore >= fullScore && youScore <= fullScore){
                    Intent intent = new Intent(battleActivity.this,successActivity.class);
                    startActivity(intent);
                }else if(myScore <= fullScore && youScore >= fullScore){
                    Intent intent = new Intent(battleActivity.this,failActivity.class);
                    startActivity(intent);
                }
                if(rightNum == 0) {  //按对了
                    myScore+=10;
                    int x = getNum(10);
                    if(x >= 2)  youScore += 10;
                }else {
                    editor = sharedPre.edit();
                    int x = getNum(10);
                    if(x >= 6)  youScore += 10;
                    wrongNum[0]++;
                    editor.putInt("wrongNum",wrongNum[0]);
                    editor.putInt("wrong"+wrongNum[0],thisWordNum);
                    editor.commit();
                }
                initWord();
            }
        });
        choose2Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(myScore >= fullScore && youScore <= fullScore){
                    Intent intent = new Intent(battleActivity.this,successActivity.class);
                    startActivity(intent);
                }else if(myScore <= fullScore && youScore >= fullScore){
                    Intent intent = new Intent(battleActivity.this,failActivity.class);
                    startActivity(intent);
                }
                if(rightNum == 1) {  //按对了
                    myScore+=10;
                    int x = getNum(10);
                    if(x >= 2)  youScore += 10;
                }else {
                    editor = sharedPre.edit();
                    int x = getNum(10);
                    if(x >= 6)  youScore += 10;
                    wrongNum[0]++;
                    editor.putInt("wrongNum",wrongNum[0]);
                    editor.putInt("wrong"+wrongNum[0],thisWordNum);
                    editor.commit();
                }
                initWord();
            }
        });
        choose3Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(myScore >= fullScore && youScore <= fullScore){
                    Intent intent = new Intent(battleActivity.this,successActivity.class);
                    startActivity(intent);
                }else if(myScore <= fullScore && youScore >= fullScore){
                    Intent intent = new Intent(battleActivity.this,failActivity.class);
                    startActivity(intent);
                }
                if(rightNum == 2) {  //按对了
                    myScore+=10;
                    int x = getNum(10);
                    if(x >= 2)  youScore += 10;
                }else {
                    editor = sharedPre.edit();
                    int x = getNum(10);
                    if(x >= 6)  youScore += 10;
                    wrongNum[0]++;
                    editor.putInt("wrongNum",wrongNum[0]);
                    editor.putInt("wrong"+wrongNum[0],thisWordNum);
                    editor.commit();
                }
                initWord();
            }
        });
    }

    private void initWord(){
        int rNum = getNum(90);
        thisWordNum = rNum;
        word = Data.getWord(rNum);
        rightNum = getNum(3);
        final SharedPreferences sharedPre = this.getSharedPreferences("t",Context.MODE_PRIVATE);
        editor = sharedPre.edit();
        int cnt = sharedPre.getInt("word"+rNum,0);
        cnt++;
        editor.putInt("word"+rNum,cnt);
        editor.apply();
        switch (rightNum){
            case 0:
                definition1 = Data.getwordDefine(rNum);
                definition2 = Data.getwordDefine(getNum(90));
                definition3 = Data.getwordDefine(getNum(90));
                break;
            case 1:
                definition1 = Data.getwordDefine(getNum(90));
                definition2 = Data.getwordDefine(rNum);
                definition3 = Data.getwordDefine(getNum(90));
                break;
            default:
                definition1 = Data.getwordDefine(getNum(90));
                definition2 = Data.getwordDefine(getNum(90));
                definition3 = Data.getwordDefine(rNum);
                break;
        }
        choose1Button.setText(definition1);
        choose2Button.setText(definition2);
        choose3Button.setText(definition3);
        wordFightText.setText(word);
        user1Score.setText("得分:"+myScore);
        user2Score.setText("得分:"+youScore);
    }
    private static int getNum(int endNum){
        if(endNum > 0){
            Random random = new Random();
            return random.nextInt(endNum);
        }
        return 0;
    }
}