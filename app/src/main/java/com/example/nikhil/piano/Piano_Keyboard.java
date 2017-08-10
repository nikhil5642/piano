package com.example.nikhil.piano;

import android.graphics.Rect;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;


public class Piano_Keyboard extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    SeekBar seekBar;
   ImageView l1,l2,r1,r2;
    FrameLayout keys;
    int progress=50;
    private Rect rect;
    private ScrollView scrollView;

    public void listener(final ImageView t,final int x){
             t.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent motionEvent) {

            switch(motionEvent.getAction()){
                case MotionEvent.ACTION_DOWN:
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                    mediaPlayer=MediaPlayer.create(Piano_Keyboard.this,x);
                    mediaPlayer.start();
                    t.setImageResource(R.drawable.white_down);
                    return true;
                case MotionEvent.ACTION_UP:
                    t.setImageResource(R.drawable.white_up);
                    return true;
                          }
            return false;
        }


         }
     );

 }
    public void listener0(final ImageView t,final int x){
        t.setOnTouchListener(new View.OnTouchListener() {
                                 @Override
                                 public boolean onTouch(View view, MotionEvent motionEvent) {

                                     switch(motionEvent.getAction()){
                                         case MotionEvent.ACTION_DOWN:
                                             mediaPlayer=MediaPlayer.create(Piano_Keyboard.this,x);
                                             mediaPlayer.start();
                                             t.setImageResource(R.drawable.black_down);
                                             return true;
                                         case MotionEvent.ACTION_UP:
                                             t.setImageResource(R.drawable.black_up);
                                             return true;
                                         }

                                     return false;
                                 }



                             }
        );

    }
    public void listener1(final ImageView t){
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                }
        }  );
    }
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_piano__keyboard);

       seekBar=(SeekBar)findViewById(R.id.seek_bar);
       keys=(FrameLayout)findViewById(R.id.keys_88);
