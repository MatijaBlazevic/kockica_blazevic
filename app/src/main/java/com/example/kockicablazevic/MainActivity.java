package com.example.kockicablazevic;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View btnGenerate=(Button)findViewById(R.id.btnGenerate);
        View textView1=(TextView)findViewById(R.id.textViewNum1);
        View textView2=(TextView)findViewById(R.id.textViewNum2);
        btnGenerate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                final Random rnd = new Random();
                int number2=(rnd.nextInt(6));
                int number3=(rnd.nextInt(6));
                ((TextView)textView1).setText(String.valueOf(number2));
                ((TextView)textView2).setText(String.valueOf(number3));
            }
        });
    }
}