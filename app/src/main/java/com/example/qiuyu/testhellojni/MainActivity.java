package com.example.qiuyu.testhellojni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MyJni myJni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new MyClickListener());
        button.setOnClickListener(new MyClickListener());
        button2.setOnClickListener(new MyClickListener());
        myJni = new MyJni();

    }

    class MyClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    Log.d("123", "nativeStaitcExec");
                    MyJni.nativeStaitcExec(11);
                    break;
                case R.id.button1:
                    Log.d("123", "nativeExec");
                    myJni.nativeExec(10);
                    break;
                case R.id.button2:
                    break;
            }
        }
    }
}
