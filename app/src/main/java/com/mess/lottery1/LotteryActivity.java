package com.mess.lottery1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import es.dmoral.toasty.Toasty;

public class LotteryActivity extends AppCompatActivity {
    EditText frist, second, third;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery);


        frist = findViewById(R.id.firs_name);
        second = findViewById(R.id.second_name);
        third = findViewById(R.id.third_name);
        click = findViewById(R.id.roll);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name1 = frist.getText().toString();
                String name2 = second.getText().toString();
                String name3 = third.getText().toString();

                Intent intent = new Intent(getApplicationContext(),RandomixingActivity.class);
                intent.putExtra("text1",name1);
                intent.putExtra("text2",name2);
                intent.putExtra("text3",name3);
                startActivity(intent);

            }
        });
    }
}
