package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        mTextView=findViewById(R.id.orderinfo);
        mTextView.setText(" ");
        Intent intent=getIntent();
        //接收arraylist，里面有订单信息
        ArrayList<String> result=intent.getStringArrayListExtra(MainActivity.EXTRA_MESSAGE);
        //遍历list，找到所有订单
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
            mTextView.setText(mTextView.getText().toString()+ result.get(i)+"\n");
        }
    }
}