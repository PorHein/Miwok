package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Set the content of the activity to use the activity_main.xml layout file
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        // Set a clicklistener on the View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new inent to open the(NumbersActivity)
                Intent numbersIntent = new Intent(MainActivity.this,
                        NumbersActivity.class);

                //Start the new activity
                startActivity(numbersIntent);
            }
        });

        //Find the View that shows the numbers category
        TextView family = (TextView) findViewById(R.id.family);
        // Set a clicklistener on the View
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new inent to open the(NumbersActivity)
                Intent familyIntent = new Intent(MainActivity.this,
                        FamilyActivity.class);

                //Start the new activity
                startActivity(familyIntent);
            }
        });

        //Find the View that shows the numbers category
        TextView colors = (TextView) findViewById(R.id.colors);
        // Set a clicklistener on the View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new inent to open the(NumbersActivity)
                Intent colorsIntent = new Intent(MainActivity.this,
                        ColorsActivity.class);

                //Start the new activity
                startActivity(colorsIntent);
            }
        });

        //Find the View that shows the numbers category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        // Set a clicklistener on the View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create a new inent to open the(NumbersActivity)
                Intent phrasesIntent = new Intent(MainActivity.this,
                        PhrasesActivity.class);

                //Start the new activity
                startActivity(phrasesIntent);
            }
        });

    }

}