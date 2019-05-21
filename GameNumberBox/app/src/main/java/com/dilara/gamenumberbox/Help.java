package com.dilara.gamenumberbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Help extends AppCompatActivity {

    TextView hakkinda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        hakkinda = (TextView) findViewById(R.id.txtAbout);

        hakkinda.setText("This is a very cool brain-activity game which will unleash your brain power.\n" +
                "The game is easy to play. \n" +
                "The goal of the game is to sort the numbers by clicking on the boxes to rearrange them with the help of the empty box with minimal moves.\n" +
                "It is very simplistic to understand and it is very playable.\n" +
                "The game is appropriate for all ages.\n" +
                "Overall, It is a good consciousness exercise.\n" +
                "If you want to relax, try this game, you will enjoy!");

       /* LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.custom_toast_gold, (ViewGroup) findViewById(R.id.custom_toast_layout_id));
        Toast toast = Toast.makeText(getApplicationContext(),"Genius! First Rank 0-50",Toast.LENGTH_LONG);
        //toast.makeText(getApplicationContext(),"Genius! First Rank 0-50",Toast.LENGTH_LONG);
        //toast.setDuration(Toast.LENGTH_LONG);

        toast.setView(layout);//setting the view of custom toast layout
        toast.show();*/

      /* int a =4;

       if (a==1){

           LayoutInflater inflater = getLayoutInflater();
           View layout = inflater.inflate(R.layout.custom_toast_gold, (ViewGroup) findViewById(R.id.custom_toast_gold_layout_id));

           TextView text = (TextView) layout.findViewById(R.id.text);
           text.setText("Genius! First Rank 0-50");

           Toast toast = new Toast(getApplicationContext());
           toast.setDuration(Toast.LENGTH_LONG);
           toast.setView(layout);
           toast.show();
       }
       else if (a==2){

           LayoutInflater inflater = getLayoutInflater();
           View layout = inflater.inflate(R.layout.custom_toast_silver, (ViewGroup) findViewById(R.id.custom_toast_silver_layout_id));

           TextView text = (TextView) layout.findViewById(R.id.textsilver);
           text.setText("Smart! Second Rank 51-100");

           Toast toast = new Toast(getApplicationContext());
           toast.setDuration(Toast.LENGTH_LONG);
           toast.setView(layout);
           toast.show();
       }

       else if (a==3){

           LayoutInflater inflater = getLayoutInflater();
           View layout = inflater.inflate(R.layout.custom_toast_bronze, (ViewGroup) findViewById(R.id.custom_toast_bronze_layout_id));

           TextView text = (TextView) layout.findViewById(R.id.textbronze);
           text.setText("You Win! Third Rank 101-200");

           Toast toast = new Toast(getApplicationContext());
           toast.setDuration(Toast.LENGTH_LONG);
           toast.setView(layout);
           toast.show();
       }
       else if (a==4){

           Toast toast = Toast.makeText(getApplicationContext(),"You can better than this!",Toast.LENGTH_LONG);

           toast.show();
       }*/





    }

    



}
