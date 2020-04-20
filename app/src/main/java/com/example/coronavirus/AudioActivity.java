package com.example.coronavirus;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AudioActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView button01, button02, button03, button04;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        button01 = findViewById(R.id.button_audio_play01);
        button02 = findViewById(R.id.button_audio_play02);
        button03 = findViewById(R.id.button_audio_play03);
        button04 = findViewById(R.id.button_audio_play04);

        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
        button03.setOnClickListener(this);
        button04.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button_audio_play01:
                stopPlayer();
                player = MediaPlayer.create(AudioActivity.this, R.raw.speech1_port);
                player.start();
                button01.setImageResource(R.drawable.ic_pausa);

                break;
            case R.id.button_audio_play02:
                stopPlayer();
                player = MediaPlayer.create(AudioActivity.this, R.raw.speech2_port);
                player.start();
                button02.setImageResource(R.drawable.ic_pausa);

                break;
            case R.id.button_audio_play03:
                stopPlayer();
                player = MediaPlayer.create(AudioActivity.this, R.raw.speech1_ingles);
                player.start();
                button03.setImageResource(R.drawable.ic_pausa);
                break;
            case R.id.button_audio_play04:
                stopPlayer();
                player = MediaPlayer.create(AudioActivity.this, R.raw.speech2_ingles);
                player.start();
                button04.setImageResource(R.drawable.ic_pausa);

        }

    }

    public void setIcon() {
        button01.setImageResource(R.drawable.ic_play);
        button02.setImageResource(R.drawable.ic_play);
        button03.setImageResource(R.drawable.ic_play);
        button04.setImageResource(R.drawable.ic_play);

    }

    public void stopPlayer() {
        if (player != null) {
            player.stop();
            player.release();
            player = null;
            setIcon();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.stop();
            player.release();
            player = null;
        }
    }
}
