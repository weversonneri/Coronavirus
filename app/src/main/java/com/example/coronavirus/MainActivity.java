package com.example.coronavirus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button doTest = findViewById(R.id.button_do_test);

        doTest.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_do_test) {
            Intent intent = new Intent(MainActivity.this, DoTestActivity.class);
            startActivity(intent);

        }
        if (v.getId() == R.id.button_about) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);

        }
    }
}

