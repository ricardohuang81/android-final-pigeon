package qcc.cuny.project_3_huang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Music extends AppCompatActivity {
    // declare variables
    Button button1, button2, homeButton;
    MediaPlayer mpDrums, mpHawaiian;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        //
        // Home Button
        homeButton = findViewById(R.id.btnHome);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Music.this, MainActivity.class));
            }
        });
        //
        // media player for image1 - Drumadics
        button1 = findViewById(R.id.btnDrums);
        mpDrums = new MediaPlayer();
        mpDrums = MediaPlayer.create(this, R.raw.drumadics);
        playing = 0;
        //
        // when user clicks on btnDrums, media player will play
        Button.OnClickListener bDrumadics = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing) {
                    case 0:
                        mpDrums.start();
                        playing = 1;
                        button1.setText("Click to pause Drumadics");
                        break;
                    case 1:
                        mpDrums.pause();
                        playing = 0;
                        button1.setText("Click to resume Drumadics");
                }
            }
        }; // end of Button.OnClickListener
        button1.setOnClickListener(bDrumadics);
        //
        // media player for image2 - Hawaiian
        button2 = findViewById(R.id.btnHawaiian);
        mpHawaiian = new MediaPlayer();
        mpHawaiian = MediaPlayer.create(this, R.raw.hawaiian);
        //
        // when I click on btnHawaiian, mpHawaiian will play
        Button.OnClickListener bHawaiian = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(playing) {
                    case 0:
                        mpHawaiian.start();
                        playing = 1;
                        button2.setText("Click to pause Hawaiian Kickboxer");
                        break;
                    case 1:
                        mpHawaiian.pause();
                        playing = 0;
                        button2.setText("Click to resume Hawaiian Kickboxer");
                        break;
                }
            }
        }; // end of Button.OnClickListener
        button2.setOnClickListener(bHawaiian);
    }
}
