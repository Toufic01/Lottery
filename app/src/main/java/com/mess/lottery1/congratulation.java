package com.mess.lottery1;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class congratulation extends AppCompatActivity {

    TextView first,second,third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation);

        first = findViewById(R.id.firstname);
        second = findViewById(R.id.secondname);
        third = findViewById(R.id.thirdname);

        String firstone1 = getIntent().getStringExtra("text4");
        String secondone1 = getIntent().getStringExtra("text5");
        String thridone1 = getIntent().getStringExtra("text6");

        first.setText(firstone1);
        second.setText(secondone1);
        third.setText(thridone1);


    }

    }
