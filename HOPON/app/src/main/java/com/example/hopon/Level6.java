package com.example.hopon;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Level6 extends AppCompatActivity  implements View.OnTouchListener {


    private ImageView motor;
    private ImageView behind;
    private Drawable motorleft, motorright, motordown, motorup, motortworight, motortwoup, motortwoleft, motortwodown;
    private float motorX, motorY;
    private boolean action_up, action_down, action_right, action_left;
    private float x;
    private float y;
    private Button start = null;

    private Integer images[] = {
            R.drawable.green,                //0
            R.drawable.curvegreen1,          //1
            R.drawable.curvegreen2,          //2
            R.drawable.curvegreen3,          //3
            R.drawable.curvegreen4,          //4
            R.drawable.curvedroad1,           //5
            R.drawable.curvedroad2,           //6
            R.drawable.curvedroad3,           //7
            R.drawable.curvedroad4,           //8
            R.drawable.curveroadwithgreen1,  //9
            R.drawable.curveroadwithgreen2,  //10
            R.drawable.curveroadwithgreen3,  //11
            R.drawable.curveroadwithgreen4,  //12
            R.drawable.straightroadhorizontal,//13
            R.drawable.straightroadvertical, //14
            R.drawable.threewayroad1,        //15
            R.drawable.threewayroad2,       //16
            R.drawable.threewayroad3,       //17
            R.drawable.threewayroad4,       //18
            R.drawable.fourwayroad,         //19
            R.drawable.house,               //20
            R.drawable.mosque,              //21
            R.drawable.marikinacity,        //22
            R.drawable.caloocancity,        //23
            R.drawable.quezoncity,          //24
            R.drawable.manilacity,          //25
            R.drawable.tree,                //26
            R.drawable.trees,               //27
            R.drawable.blue,                //28
            R.drawable.red_human,       //29
            R.drawable.red_human,          //30
            R.drawable.yellow_human,         //31

    };

    int CURR_ROW = 23;
    int CURR_COL = 13;

    final int map_val[][] = {{28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 1, 26, 0, 0, 0, 0, 0, 20, 2, 28, 28},
            {28, 1, 0, 14, 27, 0, 23, 0, 0, 14, 0, 2, 28},
            {28, 0, 0, 18, 13, 15, 13, 15, 13, 16, 0, 0, 28},
            {28, 0, 0, 14, 0, 14, 0, 14, 0, 14, 0, 0, 28},
            {28, 0, 0, 18, 13, 16, 0, 18, 13, 16, 26, 0, 28},
            {28, 0, 0, 14, 30, 18, 13, 16, 29, 14, 0, 0, 28},
            {28, 0, 0, 18, 13, 16, 0, 18, 13, 16, 0, 0, 28},
            {28, 0, 0, 14, 0, 14, 0, 14, 0, 14, 0, 0, 28},
            {28, 3, 0, 18, 13, 17, 13, 17, 13, 16, 26, 0, 28},
            {28, 28, 3, 14, 27, 0, 0, 0, 0, 14, 4, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28}};

    ArrayList<ImageView> grids = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        setContentView(R.layout.level_6);

        for (int j = 1; j <= CURR_ROW; j++) {
            for (int i = 1; i <= CURR_COL; i++) {
                int res = getResources().getIdentifier("map_" + j + "_" + i, "id", getPackageName());
                grids.add((ImageView) findViewById(res));
            }
        }

        int arr_ind = 0;
        for (int j = 0; j < CURR_ROW; j++) {
            for (int i = 0; i < CURR_COL; i++) {
                grids.get(arr_ind++).setImageResource(images[map_val[j][i]]);
            }
        }


        motor = findViewById(R.id.yellowmotor);
        behind = findViewById(R.id.map_14_4);
        motorright = getResources().getDrawable(R.drawable.redtopsingleright);
        motorleft = getResources().getDrawable(R.drawable.redtopsingleleft);
        motordown = getResources().getDrawable(R.drawable.redtopsingledown);
        motorup = getResources().getDrawable(R.drawable.redtopsingleup);
        motortwoup = getResources().getDrawable(R.drawable.redtoptwoup);
        motortwoleft = getResources().getDrawable(R.drawable.redtoptwoleft);
        motortworight = getResources().getDrawable(R.drawable.redtoptworight);
        motortwodown = getResources().getDrawable(R.drawable.redtoptwodown);
        findViewById(R.id.actionup).setOnTouchListener(this);
        findViewById(R.id.actionleft).setOnTouchListener(this);
        findViewById(R.id.actionright).setOnTouchListener(this);
        findViewById(R.id.actiondown).setOnTouchListener(this);
        findViewById(R.id.retry).setOnTouchListener(this);
        findViewById(R.id.backk).setOnTouchListener(this);
    }





    ArrayList<ImageView> stack = new ArrayList<>();
    int q = 0;
    boolean customer = false;
    boolean customer2 = false;
    boolean house = false;
    int replace = 0;
    int replace2 = 0;
    @Override
    public boolean onTouch(View v, MotionEvent me) {

        if (me.getAction() == MotionEvent.ACTION_DOWN) {
            switch(v.getId()) {
                case R.id.backk:
                    startActivity(new Intent(Level6.this, Stage1.class));
                    break;
                case R.id.retry:
                    startActivity(new Intent(Level6.this, Level6.class));
                    break;
                case R.id.actionup:
                    int arr_ind = 0;
                    boolean done = false;
                    for (int j = 0; j < CURR_ROW;j++ ) {
                        for (int i = 0; i < CURR_COL; i++) {
                            if (grids.get(arr_ind).getX() == motor.getX() && grids.get(arr_ind).getY() == motor.getY()) {
                                if (map_val[j - 1][i] >= 5 && map_val[j - 1][i] <= 19) {
                                    if (map_val[j-2][i] == 23 && customer && customer2) {
                                        house = true;
                                    }
                                    for (int h = 1; h<stack.size(); h++) {
                                        if (grids.get(arr_ind) == stack.get(h)) {
                                            startActivity(new Intent(Level6.this, Level6failed.class));
                                            break;
                                        }
                                    }
                                    grids.get(arr_ind).setColorFilter(Color.RED, PorterDuff.Mode.LIGHTEN);
                                    stack.add(grids.get(arr_ind));
                                    motor.setImageDrawable(motorup);
                                    motor.setY(motor.getY() - findViewById(R.id.map_7_4).getHeight());
                                    done = true;
                                    if (customer || customer2) {
                                        motor.setImageDrawable(motortwoup);
                                        if (house && customer2) {
                                            startActivity(new Intent(Level6.this, Level6success.class));
                                        }
                                    }
                                    break;
                                }
                            }
                            arr_ind++;
                        }
                        if (done) {
                            break;
                        }
                    }
                    break;
                case R.id.actionleft:
                    int arr_ind1 = 0;
                    boolean done1 = false;
                    for (int j = 0; j < CURR_ROW;j++ ) {
                        for (int i = 0; i < CURR_COL; i++) {
                            if (grids.get(arr_ind1).getX() == motor.getX() && grids.get(arr_ind1).getY() == motor.getY()) {
                                if (map_val[j][i-1] >= 5 && map_val[j][i-1] <= 19) {
                                    if (map_val[j][i-1] == 13 && map_val[j-1][i-1] == 30) {
                                        customer = true;
                                        replace++;
                                        if (replace == 1) {
                                            grids.get(134).setImageResource(images[map_val[j][i-4]]);
                                        }
                                    }
                                    if (map_val[j][i-1] == 13 && map_val[j-1][i-1] == 29) {
                                        customer2 = true;
                                        replace2++;
                                        if (replace2 == 1) {
                                            grids.get(138).setImageResource(images[map_val[j-1][i+2]]);
                                        }
                                    }
                                    if (map_val[j-1][i-1] == 23 && customer && customer2) {
                                        house = true;
                                    }
                                    for (int h = 1; h<stack.size(); h++) {
                                        if (grids.get(arr_ind1) == stack.get(h)) {
                                            startActivity(new Intent(Level6.this, Level6failed.class));
                                            break;
                                        }
                                    }
                                    grids.get(arr_ind1).setColorFilter(Color.RED, PorterDuff.Mode.LIGHTEN);
                                    stack.add(grids.get(arr_ind1));
                                    motor.setImageDrawable(motorleft);
                                    motor.setX(motor.getX() - findViewById(R.id.map_7_4).getWidth());
                                    done1 = true;
                                    if (customer || customer2) {
                                        motor.setImageDrawable(motortwoleft);
                                        if (house && customer2) {
                                            startActivity(new Intent(Level6.this, Level6success.class));
                                        }
                                    }
                                    break;
                                }
                            }
                            arr_ind1++;
                        }
                        if (done1) {
                            break;
                        }
                    }
                    break;
                case R.id.actionright:
                    int arr_ind2 = 0;
                    boolean done2 = false;
                    for (int j = 0; j < CURR_ROW;j++ ) {
                        for (int i = 0; i < CURR_COL; i++) {
                            if (grids.get(arr_ind2).getX() == motor.getX() && grids.get(arr_ind2).getY() == motor.getY()) {
                                if (map_val[j][i+1] >= 5 && map_val[j][i+1] <= 19) {
                                    if (map_val[j][i+1] == 13 && map_val[j-1][i+1] == 30) {
                                        customer = true;
                                        replace++;
                                        if (replace == 1) {
                                            grids.get(134).setImageResource(images[map_val[j - 1][i-1]]);
                                        }
                                    }
                                    if (map_val[j][i+1] == 13 && map_val[j-1][i+1] == 29) {
                                        customer2 = true;
                                        replace2++;
                                        if (replace2 == 1) {
                                            grids.get(138).setImageResource(images[map_val[j+3][i+1]]);
                                        }
                                    }
                                    if (map_val[j-1][i+1] == 23 && customer && customer2) {
                                        house = true;
                                    }
                                    for (int h = 1; h<stack.size(); h++) {
                                        if (grids.get(arr_ind2) == stack.get(h)) {
                                            startActivity(new Intent(Level6.this, Level6failed.class));
                                            break;
                                        }
                                    }
                                    grids.get(arr_ind2).setColorFilter(Color.RED, PorterDuff.Mode.LIGHTEN);
                                    stack.add(grids.get(arr_ind2));
                                    motor.setImageDrawable(motorright);
                                    motor.setX(motor.getX() + findViewById(R.id.map_7_4).getWidth());
                                    done2 = true;
                                    if (customer || customer2) {
                                        motor.setImageDrawable(motortworight);
                                        if (house && customer2) {
                                            startActivity(new Intent(Level6.this, Level6success.class));
                                        }
                                    }
                                    break;
                                }
                            }
                            arr_ind2++;
                        }
                        if (done2) {
                            break;
                        }
                    }
                    break;
                case R.id.actiondown:
                    int arr_ind3 = 0;
                    boolean done3 = false;
                    for (int j = 0; j < CURR_ROW;j++ ) {
                        for (int i = 0; i < CURR_COL; i++) {
                            if (grids.get(arr_ind3).getX() == motor.getX() && grids.get(arr_ind3).getY() == motor.getY()) {
                                if (map_val[j+1][i] >= 5 && map_val[j+1][i] <= 19 ) {
                                    if (map_val[j][i-1] == 13 && map_val[j-1][i-1] == 29) {
                                        customer2 = true;
                                        replace2++;
                                        if (replace == 1) {
                                            grids.get(138).setImageResource(images[map_val[j-1][i+3]]);
                                        }
                                    }
                                    if (map_val[j+2][i] == 23 && customer && customer2) {
                                        house = true;
                                    }
                                    for (int h = 1; h<stack.size(); h++) {
                                        if (grids.get(arr_ind3) == stack.get(h)) {
                                            startActivity(new Intent(Level6.this, Level6failed.class));
                                            break;
                                        }
                                    }
                                    grids.get(arr_ind3).setColorFilter(Color.RED, PorterDuff.Mode.LIGHTEN);
                                    stack.add(grids.get(arr_ind3));
                                    motor.setImageDrawable(motordown);
                                    motor.setY(motor.getY() + findViewById(R.id.map_7_4).getHeight());
                                    done3 = true;
                                    if (customer || customer2) {
                                        motor.setImageDrawable(motortwodown);
                                        if (house && customer2) {
                                            startActivity(new Intent(Level6.this, Level6success.class));
                                        }
                                    }
                                    break;
                                }
                            }
                            arr_ind3++;
                        }
                        if (done3) {
                            break;
                        }
                    }
                    break;
            }
        }
        else {
            action_up = false;
            action_right = false;
            action_left = false;
            action_down = false;
        }
        return true;
    }
}

