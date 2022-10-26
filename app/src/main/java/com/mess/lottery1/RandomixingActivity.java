package com.mess.lottery1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class RandomixingActivity extends AppCompatActivity {

    TextView first_winner,second_winner,third_Winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_randomixing);

        first_winner = findViewById(R.id.first_Winner);
        second_winner = findViewById(R.id.second_winner);
        third_Winner = findViewById(R.id.third_winner);

        String firstone = getIntent().getStringExtra("text1");
        String secondone = getIntent().getStringExtra("text2");
        String thridone = getIntent().getStringExtra("text3");

        first_winner.setText(thridone);
        second_winner.setText(firstone);
        third_Winner.setText(secondone);



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String first = first_winner.getText().toString();
                String second = second_winner.getText().toString();
                String  third = third_Winner.getText().toString();

                Intent intent = new Intent(getApplicationContext(),congratulation.class);
                intent.putExtra("text4",first);
                intent.putExtra("text5",second);
                intent.putExtra("text6",third);
                startActivity(intent);
            }
        },10000);






    }
}