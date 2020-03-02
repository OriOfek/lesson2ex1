package com.example.lesson2ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i;
    ImageView iv;
    Random rnd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        iv=(ImageView) findViewById(R.id.imageView);
        i=0;
        rnd=new Random();
    }

    public void change(View view) {
        i=rnd.nextInt(3);
        i=i+1;
        btn.setText(String.valueOf(i));
        switch (i) {
            case 1:
                //one is frog
                iv.setImageResource(R.drawable.frog);
                break;
            case 2:
                //casw2 is elephant
                iv.setImageResource(R.drawable.elephant);
                break;
            case 3:
                //case 3 is cat
                iv.setImageResource(R.drawable.cat);
                break;
        }


    }
}

