/**
 * Author               :       Cloyd Van S. Secuya
 * Filename             :       MusicNewsActivity2.java
 * Date of Creation     :       December 4, 2022
 * Description          :       The article of this screen is about movie streaming and music
 */

// PACKAGE SECTION
package com.secuya.android.musicnews.api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicNewsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_news2);

        /**
         * Add event listeners to the buttons at activity_music_news2
         * Button: goBackHome
         */
        Button goBackHome = (Button) findViewById(R.id.goBackHome);

        // Event handling
        goBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Navigate to home (main) screen */
                System.out.println("Navigating to screen 1 with Article 1");
                Intent intent_main = new Intent(getApplicationContext(), MainActivity.class);
                /* Begin starting the Home (main) screen */
                startActivity(intent_main);
            }
        });
    }
}