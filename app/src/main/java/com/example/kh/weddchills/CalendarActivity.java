package com.example.kh.weddchills;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class CalendarActivity extends AppCompatActivity {

    TextView myDate;
    CalendarView calendarView;
    Button saveBtn;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String STRING = "string";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        myDate = findViewById(R.id.date);
        calendarView = findViewById(R.id.calendarView);
        saveBtn = findViewById(R.id.savebtn);

        load();

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                final String date = dayOfMonth + "/" + month;



                AlertDialog.Builder mBuilder = new AlertDialog.Builder(CalendarActivity.this);
                mBuilder.setTitle("Enter important informations about day " + date + " :");
                mBuilder.setCancelable(true);
                final EditText input = new EditText(CalendarActivity.this);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                mBuilder.setView(input);

                mBuilder.setPositiveButton(R.string.ok_btn, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        if(myDate.getText().toString().isEmpty()){
                            myDate.setText(date + " : " + input.getText().toString());
                            myDate.append("\n");
                        }
                        else{
                            myDate.append(date + " : " + input.getText().toString());
                            myDate.append("\n");
                        }

                        save();
                        }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }
    public void load(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        myDate.setText(sharedPreferences.getString(STRING, ""));
        }



    public void makeToast(){
        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }

    public void save() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(STRING, myDate.getText().toString());
        editor.apply();
        makeToast();
    }
    }

