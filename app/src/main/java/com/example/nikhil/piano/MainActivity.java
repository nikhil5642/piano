package com.example.nikhil.piano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
private int x=1;
    public void left(){
        ImageView l=(ImageView)findViewById(R.id.left);
       l.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               x--;
               setImage();
           }
       });
         }
    public void right(){
        ImageView r=(ImageView)findViewById(R.id.right);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x++;
                setImage();
            }
        });
         }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView Keyboard=(ImageView)findViewById(R.id.piano);
        Keyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Piano_Keyboard.class);
                startActivity(intent);
            }
        });
left();
        right();
    }
    public void setImage(){
        ImageView i=(ImageView)findViewById(R.id.piano);
        if(x==1){
            i.setImageResource(R.drawable.bright_piano);
        }
        else if(x==0){
            i.setImageResource(R.drawable.electric_pinao);
                  }
        else if(x==2){
            i.setImageResource(R.drawable.grand_piano);
        }
        else if(x==3){
            x=0;
            i.setImageResource(R.drawable.electric_pinao);
        }
        else if(x==-1){
            x=2;
            i.setImageResource(R.drawable.grand_piano);
        }

    }
}
