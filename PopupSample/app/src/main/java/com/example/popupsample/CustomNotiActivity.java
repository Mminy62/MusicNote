package com.example.popupsample;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomNotiActivity extends AppCompatActivity {

    ImageView btn1;
    Handler m_handler;
    Runnable m_handlerTask ;
    int timeleft=6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_custom_noti);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_custom_noti);

        btn1 = (ImageView) findViewById(R.id.imageView3);


        m_handler = new Handler();
        m_handlerTask = new Runnable()
        {
            @Override
            public void run() {
                if(timeleft >= 0)
                {
                    // do stuff
                    Log.i("timeleft",""+timeleft);
                    timeleft--;
                }
                else
                {
                    m_handler.removeCallbacks(m_handlerTask);
                    finish();// cancel run
                }
                m_handler.postDelayed(m_handlerTask, 1000);
            }
        };
        m_handlerTask.run();
    }
}
/*
setContentView 밑에
getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_custom_noti);

        btn1 = (ImageView) findViewById(R.id.imageView3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });*/
