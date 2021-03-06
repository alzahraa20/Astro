package com.zahra.astro.lessons;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zahra.astro.R;
import com.zahra.astro.data.Quiz_Data;
import com.zahra.astro.home.MainActivity;
import com.zahra.astro.topics.SpaceTopicsActivity;

import java.util.Random;

public class SpaceQuizActivity extends AppCompatActivity {
    Button opt1,opt2,opt3,opt4;
    TextView question,result;
    FloatingActionButton home;

    private Quiz_Data data = new Quiz_Data();
    private String answer;
    private int score = 0;
    int position =0;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_quiz);
        question = findViewById(R.id.question_tv2);
        result = findViewById(R.id.result_tv2);
        opt1 = findViewById(R.id.opt1s_btn);
        opt2 = findViewById(R.id.opt2s_btn);
        opt3 = findViewById(R.id.opt3s_btn);
        opt4 = findViewById(R.id.opt4s_btn);
        home = findViewById(R.id.home_btn3);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
            }
        });

        ///     random = new Random();

        result.setText("Your Score: "+score);
        updateQuestions(position);

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opt1.getText()== answer) {
                    score++;
                    result.setText("Your Score: "+score*10+"%");
                    position++;
                    updateQuestions(position);
                }else{
                    gameOver();
                }
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opt2.getText()== answer) {
                    score++;
                    result.setText("Your Score: "+score*10+"%");
                    position++;
                    updateQuestions(position);
                }else{
                    gameOver();
                }
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opt3.getText()== answer){
                    score++;
                    result.setText("Your Score: "+score*10+"%");
                    position++;
                    updateQuestions(position);
                }else{
                    gameOver();
                }
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(opt4.getText()== answer) {
                    score++;
                    result.setText("Your Score: "+score*10+"%");
                    position++;
                    updateQuestions(position);
                }else{
                    gameOver();
                }
            }
        });
    }

    private void updateQuestions(int pos) {
        if(pos<=9) {
            question.setText(data.getSpaceQuestion(pos));
            opt1.setText(data.getSpaceChoice1(pos));
            opt2.setText(data.getSpaceChoice2(pos));
            opt3.setText(data.getSpaceChoice3(pos));
            opt4.setText(data.getSpaceChoice4(pos));

            answer = data.getSpaceAnswer(pos);
        }else {
            gameOver();
        }
    }

    private void gameOver() {
        AlertDialog.Builder alert = new AlertDialog.Builder(SpaceQuizActivity.this);
        if(score==10) {
            alert.setMessage("Congrats ! Keep Learning").setCancelable(false)
                    .setPositiveButton("New Topic", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(getBaseContext(), SpaceTopicsActivity.class));
                        }
                    }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(getBaseContext(), MainActivity.class));
                }
            });
        }else{
            alert.setMessage("Game Over, Try Again").setCancelable(false)
                    .setPositiveButton("Continue ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(getBaseContext(), SpaceLessonActivity.class));
                        }
                    }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    startActivity(new Intent(getBaseContext(), MainActivity.class));
                }
            });
        }

        AlertDialog alertDialog = alert.create();
        alertDialog.show();
    }
}