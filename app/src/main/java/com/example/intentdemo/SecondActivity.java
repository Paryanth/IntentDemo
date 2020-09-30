package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView echoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        echoText = findViewById(R.id.echotext);
        Bundle myBundle = getIntent().getExtras();
        while(myBundle!=null){
            String myechotext = myBundle.getString("name");
            echoText.setText(myechotext);
        }
    }
}