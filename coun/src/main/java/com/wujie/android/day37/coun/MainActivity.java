package com.wujie.android.day37.coun;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements Chronometer.OnChronometerTickListener{

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private Chronometer chronometer;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();

    }

    private void initListener() {
        chronometer.setOnChronometerTickListener(this);
    }

    private void initView() {
         chronometer= (Chronometer) findViewById(R.id.chon);
         button2= (Button) findViewById(R.id.button2);
         button3= (Button) findViewById(R.id.button3);
         button4= (Button) findViewById(R.id.button4);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                chronometer.start();
                break;
            case R.id.button2:
                    chronometer.stop();
                break;
            case R.id.button3:
                chronometer.setBase(SystemClock.elapsedRealtime());
                break;
            case R.id.button4:
                chronometer.setFormat("Time:%s");
                break;

        }
    }


    @Override
    public void onChronometerTick(Chronometer chronometer) {
        String time = chronometer.getText().toString();
        if ("00:00".equals(time)) {
            Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
        }
    }
}
