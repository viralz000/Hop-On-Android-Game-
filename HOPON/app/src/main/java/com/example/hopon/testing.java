package com.example.hopon;

import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class testing extends AppCompatActivity implements View.OnTouchListener {

    private float x;
    private float y;

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        x = event.getX();
        y = event.getY();

        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:

            break;
        }

        return false;
    }
}
