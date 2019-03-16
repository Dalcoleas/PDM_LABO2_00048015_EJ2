package com.dalcoleas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8, pic9, pic10, pic11, pic12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pic1 = findViewById(R.id.pic1);
        pic2 = findViewById(R.id.pic2);
        pic3 = findViewById(R.id.pic3);
        pic4 = findViewById(R.id.pic4);
        pic5 = findViewById(R.id.pic5);
        pic6 = findViewById(R.id.pic6);
        pic7 = findViewById(R.id.pic7);
        pic8 = findViewById(R.id.pic8);
        pic9 = findViewById(R.id.pic9);
        pic10 = findViewById(R.id.pic10);
        pic11 = findViewById(R.id.pic11);
        pic12 = findViewById(R.id.pic12);

        pic1.setOnClickListener(this);
        pic2.setOnClickListener(this);
        pic3.setOnClickListener(this);
        pic4.setOnClickListener(this);
        pic5.setOnClickListener(this);
        pic6.setOnClickListener(this);
        pic7.setOnClickListener(this);
        pic8.setOnClickListener(this);
        pic9.setOnClickListener(this);
        pic10.setOnClickListener(this);
        pic11.setOnClickListener(this);
        pic12.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int viewId = v.getId();
        int [] pics = {R.drawable.icon,R.drawable.icon2,R.drawable.icon3};

        switch (viewId) {

            case R.id.pic1:
                pic1.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic2:
                pic2.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic3:
                pic3.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic4:
                pic4.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic5:
                pic5.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic6:
                pic6.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic7:
                pic7.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic8:
                pic8.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic9:
                pic9.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic10:
                pic10.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic11:
                pic11.setImageResource(pics[new Random().nextInt(3)]);
                break;

            case R.id.pic12:
                pic12.setImageResource(pics[new Random().nextInt(3)]);
                break;
        }
    }
}
