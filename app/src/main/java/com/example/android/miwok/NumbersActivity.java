package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


        // Verify the contents of the array by printing out each array element to the logs
        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int index = 0;

        /*while(index < words.size()){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);

            index++;
        }*/

        for (int i=0; i < words.size(); i++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }

    }
}
