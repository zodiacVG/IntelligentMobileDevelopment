package com.example.helloworld;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount; //把xml里面的textview抓过来
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "HelloWorld");
        mShowCount=(TextView)findViewById(R.id.show_count); //拿到了xml文件里面的view，这一步需要在oncreate里面完成
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("ResourceAsColor")
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount)); //textview的settext方法
            if(mCount % 2==0)
                mShowCount.setTextColor(R.color.colorButtonPressed);
            else
//                mShowCount.setTextColor(R.color.colorPrimary);
                    mShowCount.setTextColor(this.getResources().getColor(R.color.colorPrimary));
        }

    }

    public void zeroCount(View view) {
        if(mCount==0){
            Toast toast2=Toast.makeText(this,"已经归零了！",Toast.LENGTH_SHORT);
            toast2.show();
        }
        mCount=0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount)); //textview的settext方法
    }
}