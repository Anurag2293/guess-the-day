

package com.example.guesstheday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    ConstraintLayout layout2;
    Vibrator vibe;
    private TextView queLoader, display;
    private Button start_button, retry_button;
    private Button opt1, opt2, opt3, opt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        layout2 = findViewById(R.id.layout2);
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        queLoader = findViewById(R.id.queLoader);
        display = findViewById(R.id.display);
        start_button = findViewById(R.id.start_button);
        retry_button = findViewById(R.id.retry_button);
        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);
        start_button.setOnClickListener(v -> {
            final Integer[] Score = {0};
            String randDate = generateRandomDate();
            queLoader.setText(randDate);
            assignDay(randDate);
            start_button.setVisibility(View.INVISIBLE);
            opt1.setOnClickListener(v1 -> {
                String out1 = (String) opt1.getText();
                if(out1.equals(dayConvert(randDate))){
                   Score[0] = Score[0] + 1;
                    String randDate1 = generateRandomDate();
                    queLoader.setText(randDate1);
                    assignDay(randDate1);
                    layout2.setBackgroundColor(Color.parseColor("#00FF00"));
                }
                else{
                    display.setText("Game Over! Your Score is : " + Score[0]);
                    layout2.setBackgroundColor(Color.parseColor("#FF0000"));
                    retry_button.setVisibility(View.VISIBLE);
                    retry_button.setText("Play Again");
                    retry_button.setOnClickListener(v24 -> {
                        finish();
                        overridePendingTransition(0, 0);
                        startActivity(getIntent());
                        overridePendingTransition(0, 0);
                    });
                    opt1.setVisibility(View.INVISIBLE);
                    opt2.setVisibility(View.INVISIBLE);
                    opt3.setVisibility(View.INVISIBLE);
                    opt4.setVisibility(View.INVISIBLE);
                    queLoader.setVisibility(View.INVISIBLE);
                    vibe.vibrate(200);
                }
            });
            opt2.setOnClickListener(v1 -> {
                String out2 = (String) opt2.getText();
                if(out2.equals(dayConvert(randDate))){
                    Score[0] = Score[0] + 1;
                    String randDate1 = generateRandomDate();
                    queLoader.setText(randDate1);
                    assignDay(randDate1);
                    layout2.setBackgroundColor(Color.parseColor("#00FF00"));
                }
                else{
                    display.setText("Game Over! Your Score is : " + Score[0]);
                    layout2.setBackgroundColor(Color.parseColor("#FF0000"));
                    retry_button.setVisibility(View.VISIBLE);
                    retry_button.setText("Play Again");
                    retry_button.setOnClickListener(v24 -> {
                        finish();
                        overridePendingTransition(0, 0);
                        startActivity(getIntent());
                        overridePendingTransition(0, 0);
                    });
                    opt1.setVisibility(View.INVISIBLE);
                    opt2.setVisibility(View.INVISIBLE);
                    opt3.setVisibility(View.INVISIBLE);
                    opt4.setVisibility(View.INVISIBLE);
                    queLoader.setVisibility(View.INVISIBLE);
                    vibe.vibrate(200);
                }
            });
            opt3.setOnClickListener(v1 -> {
                String out3 = (String) opt3.getText();
                if(out3.equals(dayConvert(randDate))){
                    Score[0] = Score[0] + 1;
                    String randDate1 = generateRandomDate();
                    queLoader.setText(randDate1);
                    assignDay(randDate1);
                    layout2.setBackgroundColor(Color.parseColor("#00FF00"));
                }
                else{
                    display.setText("Game Over! Your Score is : " + Score[0]);
                    layout2.setBackgroundColor(Color.parseColor("#FF0000"));
                    retry_button.setVisibility(View.VISIBLE);
                    retry_button.setText("Play Again");
                    retry_button.setOnClickListener(v24 -> {
                        finish();
                        overridePendingTransition(0, 0);
                        startActivity(getIntent());
                        overridePendingTransition(0, 0);
                    });
                    opt1.setVisibility(View.INVISIBLE);
                    opt2.setVisibility(View.INVISIBLE);
                    opt3.setVisibility(View.INVISIBLE);
                    opt4.setVisibility(View.INVISIBLE);
                    queLoader.setVisibility(View.INVISIBLE);
                    vibe.vibrate(200);
                }
            });
            opt4.setOnClickListener(v1 -> {
                String out4 = (String) opt4.getText();
                if(out4.equals(dayConvert(randDate))){
                    Score[0] = Score[0] + 1;
                    String randDate1 = generateRandomDate();
                    queLoader.setText(randDate1);
                    assignDay(randDate1);
                    layout2.setBackgroundColor(Color.parseColor("#00FF00"));
                }
                else{
                    display.setText("Game Over! Your Score is : " + Score[0]);
                    layout2.setBackgroundColor(Color.parseColor("#FF0000"));
                    retry_button.setVisibility(View.VISIBLE);
                    retry_button.setText("Play Again");
                    retry_button.setOnClickListener(v24 -> {
                        finish();
                        overridePendingTransition(0, 0);
                        startActivity(getIntent());
                        overridePendingTransition(0, 0);
                    });
                    opt1.setVisibility(View.INVISIBLE);
                    opt2.setVisibility(View.INVISIBLE);
                    opt3.setVisibility(View.INVISIBLE);
                    opt4.setVisibility(View.INVISIBLE);
                    queLoader.setVisibility(View.INVISIBLE);
                    vibe.vibrate(200);
                }
            });
        });
    }
    public String generateRandomDate(){

        int year = randomNum(100, 2000);
        String yr = Integer.toString(year);
        int month = randomNum(12,1);
        String mon = Integer.toString(month);
        int dayOfYear;
        if(month ==2){
            dayOfYear = randomNum(30, 1);
        }
        else{
            dayOfYear = randomNum(27,1);
        }
        String doy = Integer.toString(dayOfYear);
        String Sdate;
        Sdate = doy + "/" + mon + "/" + yr;
        return Sdate;
    }
    public int randomNum(int i,int d) {
        Random randomNum = new Random();
        return (d + randomNum.nextInt(i));
    }
    public String dayConvert(String dateIn) {
        String day = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH); // here set the pattern as you date in string was containing like date/month/year
            Date date = sdf.parse(dateIn);
            sdf.applyPattern("EEEE");
            assert date != null;
            day = sdf.format(date);

        } catch (ParseException ex) {
            // handle parsing exception if date string was different from the pattern applying into the SimpleDateFormat constructor
        }
        return day;
    }
    public void assignDay(String Sdate){
        String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Button[] options = {opt1,opt2,opt3,opt4};
        String op1 = days[randomNum(7,0)];
        opt1.setText(op1);
        String op2;
        String op3;
        String op4;
        do{
            op2 = days[randomNum(7,0)];
            opt2.setText(op2);
        }while(op1.equals(op2));

        do{
            op3 = days[randomNum(7,0)];
            opt3.setText(op3);
        }while(op2.equals(op3) || op1.equals(op3));

        do{
            op4 = days[randomNum(7,0)];
            opt4.setText(op4);
        }while(op2.equals(op4) || op1.equals(op4) || op3.equals(op4));

        String dayOut = dayConvert(Sdate);
        if(dayOut.equals(op1) || dayOut.equals(op2) || dayOut.equals(op3) || dayOut.equals(op4)){
            assert true;
        }
        else{
            int a = randomNum(4,0);
            options[a].setText(dayOut);
        }
    }
}