package com.example.hopon;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class Level1 extends AppCompatActivity {

    private float x;
    private float y;

    private ConstraintLayout myLayout = null;

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
            R.drawable.blue };              //28


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        int CURR_ROW = 23;
        int CURR_COL = 13;

        int map_val[][] ={  {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
                            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
                            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
                            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
                            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28},
                            {28, 1, 0, 2, 28, 1, 0, 0, 0, 0, 2, 28, 28},
                            {28, 26, 20, 0, 0, 27, 22, 0, 0, 21, 0, 27, 28},
                            {28, 9, 13, 15, 13, 13, 15, 13, 13, 15, 13, 10, 28},
                            {28, 14, 0, 14, 0, 0, 14, 0, 27, 14, 0, 14, 28},
                            {28, 14, 0, 18, 13, 13, 19, 13, 13, 16, 0, 14, 28},
                            {28, 14, 0, 14, 0, 0, 14, 0, 0, 14, 0, 14, 28},
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
                            {28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28} };

        setContentView(R.layout.level_1);

        ArrayList<ImageView> grids = new ArrayList<>();

        for (int j = 1;j <= CURR_ROW;j++) {
            for (int i = 1; i <= CURR_COL; i++) {
                int res = getResources().getIdentifier("map_" + j + "_" + i, "id", getPackageName());
                grids.add((ImageView) findViewById(res));
            }
        }

        int arr_ind = 0;
        for (int j = 0;j < CURR_ROW;j++) {
            for (int i = 0; i < CURR_COL; i++) {
                grids.get(arr_ind++).setImageResource(images[map_val[j][i]]);
            }
        }

        final ImageView img1 = (ImageView) findViewById(R.id.threeof4);

        ImageView img = (ImageView)findViewById(R.id.map_14_4);
//        red = (Button) findViewById()

        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = event.getX();
                y = event.getY();

                if(event.getAction() == MotionEvent.ACTION_MOVE) {
                    ((ImageView) findViewById(R.id.map_14_4)).setColorFilter(Color.BLUE, PorterDuff.Mode.LIGHTEN);
                    Toast.makeText(getApplicationContext(), "I was touched", Toast.LENGTH_SHORT).show();
                }
                if(event.getAction() == MotionEvent.ACTION_UP) {
                    ((ImageView) findViewById(R.id.map_14_4)).setColorFilter(null);
                }
                return true;
            }
        });



    }
}
