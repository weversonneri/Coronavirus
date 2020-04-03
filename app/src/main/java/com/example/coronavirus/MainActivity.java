package com.example.coronavirus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button doTest;
    LinearLayout about, video, transmicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doTest = findViewById(R.id.button_do_test);
        about = findViewById(R.id.layout_o_que_sao);
        video = findViewById(R.id.layout_video);
        transmicao = findViewById(R.id.layout_como_transmite);

        doTest.setOnClickListener(this);
        about.setOnClickListener(this);
        video.setOnClickListener(this);
        transmicao.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_do_test) {
            Intent intent = new Intent(MainActivity.this, DoTestActivity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.layout_o_que_sao) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.layout_video) {
            Intent intent = new Intent(this, VideoActivity.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.layout_como_transmite) {
            Intent intent = new Intent(this, TransmitionActivity.class);
            startActivity(intent);
        }
    }


}

