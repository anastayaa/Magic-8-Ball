package com.tayaa.magic_8_ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button askButton;
    private ImageView ballImage;
    private Random randomNumber;
    private int[] ballImages={
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        askButton=findViewById(R.id.ask_button);
        ballImage=findViewById(R.id.ball_image);

        randomNumber=new Random();

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number=randomNumber.nextInt(4);
                ballImage.setImageResource(ballImages[number]);
            }
        });
    }
}
