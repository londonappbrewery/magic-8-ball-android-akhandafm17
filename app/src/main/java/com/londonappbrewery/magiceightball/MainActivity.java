package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button askbutton = findViewById(R.id.button_ask);
        final ImageView image = findViewById(R.id.image_ball);
        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int random = r.nextInt(5);
                int[] RandomImage = {R.drawable.ball1,
                                     R.drawable.ball2,
                                     R.drawable.ball3,
                                     R.drawable.ball4,
                                     R.drawable.ball5 };

                image.setImageResource(RandomImage[random]);
            }
        });

    }
}
