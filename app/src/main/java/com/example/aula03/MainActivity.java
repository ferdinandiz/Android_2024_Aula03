package com.example.aula03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn01;
    ImageView sol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn01 = findViewById(R.id.btn01);
        sol = findViewById(R.id.sol);

        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(i);
                finish();
            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sol.setScaleX(0.5f);
                sol.setScaleY(0.5f);
                Toast.makeText(MainActivity.this,"Sol",Toast.LENGTH_SHORT).show();
            }
        });

    }
}