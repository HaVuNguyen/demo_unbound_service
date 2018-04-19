package com.example.dell.demounboundservice_playsong;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceType")
    public void playSong(View view) {
        ImageButton imageButton ;
        imageButton = (ImageButton) findViewById(R.drawable.ic_play);
        Intent intent = new Intent(MainActivity.this, PlaySongService.class);
        this.startService(intent);

    }

    @SuppressLint("ResourceType")
    public void stopSong(View view) {
        ImageButton imageButton;
        imageButton = (ImageButton) findViewById(R.drawable.ic_stop);
        Intent intent = new Intent(MainActivity.this, PlaySongService.class);
        this.stopService(intent);
    }

}
