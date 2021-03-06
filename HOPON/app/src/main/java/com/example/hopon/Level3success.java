package com.example.hopon;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Level3success extends AppCompatActivity {


    private ImageView motor, middle;
    private ImageView behind;
    private Drawable motorleft, motorright, motordown, motorup, motortworight, motortwoup, motortwoleft, motortwodown;
    private Drawable success, fail;
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
            R.drawable.blue_human,       //29
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
            {28, 1, 0, 2, 28, 1, 0, 0, 0, 0, 2, 28, 28},
            {28, 26, 27, 0, 0, 27, 22, 0, 0, 26, 0, 27, 28},
            {28, 9, 13, 15, 13, 13, 15, 13, 13, 15, 13, 10, 28},
            {28, 14, 0, 14, 0, 0, 14, 0, 27, 14, 0, 14, 28},
            {28, 14, 0, 18, 13, 13, 19, 13, 13, 16, 0, 14, 28},
            {28, 14, 0, 14, 0, 0, 14, 0, 29, 14, 0, 14, 28},
            {28, 8, 13, 19, 13, 13, 19, 13, 13, 19, 13, 7, 28},
            {28, 28, 3, 14, 4, 28, 14, 4, 28, 14, 28, 28, 28},
            {28, 28, 28, 14, 28, 28, 14, 28, 28, 8, 13, 28, 28},
            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
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
        setContentView(R.layout.level_1success);

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

        findViewById(R.id.home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Level3success.this, MainActivity.class));
            }
        });
        findViewById(R.id.retry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Level3success.this, Level3.class));
            }
        });
        findViewById(R.id.next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Level3success.this, Level4.class));
            }
        });
    }
}


