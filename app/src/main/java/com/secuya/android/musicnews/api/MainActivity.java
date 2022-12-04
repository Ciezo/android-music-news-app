/**
 * Author               :       Cloyd Van S. Secuya
 * Filename             :       MainActivity.java
 * Date of Creation     :       December 4, 2022
 * Description          :       This is the main or 'home' screen where the overview of 2 latest
 *                              music news are displayed.
 */

// PACKAGE SECTION
package com.secuya.android.musicnews.api;

// IMPORT SECTION
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Add event listeners to the buttons at activity_main
         * Button: button_to_activity1
         * Button: button_to_activity2
         */
        Button button_to_activity1 = (Button) findViewById(R.id.button_to_activity1);
        Button button_to_activity2 = (Button) findViewById(R.id.button_to_activity2);

        // Event handling
        button_to_activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Navigate to screen 1 */
                System.out.println("Navigating to screen 1 with Article 1");
                Intent intent_screen1 = new Intent(getApplicationContext(), MusicNewsActivity1.class);
                /* Begin starting the MusicNewsActivity1 */
                startActivity(intent_screen1);
            }
        });

        button_to_activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Navigate to screen 2 */
                System.out.println("Navigating to screen 1 with Article 2");
                Intent intent_screen2 = new Intent(getApplicationContext(), MusicNewsActivity2.class);
                /* Begin starting the MusicNewsActivity1 */
                startActivity(intent_screen2);
            }
        });
    }
}