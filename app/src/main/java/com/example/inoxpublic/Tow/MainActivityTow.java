package com.example.inoxpublic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivityTow extends AppCompatActivity {
    VideoView videoView;
    AppCompatButton buttonstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tow);
        videoView =findViewById(R.id.videoview);
        String vid = "android.resource://"+getPackageName() + "/" +R.raw.d;
        Uri uri = Uri.parse(vid);
        videoView.setVideoURI(uri);
        MediaController mediaController =new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        buttonstart = findViewById(R.id.buttonstart);
        buttonstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityTow.this,MainActivitythree.class));
            }
        });
    }
}