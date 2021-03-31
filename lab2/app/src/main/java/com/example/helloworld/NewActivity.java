package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mTextView=findViewById(R.id.show_count_2);
        TextView mTextView2=findViewById(R.id.textView_hello);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2=intent.getStringExtra(MainActivity.EXTRA_MESSAGE2); //尝试传递两个数据，分别拥有name和value
        mTextView.setText(message);
        mTextView2.setText(message2);
    }
}