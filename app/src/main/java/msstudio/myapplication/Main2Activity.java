package msstudio.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.VideoView;

import static msstudio.myapplication.R.id.videoView;

public class Main2Activity extends AppCompatActivity {
VideoView videocontainer;
    CardView one,two,three,four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        videocontainer = (VideoView)  findViewById(videoView);
        String UrlPath="android.resource://"+getPackageName()+"/"+R.raw.mp4;
        videocontainer.setVideoURI(Uri.parse(UrlPath));
        videocontainer.start();
        videocontainer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        one =(CardView)findViewById(R.id.cardView);
        two =(CardView)findViewById(R.id.cardViewcom);
        three =(CardView)findViewById(R.id.cardViewnews);
        four =(CardView)findViewById(R.id.cardVieworb);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(mIntent);
            }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent =  new Intent( Intent.ACTION_VIEW, Uri.parse("https://theskylive.com/planetarium?obj=bennu"));
                startActivity(mIntent);
            }

        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent mIntent =  new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.nytimes.com/2016/09/06/science/nasa-osiris-rex-asteroid-bennu-sample.html"));
                startActivity(mIntent);

            }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(mIntent);
            }

        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        String UrlPath="android.resource://"+getPackageName()+"/"+R.raw.mp4;
        videocontainer.setVideoURI(Uri.parse(UrlPath));
        videocontainer.start();
        videocontainer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}
