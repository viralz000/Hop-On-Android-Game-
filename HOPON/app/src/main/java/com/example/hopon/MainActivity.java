package com.example.hopon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static boolean isMute;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_forefragment1);

        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Stage1.class));
            }
        });

        final Intent svc = new Intent(MainActivity.this, com.example.hopon.BackgroundSound_Service.class);
        startService(svc);

        final ImageView volumeCtrl= findViewById(R.id.volumectrl);

        volumeCtrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isMute = !isMute;
                if (isMute) {
                    volumeCtrl.setImageResource(R.drawable.ic_volume_off_black_24dp);
                    stopService(svc);
                }
                else {
                    volumeCtrl.setImageResource(R.drawable.ic_volume_up_black_24dp);
                    startService(svc);
                }
            }
        });


    }

}
