package com.example.dell.demounboundservice_playsong;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.view.View;
import android.widget.ImageButton;

public class PlaySongService extends Service {
    private MediaPlayer mediaPlayer1;
    ImageButton btnNext,btnPrev;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer1 = MediaPlayer.create(getApplicationContext(), R.raw.mysong);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        if(mediaPlayer1.isPlaying()){
            mediaPlayer1.pause();
        }else{
            mediaPlayer1.start();
        }
        return START_STICKY;
    }


    @Override
    public void onDestroy(){
        mediaPlayer1.stop();
        mediaPlayer1.release();
        super.onDestroy();

    }

}