seekBar.setProgress(progress);
       keys.scrollTo(26*64,0);
       seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int i, boolean fromUser) {
           progress=i;
               keys.scrollTo(i*54,0);
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {

           }
       });

     listener((ImageView)findViewById(R.id.a0),R.raw.aa_1);
        listener((ImageView)findViewById(R.id.b0),R.raw.ab_1);
        listener((ImageView)findViewById(R.id.c1),R.raw.ac0);
        listener((ImageView)findViewById(R.id.d1),R.raw.ad0);
        listener((ImageView)findViewById(R.id.e1),R.raw.ae0);
        listener((ImageView)findViewById(R.id.f1),R.raw.af0);
        listener((ImageView)findViewById(R.id.g1),R.raw.ag0);
        listener((ImageView)findViewById(R.id.a1),R.raw.aa0);
        listener((ImageView)findViewById(R.id.b1),R.raw.ab0);

        listener((ImageView)findViewById(R.id.c2),R.raw.ac1);
        listener((ImageView)findViewById(R.id.d2),R.raw.ad1);
        listener((ImageView)findViewById(R.id.e2),R.raw.ae1);
        listener((ImageView)findViewById(R.id.f2),R.raw.af1);
        listener((ImageView)findViewById(R.id.g2),R.raw.ag1);
        listener((ImageView)findViewById(R.id.a2),R.raw.aa1);
        listener((ImageView)findViewById(R.id.b2),R.raw.ab2);

        listener((ImageView)findViewById(R.id.c3),R.raw.ac2);
        listener((ImageView)findViewById(R.id.d3),R.raw.ad2);
        listener((ImageView)findViewById(R.id.e3),R.raw.ae2);
        listener((ImageView)findViewById(R.id.f3),R.raw.af2);
        listener((ImageView)findViewById(R.id.g3),R.raw.ag2);
        listener((ImageView)findViewById(R.id.a3),R.raw.aa2);
        listener((ImageView)findViewById(R.id.b3),R.raw.ab3);

        listener((ImageView)findViewById(R.id.c4),R.raw.ac3);
        listener((ImageView)findViewById(R.id.d4),R.raw.ad3);
        listener((ImageView)findViewById(R.id.e4),R.raw.ae3);
        listener((ImageView)findViewById(R.id.f4),R.raw.af3);
        listener((ImageView)findViewById(R.id.g4),R.raw.ag3);
        listener((ImageView)findViewById(R.id.a4),R.raw.aa3);
        listener((ImageView)findViewById(R.id.b4),R.raw.ab4);

        listener((ImageView)findViewById(R.id.c5),R.raw.ac4);
        listener((ImageView)findViewById(R.id.d5),R.raw.ad4);
        listener((ImageView)findViewById(R.id.e5),R.raw.ae4);
        listener((ImageView)findViewById(R.id.f5),R.raw.af4);
        listener((ImageView)findViewById(R.id.g5),R.raw.ag4);
        listener((ImageView)findViewById(R.id.a5),R.raw.aa4);
        listener((ImageView)findViewById(R.id.b5),R.raw.ab4);

        listener((ImageView)findViewById(R.id.c6),R.raw.ac5);
        listener((ImageView)findViewById(R.id.d6),R.raw.ad5);
        listener((ImageView)findViewById(R.id.e6),R.raw.ae5);
        listener((ImageView)findViewById(R.id.f6),R.raw.af5);
        listener((ImageView)findViewById(R.id.g6),R.raw.ag5);
        listener((ImageView)findViewById(R.id.a6),R.raw.aa5);
        listener((ImageView)findViewById(R.id.b6),R.raw.ab5);

        listener((ImageView)findViewById(R.id.c7),R.raw.ac6);
        listener((ImageView)findViewById(R.id.d7),R.raw.ad6);
        listener((ImageView)findViewById(R.id.e7),R.raw.ae6);
        listener((ImageView)findViewById(R.id.f7),R.raw.af6);
        listener((ImageView)findViewById(R.id.g7),R.raw.ag6);
        listener((ImageView)findViewById(R.id.a7),R.raw.aa6);
        listener((ImageView)findViewById(R.id.b7),R.raw.ab6);

       listener((ImageView)findViewById(R.id.c8),R.raw.ac7);

       listener0((ImageView)findViewById(R.id.ad0),R.raw.aad_1);
       listener0((ImageView)findViewById(R.id.cd1),R.raw.acd0);
       listener0((ImageView)findViewById(R.id.dd1),R.raw.add0);
       listener0((ImageView)findViewById(R.id.fd1),R.raw.afd0);
       listener0((ImageView)findViewById(R.id.gd1),R.raw.agd0);
       listener0((ImageView)findViewById(R.id.ad1),R.raw.aad0);
       listener0((ImageView)findViewById(R.id.cd2),R.raw.acd1);
       listener0((ImageView)findViewById(R.id.dd2),R.raw.add1);
       listener0((ImageView)findViewById(R.id.fd2),R.raw.afd1);
       listener0((ImageView)findViewById(R.id.gd2),R.raw.agd1);
       listener0((ImageView)findViewById(R.id.ad2),R.raw.aad1);
       listener0((ImageView)findViewById(R.id.cd3),R.raw.acd2);
       listener0((ImageView)findViewById(R.id.dd3),R.raw.add2);
       listener0((ImageView)findViewById(R.id.fd3),R.raw.afd2);
       listener0((ImageView)findViewById(R.id.gd3),R.raw.agd2);
       listener0((ImageView)findViewById(R.id.ad3),R.raw.aad2);
       listener0((ImageView)findViewById(R.id.cd4),R.raw.acd3);
       listener0((ImageView)findViewById(R.id.dd4),R.raw.add3);
       listener0((ImageView)findViewById(R.id.fd4),R.raw.afd3);
       listener0((ImageView)findViewById(R.id.gd4),R.raw.agd3);
       listener0((ImageView)findViewById(R.id.ad4),R.raw.aad3);
       listener0((ImageView)findViewById(R.id.cd5),R.raw.acd4);
       listener0((ImageView)findViewById(R.id.dd5),R.raw.add4);
       listener0((ImageView)findViewById(R.id.fd5),R.raw.afd4);
       listener0((ImageView)findViewById(R.id.gd5),R.raw.agd4);
       listener0((ImageView)findViewById(R.id.ad5),R.raw.aad4);
       listener0((ImageView)findViewById(R.id.cd6),R.raw.acd5);
       listener0((ImageView)findViewById(R.id.dd6),R.raw.add5);
       listener0((ImageView)findViewById(R.id.fd6),R.raw.afd5);
       listener0((ImageView)findViewById(R.id.gd6),R.raw.agd5);
       listener0((ImageView)findViewById(R.id.ad6),R.raw.aad5);
       listener0((ImageView)findViewById(R.id.cd7),R.raw.acd6);
       listener0((ImageView)findViewById(R.id.dd7),R.raw.add6);
       listener0((ImageView)findViewById(R.id.fd7),R.raw.afd6);
       listener0((ImageView)findViewById(R.id.gd7),R.raw.agd6);
       listener0((ImageView)findViewById(R.id.ad7),R.raw.aad6);

       l1=(ImageView)findViewById(R.id.l_arrow);
       l2=(ImageView)findViewById(R.id.left_arrow);
       r1=(ImageView)findViewById(R.id.r_arrow);
       r2=(ImageView)findViewById(R.id.right_arrow);
       l2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(0<=progress&&progress<=6)
               {progress=0;
                         seekBar.setProgress(progress);
               keys.scrollTo(progress*54,0);
               }else{
                   progress=progress-6;
                   seekBar.setProgress(progress);
                }
           }
       });
       l1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               progress = 0;
               seekBar.setProgress(progress);
               keys.scrollTo(progress*54,0);
           }
       });
       r2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(94<=progress&&progress<=100)
               {progress=100;
                   seekBar.setProgress(progress);
                   keys.scrollTo(progress*54,0);
               }else{
                   progress+=6;
                   seekBar.setProgress(progress);
                   keys.scrollTo(progress*54,0);
               }
           }
       });
       r1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               progress =100;
               seekBar.setProgress(progress);
               keys.scrollTo(progress*54,0);
           }
       });


   }

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {


            if(mediaPlayer!=null){
                Log.e("my app", "mediarelease: ");
                mediaPlayer.release();
                mediaPlayer=null;
            }
        }

    };

}
