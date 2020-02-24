package com.example.cointoss;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView onScreen = (TextView)findViewById(R.id.TextAppear);


        final String[] txtRandom = {"Heads","Tails"};

        Button toss = (Button)findViewById(R.id.Toss);
        final ImageView Coin = (ImageView) findViewById(R.id.CoinImage) ;

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        MediaPlayer mp;


        toss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setVolumeControlStream(AudioManager.STREAM_MUSIC);
                MediaPlayer mp;

                mp=MediaPlayer.create(getApplicationContext(),R.raw.coin_sound);
                mp.start();



                Random generator = new Random();
                int randomIndex = generator.nextInt(txtRandom.length);
                onScreen.setText(txtRandom[randomIndex]);
                if (txtRandom[randomIndex].contentEquals("Heads")){
                    Coin.setImageResource(R.drawable.head);
                } else if (txtRandom[randomIndex].contentEquals("Tails")){
                    Coin.setImageResource(R.drawable.tails);
                }
            }


        });


    }

}

