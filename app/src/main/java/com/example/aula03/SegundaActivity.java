package com.example.aula03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

   Button btn02;
   ImageView lua;

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.segunda_tela);
      btn02 = findViewById(R.id.btn02);
      lua = findViewById(R.id.lua);
      btn02.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Intent i = new Intent(SegundaActivity.this, MainActivity.class);
            startActivity(i);
            finish();
         }
      });

      lua.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Toast.makeText(SegundaActivity.this, "Lua", Toast.LENGTH_SHORT).show();
         }
      });

   }
}
