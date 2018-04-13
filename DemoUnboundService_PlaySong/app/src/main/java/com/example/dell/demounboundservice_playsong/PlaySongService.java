package com.example.dell.demounboundservice_playsong;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class PlaySongService extends Service {
    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private MediaPlayer mediaPlayer3;
    private MediaPlayer mediaPlayer4;
    public PlaySongService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer1 = MediaPlayer.create(getApplicationContext(), R.raw.mysong);
//        mediaPlayer2 = MediaPlayer.create(getApplicationContext(), R.raw.mysong2);
//        mediaPlayer3 = MediaPlayer.create(getApplicationContext(), R.raw.mysong3);
//        mediaPlayer4 = MediaPlayer.create(getApplicationContext(), R.raw.mysong4);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        mediaPlayer1.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        mediaPlayer1.release();
        super.onDestroy();

    }
}
