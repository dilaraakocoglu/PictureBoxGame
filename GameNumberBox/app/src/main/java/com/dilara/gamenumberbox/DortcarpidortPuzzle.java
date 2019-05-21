package com.dilara.gamenumberbox;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DortcarpidortPuzzle extends AppCompatActivity {

    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    Button btn_start;
    TextView TotalMove;
    int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    boolean flag = false;
    Random random = new Random();
    int i=0, rn,j,hamle=0;
    List<Drawable> list;
    List<Drawable> images;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dortcarpidort_puzzle);

        btn_start = findViewById(R.id.btn_start);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);


        TotalMove = findViewById(R.id.txtTotalMoves);


    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onClick(View v){

        if (v.getId()== R.id.btn_start) {

            for (i = 0; i <= 14; i++)
                a[i] = 0;

            i = 0;
            do {
                rn = random.nextInt(15) + 1;
                flag = false;
                //outerloop:
                for (j = 0; j <= 15; j++) {

                    if (a[j] == rn) {
                        flag = true;
                        break;
                    }
                }
                if (flag == true) {
                    flag = false;
                } else {
                    a[i] = rn;
                    i = i + 1;
                }


            } while (i <= 14);

            list = new ArrayList<Drawable>();
            images = new ArrayList<Drawable>();

            images.add(getResources().getDrawable(R.drawable.gri));

            list.add(getResources().getDrawable(R.drawable.gri));
            list.add(getResources().getDrawable(R.drawable.manzara1));
            list.add(getResources().getDrawable(R.drawable.manzara2));
            list.add(getResources().getDrawable(R.drawable.manzara3));
            list.add(getResources().getDrawable(R.drawable.manzara4));
            list.add(getResources().getDrawable(R.drawable.manzara5));
            list.add(getResources().getDrawable(R.drawable.manzara6));
            list.add(getResources().getDrawable(R.drawable.manzara7));
            list.add(getResources().getDrawable(R.drawable.manzara8));
            list.add(getResources().getDrawable(R.drawable.manzara9));
            list.add(getResources().getDrawable(R.drawable.manzara10));
            list.add(getResources().getDrawable(R.drawable.manzara11));
            list.add(getResources().getDrawable(R.drawable.manzara12));
            list.add(getResources().getDrawable(R.drawable.manzara13));
            list.add(getResources().getDrawable(R.drawable.manzara14));
            list.add(getResources().getDrawable(R.drawable.manzara15));

            for (int k =0; k<=14; k++){

                images.add(list.get(a[k]));

            }

            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.VISIBLE);
            btn6.setVisibility(View.VISIBLE);
            btn7.setVisibility(View.VISIBLE);
            btn8.setVisibility(View.VISIBLE);
            btn9.setVisibility(View.VISIBLE);
            btn10.setVisibility(View.VISIBLE);
            btn11.setVisibility(View.VISIBLE);
            btn12.setVisibility(View.VISIBLE);
            btn13.setVisibility(View.VISIBLE);
            btn14.setVisibility(View.VISIBLE);
            btn15.setVisibility(View.VISIBLE);
            btn16.setVisibility(View.VISIBLE);

            TotalMove.setVisibility(View.VISIBLE);

            btn1.setBackground(images.get(1));
            btn2.setBackground(images.get(2));
            btn3.setBackground(images.get(3));
            btn4.setBackground(images.get(4));
            btn5.setBackground(images.get(5));
            btn6.setBackground(images.get(6));
            btn7.setBackground(images.get(7));
            btn8.setBackground(images.get(8));
            btn9.setBackground(images.get(9));
            btn10.setBackground(images.get(10));
            btn11.setBackground(images.get(11));
            btn12.setBackground(images.get(12));
            btn13.setBackground(images.get(13));
            btn14.setBackground(images.get(14));
            btn15.setBackground(images.get(15));
            btn16.setBackground(images.get(0));

            hamle = 0;

            SolveCheck();
        }
        else if (v.getId()==R.id.btn16){

            // Tıklandıgında
            if (btn12.getBackground() == images.get(0)) {
                btn12.setBackground(btn16.getBackground());
                btn16.setBackground(images.get(0));
            }
            if (btn15.getBackground() == images.get(0)) {
                btn15.setBackground(btn16.getBackground());
                btn16.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn15){

            if (btn16.getBackground() == images.get(0)) {
                btn16.setBackground(btn15.getBackground());
                btn15.setBackground(images.get(0));
            }
            if (btn14.getBackground() == images.get(0)) {
                btn14.setBackground(btn15.getBackground());
                btn15.setBackground(images.get(0));
            }
            if (btn11.getBackground() == images.get(0)) {
                btn11.setBackground(btn15.getBackground());
                btn15.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn14){

            // CheckButton 2,3,6
            if (btn15.getBackground() == images.get(0)) {
                btn15.setBackground(btn14.getBackground());
                btn14.setBackground(images.get(0));
            }
            if (btn10.getBackground() == images.get(0)) {
                btn10.setBackground(btn14.getBackground());
                btn14.setBackground(images.get(0));
            }
            if (btn13.getBackground() == images.get(0)) {
                btn13.setBackground(btn14.getBackground());
                btn14.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn13){
            if (btn14.getBackground() == images.get(0)) {
                btn14.setBackground(btn13.getBackground());
                btn13.setBackground(images.get(0));
            }
            if (btn9.getBackground() == images.get(0)) {
                btn9.setBackground(btn13.getBackground());
                btn13.setBackground(images.get(0));
            }
            SolveCheck();
        }
        else if(v.getId()==R.id.btn12){

            if (btn16.getBackground() == images.get(0)) {
                btn16.setBackground(btn12.getBackground());
                btn12.setBackground(images.get(0));
            }
            if (btn11.getBackground() == images.get(0)) {
                btn11.setBackground(btn12.getBackground());
                btn12.setBackground(images.get(0));
            }
            if (btn8.getBackground() == images.get(0)) {
                btn8.setBackground(btn12.getBackground());
                btn12.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn11){

            if (btn15.getBackground() == images.get(0)) {
                btn15.setBackground(btn11.getBackground());
                btn11.setBackground(images.get(0));
            }
            if (btn12.getBackground() == images.get(0)) {
                btn12.setBackground(btn11.getBackground());
                btn11.setBackground(images.get(0));
            }
            if (btn10.getBackground() == images.get(0)) {
                btn10.setBackground(btn11.getBackground());
                btn11.setBackground(images.get(0));
            }
            if (btn7.getBackground() == images.get(0)) {
                btn7.setBackground(btn11.getBackground());
                btn11.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn10){

            if (btn14.getBackground() == images.get(0)) {
                btn14.setBackground(btn10.getBackground());
                btn10.setBackground(images.get(0));
            }
            if (btn11.getBackground() == images.get(0)) {
                btn11.setBackground(btn10.getBackground());
                btn10.setBackground(images.get(0));
            }
            if (btn9.getBackground() == images.get(0)) {
                btn9.setBackground(btn10.getBackground());
                btn10.setBackground(images.get(0));
            }
            if (btn6.getBackground() == images.get(0)) {
                btn6.setBackground(btn10.getBackground());
                btn10.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn9){
            if (btn13.getBackground() == images.get(0)) {
                btn13.setBackground(btn9.getBackground());
                btn9.setBackground(images.get(0));
            }
            if (btn10.getBackground() == images.get(0)) {
                btn10.setBackground(btn9.getBackground());
                btn9.setBackground(images.get(0));
            }
            if (btn5.getBackground() == images.get(0)) {
                btn5.setBackground(btn9.getBackground());
                btn9.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn8){

            if (btn12.getBackground() == images.get(0)) {
                btn12.setBackground(btn8.getBackground());
                btn8.setBackground(images.get(0));
            }
            if (btn7.getBackground() == images.get(0)) {
                btn7.setBackground(btn8.getBackground());
                btn8.setBackground(images.get(0));
            }
            if (btn4.getBackground() == images.get(0)) {
                btn4.setBackground(btn8.getBackground());
                btn8.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn7){

            if (btn11.getBackground() == images.get(0)) {
                btn11.setBackground(btn7.getBackground());
                btn7.setBackground(images.get(0));
            }
            if (btn8.getBackground() == images.get(0)) {
                btn8.setBackground(btn7.getBackground());
                btn7.setBackground(images.get(0));
            }
            if (btn6.getBackground() == images.get(0)) {
                btn6.setBackground(btn7.getBackground());
                btn7.setBackground(images.get(0));
            }
            if (btn3.getBackground() == images.get(0)) {
                btn3.setBackground(btn7.getBackground());
                btn7.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn6){

            if (btn10.getBackground() == images.get(0)) {
                btn10.setBackground(btn6.getBackground());
                btn6.setBackground(images.get(0));
            }
            if (btn7.getBackground() == images.get(0)) {
                btn7.setBackground(btn6.getBackground());
                btn6.setBackground(images.get(0));
            }
            if (btn5.getBackground() == images.get(0)) {
                btn5.setBackground(btn6.getBackground());
                btn6.setBackground(images.get(0));
            }
            if (btn2.getBackground() == images.get(0)) {
                btn2.setBackground(btn6.getBackground());
                btn6.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn5){

            if (btn9.getBackground() == images.get(0)) {
                btn9.setBackground(btn5.getBackground());
                btn5.setBackground(images.get(0));
            }
            if (btn6.getBackground() == images.get(0)) {
                btn6.setBackground(btn5.getBackground());
                btn5.setBackground(images.get(0));
            }
            if (btn1.getBackground() == images.get(0)) {
                btn1.setBackground(btn5.getBackground());
                btn5.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn4){

            if (btn8.getBackground() == images.get(0)) {
                btn8.setBackground(btn4.getBackground());
                btn4.setBackground(images.get(0));
            }
            if (btn3.getBackground() == images.get(0)) {
                btn3.setBackground(btn4.getBackground());
                btn4.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn3){

            if (btn7.getBackground() == images.get(0)) {
                btn7.setBackground(btn3.getBackground());
                btn3.setBackground(images.get(0));
            }
            if (btn4.getBackground() == images.get(0)) {
                btn4.setBackground(btn3.getBackground());
                btn3.setBackground(images.get(0));
            }
            if (btn2.getBackground() == images.get(0)) {
                btn2.setBackground(btn3.getBackground());
                btn3.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn2){

            if (btn6.getBackground() == images.get(0)) {
                btn6.setBackground(btn2.getBackground());
                btn2.setBackground(images.get(0));
            }
            if (btn3.getBackground() == images.get(0)) {
                btn3.setBackground(btn2.getBackground());
                btn2.setBackground(images.get(0));
            }
            if (btn1.getBackground() == images.get(0)) {
                btn1.setBackground(btn2.getBackground());
                btn2.setBackground(images.get(0));
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn1){

            if (btn5.getBackground() == images.get(0)) {
                btn5.setBackground(btn1.getBackground());
                btn1.setBackground(images.get(0));
            }
            if (btn2.getBackground() == images.get(0)) {
                btn2.setBackground(btn1.getBackground());
                btn1.setBackground(images.get(0));
            }
            SolveCheck();

        }

    }

    public void SolveCheck(){

        TotalMove.setText("Total Move : " + hamle);

        int blueColorValue = Color.parseColor(	"#008577");
        int greenColorValue = Color.parseColor("#83AFA0");

        if ((btn1.getBackground()==list.get(1))&& (btn2.getBackground()==list.get(2))&& (btn3.getBackground()==list.get(3)) && (btn4.getBackground()==list.get(4)) && (btn5.getBackground()==list.get(5)) && (btn6.getBackground()==list.get(6)) && (btn7.getBackground()==list.get(7)) && (btn8.getBackground()==list.get(8)) &&
                (btn9.getBackground()==list.get(9)) && (btn10.getBackground()==list.get(10)) && (btn11.getBackground()==list.get(11)) && (btn12.getBackground()==list.get(12)) && (btn13.getBackground()==list.get(13)) && (btn14.getBackground()==list.get(14)) && (btn15.getBackground()==list.get(15)))
        {

            btn_start.getBackground().setColorFilter(greenColorValue, PorterDuff.Mode.MULTIPLY);
            btn_start.setText("RESTART?");
            Toast.makeText(DortcarpidortPuzzle.this,"You WIN!!!",Toast.LENGTH_SHORT).show();
            //reklamiYukle();

            if (hamle<=50 && hamle>0){

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_gold, (ViewGroup) findViewById(R.id.custom_toast_gold_layout_id));

                TextView text = (TextView) layout.findViewById(R.id.text);
                text.setText("Genius! First Rank 0-50");

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();

            }
            else if(hamle<=100 && hamle>50){
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_silver, (ViewGroup) findViewById(R.id.custom_toast_silver_layout_id));

                TextView text = (TextView) layout.findViewById(R.id.textsilver);
                text.setText("Smart! Second Rank 51-100");

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();

            }
            else if (hamle<=200 && hamle>100){

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_bronze, (ViewGroup) findViewById(R.id.custom_toast_bronze_layout_id));

                TextView text = (TextView) layout.findViewById(R.id.textbronze);
                text.setText("You Win! Third Rank 101-200");

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
            else if (hamle>200){

                Toast.makeText(getApplicationContext(),"You can better than this!",Toast.LENGTH_LONG).show();
            }
        }
        else
        {
            hamle += 1;
        }
    }
}
