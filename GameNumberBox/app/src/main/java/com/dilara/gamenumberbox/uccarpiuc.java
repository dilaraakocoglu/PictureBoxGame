package com.dilara.gamenumberbox;

import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class uccarpiuc extends AppCompatActivity {

    // Buttonları Tanımla
    Button btn_start;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView TotalMove;
    int a[]= {0,0,0,0,0,0,0,0,0};
    int i=0, rn,j,hamle=0;
    boolean flag=false;
    // InterstitialAd mInterstitialAd;
    Random dice = new Random();
    // Tanımlama sONU

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uccarpiuc);

        btn_start = (Button) findViewById(R.id.btn_start);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        TotalMove = (TextView) findViewById(R.id.txtTotalMoves);


    }

    public void onClick (View v){

        if (v.getId() == R.id.btn_start){
            // Start Buttonuna Tıklandığında Sayıları Karıştırsın.
            for (i = 0; i <= 7; i++)
                a[i] = 0;

            i = 0;
            do {
                rn = dice.nextInt(8) + 1;
                flag = false;
                //outerloop:
                for (j = 0; j <= 7; j++) {

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


            } while (i <= 7);
            //Buttonları Görünür Hale Getir
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn5.setVisibility(View.VISIBLE);
            btn6.setVisibility(View.VISIBLE);
            btn7.setVisibility(View.VISIBLE);
            btn8.setVisibility(View.VISIBLE);
            btn9.setVisibility(View.VISIBLE);
            TotalMove.setVisibility(View.VISIBLE);

            //reklamiYukle();
            //Random Degerleri Buttonların Uzerine Yaz
            btn1.setText("" + a[0]);
            btn2.setText("" + a[1]);
            btn3.setText("" + a[2]);
            btn4.setText("" + a[3]);
            btn5.setText("" + a[4]);
            btn6.setText("" + a[5]);
            btn7.setText("" + a[6]);
            btn8.setText("" + a[7]);
            btn9.setText("");

            hamle=0;

            SolveCheck();

            btn_start.setText("START");
        }

        else if(v.getId()==R.id.btn9){

            if (btn8.getText() == "") {
                btn8.setText(btn9.getText());
                btn9.setText("");
            }
            if (btn6.getText() == "") {
                btn6.setText(btn9.getText());
                btn9.setText("");
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn8){
            if (btn9.getText() == "") {
                btn9.setText(btn8.getText());
                btn8.setText("");
            }
            if (btn7.getText() == "") {
                btn7.setText(btn8.getText());
                btn8.setText("");
            }
            if (btn5.getText() == "") {
                btn5.setText(btn8.getText());
                btn8.setText("");
            }
            SolveCheck();

        }
        else if(v.getId()==R.id.btn7){

            if (btn8.getText() == "") {
                btn8.setText(btn7.getText());
                btn7.setText("");
            }
            if (btn4.getText() == "") {
                btn4.setText(btn7.getText());
                btn7.setText("");
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn6){

            if (btn9.getText() == "") {
                btn9.setText(btn6.getText());
                btn6.setText("");
            }
            if (btn5.getText() == "") {
                btn5.setText(btn6.getText());
                btn6.setText("");
            }
            if (btn3.getText() == "") {
                btn3.setText(btn6.getText());
                btn6.setText("");
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn5){
            if (btn8.getText() == "") {
                btn8.setText(btn5.getText());
                btn5.setText("");
            }
            if (btn6.getText() == "") {
                btn6.setText(btn5.getText());
                btn5.setText("");
            }
            if (btn4.getText() == "") {
                btn4.setText(btn5.getText());
                btn5.setText("");
            }
            if (btn2.getText() == "") {
                btn2.setText(btn5.getText());
                btn5.setText("");
            }
            SolveCheck();
        }
        else if(v.getId()==R.id.btn4){

            if (btn7.getText() == "") {
                btn7.setText(btn4.getText());
                btn4.setText("");
            }
            if (btn5.getText() == "") {
                btn5.setText(btn4.getText());
                btn4.setText("");
            }
            if (btn1.getText() == "") {
                btn1.setText(btn4.getText());
                btn4.setText("");
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn3){

            if (btn6.getText() == "") {
                btn6.setText(btn3.getText());
                btn3.setText("");
            }
            if (btn2.getText() == "") {
                btn2.setText(btn3.getText());
                btn3.setText("");
            }
            SolveCheck();
        }

        else if(v.getId()==R.id.btn2){
            if (btn5.getText() == "") {
                btn5.setText(btn2.getText());
                btn2.setText("");
            }
            if (btn3.getText() == "") {
                btn3.setText(btn2.getText());
                btn2.setText("");
            }
            if (btn1.getText() == "") {
                btn1.setText(btn2.getText());
                btn2.setText("");
            }
            SolveCheck();

        }

        else if(v.getId()==R.id.btn1){

            if (btn4.getText() == "") {
                btn4.setText(btn1.getText());
                btn1.setText("");
            }
            if (btn2.getText() == "") {
                btn2.setText(btn1.getText());
                btn1.setText("");
            }
            SolveCheck();
        }
    }

    private void SolveCheck() {

        TotalMove.setText("Total Move : " + hamle);
        if (btn1.getText().equals("1"))
            btn1.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn1.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if (btn2.getText().equals("2"))
            btn2.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn2.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if (btn3.getText().equals("3"))
            btn3.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn3.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if (btn4.getText().equals("4"))
            btn4.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn4.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if (btn5.getText().equals("5"))
            btn5.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn5.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if (btn6.getText().equals("6"))
            btn6.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn6.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if (btn7.getText().equals("7"))
            btn7.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn7.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if (btn8.getText().equals("8"))
            btn8.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn8.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if (btn9.getText().equals("9"))
            btn9.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        else
            btn9.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);

        btn9.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        if ((btn1.getText().equals("1"))&& (btn2.getText().equals("2"))&& (btn3.getText().equals("3")) && (btn4.getText().equals("4")) && (btn5.getText().equals("5")) && (btn6.getText().equals("6")) && (btn7.getText().equals("7")) && (btn8.getText().equals("8")) )
        {
            btn9.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            btn_start.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
            btn_start.setText("RESTART?");
           // Toast.makeText(uccarpiuc.this,"You WIN!!!",Toast.LENGTH_SHORT).show();
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
