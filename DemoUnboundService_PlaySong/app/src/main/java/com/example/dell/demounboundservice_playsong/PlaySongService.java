package com.example.dell.demounboundservice_playsong;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.view.View;
import android.widget.ImageButton;

public class PlaySongService extends Service {
    ImageButton btnPlay,btnStop;
    private MediaPlayer mediaPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mysong);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            //btnPlay.setImageResource(R.drawable.ic_play);
        }else{
            mediaPlayer.start();
            //btnPlay.setImageResource(R.drawable.ic_pause);
        }
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        mediaPlayer.stop();
        mediaPlayer.release();
        //btnPlay.setImageResource(R.drawable.ic_play);
        super.onDestroy();
    }

}
