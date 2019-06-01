package com.example.kh.weddchills;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainTasks1 extends AppCompatActivity {

    public static  final String PREFS_NAME = "MyPrefsFile";
    int year = 2019;
    int month = 10;
    int day = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tasks1);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences settings1 = getSharedPreferences(PREFS_NAME,Context.MODE_PRIVATE);
        SharedPreferences settings2 = getSharedPreferences(PREFS_NAME,Context.MODE_PRIVATE);

        year = settings.getInt("year",year);
        month = settings1.getInt("month", month);
        day = settings2.getInt("month", day);

        ((TextView) findViewById(R.id.ceremony_date)).setText(day + " - " + month + " - " + year);




    }

}