package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Urban on 5/5/17.
 */

public class NumbersClickListner implements View.OnClickListener {

    @Override
    public  void onClick(View view){
        Toast.makeText(view.getContext(), "Opens the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
