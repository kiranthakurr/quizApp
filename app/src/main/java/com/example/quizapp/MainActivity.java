package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private  String[] questions= {"India got independence on 15 August 1947?","The battle of Plassey fought in 1757? ","Lord Clive introduced Subsidiary alliance?","Hind Swaraj book was written by Mahatma Gandhi? ","Calcuta was Capital of India till 1812?"};
private  boolean[] answers = {true,true,false,true,false};
private int score=0;
private int index =0;
Button yes;
Button no;
TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question = findViewById(R.id.textView2);
        
        question.setText(questions[index]);
        
        yes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    if(answers[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        question.setText(questions[index]);

                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is : "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart App to play again", Toast.LENGTH_SHORT).show();
                }
                
                
            }
        });

        no.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){
                    if(!answers[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        question.setText(questions[index]);

                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is : "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart App to play again", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}