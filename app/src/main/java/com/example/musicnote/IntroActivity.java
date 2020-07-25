package com.example.musicnote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button music_noteBtn = (Button) findViewById(R.id.musicNote_btn);
        ImageView image_bof = (ImageView)findViewById(R.id.bof_logo);

        music_noteBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),InfoActivity.class);
                startActivity(intent);

            }

        });

    }
}
