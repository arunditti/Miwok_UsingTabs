package com.arunditti.android.miwok_usingtabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersView = (TextView) findViewById(R.id.numbers);
        numbersView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberIntent);
            }
        });

        //Find the view that shows the family category
        TextView family = (TextView) findViewById(R.id.family);
        //Set the clickListener on that view
        family.setOnClickListener(new View.OnClickListener() {
            //The code on this method will be executed when the numbers view is clicked
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        //Find the view that shows colors category
        TextView colors = (TextView) findViewById(R.id.colors);
        //Set a clickListener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            //This code will be executed when colors view is clicked
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        //Find the view that shows phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //Set a clickListener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            //This code willbe executed when phrases view is clicked
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }
}
