package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartButtonClick(View view) {
        startService(new Intent(MainActivity.this, PlayService.class));
    }

    public void onStopButtonClick(View view) {
        stopService(new Intent(MainActivity.this, PlayService.class));
    }
}