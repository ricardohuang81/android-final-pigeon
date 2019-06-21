package qcc.cuny.project_3_huang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ------ Activity buildings app ------
        // objects to start buildings, music, endangered, and car apps
        final Button btnBuildingsApp = findViewById(R.id.btnBuildingsApp);
        final Button btnMusicApp = findViewById(R.id.btnMusicApp);
        final Button btnEndangeredApp = findViewById(R.id.btnEndangeredApp);
        final Button btnCarApp = (Button)findViewById(R.id.btnCarApp);

        // objects for buttons to show buildings, music, endangered, car text, and close button
        final ToggleButton showHideBuildingsTxtBtn = findViewById(R.id.btnShowHidBuildingsTxt);
        final ToggleButton showHideMusicTxtBtn = findViewById(R.id.btnShowHideMusicTxt);
        final ToggleButton showHideEndangeredTxtBtn = findViewById(R.id.btnShowHideEndangeredTxt);
        final ToggleButton showHideCarTxtBtn = findViewById(R.id.btnShowHideCarTxt);

        // objects for buildings, music, endangered, and car text
        final TextView buildingsTxt = findViewById(R.id.textBuildings);
        final TextView musicTxt = findViewById(R.id.textMusic);
        final TextView endangeredTxt = findViewById(R.id.textEndangered);
        final TextView carTxt = findViewById(R.id.textCar);

        buildingsTxt.setHeight(0);
        musicTxt.setHeight(0);
        endangeredTxt.setHeight(0);
        carTxt.setHeight(0);

        // event listener to show buildings text and close button
        showHideBuildingsTxtBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (buildingsTxt.getVisibility() == View.VISIBLE ) {
                    buildingsTxt.setHeight(0);
                    buildingsTxt.setVisibility(View.INVISIBLE);
                    btnBuildingsApp.setVisibility(View.INVISIBLE);
                } else {
                    buildingsTxt.setHeight(310);
                    buildingsTxt.setVisibility(View.VISIBLE);
                    btnBuildingsApp.setVisibility(View.VISIBLE);
                }
            }
        });

        // Button to link to Buildings activity
        btnBuildingsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Buildings.class));
            }
        });

        // event listener to show Music text and close button
        showHideMusicTxtBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (musicTxt.getVisibility() == View.VISIBLE ) {
                    musicTxt.setHeight(0);
                    musicTxt.setVisibility(View.INVISIBLE);
                    btnMusicApp.setVisibility(View.INVISIBLE);
                } else {
                    musicTxt.setHeight(220);
                    musicTxt.setVisibility(View.VISIBLE);
                    btnMusicApp.setVisibility(View.VISIBLE);
                }
            }
        });

        // Button to link to Music activity
        btnMusicApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Music.class));
            }
        });

        // event listener to show Endangered text and close button
        showHideEndangeredTxtBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (endangeredTxt.getVisibility() == View.VISIBLE ) {
                    endangeredTxt.setHeight(0);
                    endangeredTxt.setVisibility(View.INVISIBLE);
                    btnEndangeredApp.setVisibility(View.INVISIBLE);
                } else {
                    endangeredTxt.setHeight(330);
                    endangeredTxt.setVisibility(View.VISIBLE);
                    btnEndangeredApp.setVisibility(View.VISIBLE);
                }
            }
        });

        // Button to link Test Activity
        btnEndangeredApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( MainActivity.this, Endangered.class));
            }
        });

        // event listener to show Car text and close button
        showHideCarTxtBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (carTxt.getVisibility() == View.VISIBLE ) {
                    carTxt.setHeight(0);
                    carTxt.setVisibility(View.INVISIBLE);
                    btnCarApp.setVisibility(View.INVISIBLE);
                } else {
                    carTxt.setHeight(250);
                    carTxt.setVisibility(View.VISIBLE);
                    btnCarApp.setVisibility(View.VISIBLE);
                }
            }
        });

        // Button to link to Car activity
        btnCarApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Car.class));
            }
        });
    }
}
