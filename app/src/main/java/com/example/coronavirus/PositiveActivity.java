package com.example.coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PositiveActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive);

        button = findViewById(R.id.button_positive_fechar);

        button.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(PositiveActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
