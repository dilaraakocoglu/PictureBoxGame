package com.dilara.gamenumberbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
    }

    public void Tiklandi(View v){
        if(v.getId()==R.id.btnUcerlik)
        {
           /* int a;
            a=v.getId();

            Log.i("deneme","deger: " + a);

            Log.i("deneme","deger2: " + R.id.btnUcerlik);*/

            //3x3 lük ekrana geçiş
            Intent intent = new Intent(getApplicationContext(),uccarpiuc.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.btnDorderlik)
        {
            //4x4 lük ekrana geçiş
            Intent intent = new Intent(getApplicationContext(), dortcarpidort.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.btnHelp)
        {
            //3x3 lük ekrana geçiş
            Intent intent = new Intent(getApplicationContext(),Help.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.btnPuzzleUcerlik){
            Intent intent = new Intent(getApplicationContext(),UccarpiucPuzzle.class);
            startActivity(intent);

        }
        else if(v.getId()==R.id.btnPuzzleDorderlik){

            Intent intent = new Intent(getApplicationContext(),DortcarpidortPuzzle.class);
            startActivity(intent);

        }

    }
}


