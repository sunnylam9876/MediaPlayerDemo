package com.example.mediaplayerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        VideoView videoView =(VideoView)findViewById(R.id.vdVw);
        //Set MediaController  to enable play, pause, forward, etc options.
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        //Location of Media File
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.raindrops_video);
        //Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}