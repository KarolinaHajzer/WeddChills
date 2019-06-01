package com.example.kh.weddchills;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mMainTasksButton;
    Button mInvitationsButton;
    Button mGuestListButton;
    Button mBudgetButton;
    Button mCalendarButton;
    Button mDocumentsButton;
    Button mCeremonyPlanButton;
    Button mNotesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainTasksButton = findViewById(R.id.button_one);
        mMainTasksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        mInvitationsButton = findViewById(R.id.button_two);
        mInvitationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InvitationsActivity.class);
                startActivity(intent);
            }
        });

        mGuestListButton = findViewById(R.id.button_tree);
        mGuestListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GuestListActivity.class);
                startActivity(intent);
            }
        });

        mBudgetButton = findViewById(R.id.button_four);
        mBudgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Does nothing yet, but soon!
            }
        });

        mCalendarButton = findViewById(R.id.button_five);
        mCalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Does nothing yet, but soon!
            }
        });

        mDocumentsButton = findViewById(R.id.button_six);
        mDocumentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Does nothing yet, but soon!
            }
        });

        mCeremonyPlanButton = findViewById(R.id.button_seven);
        mCeremonyPlanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Does nothing yet, but soon!
            }
        });

        mNotesButton = findViewById(R.id.button_eight);
        mNotesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Does nothing yet, but soon!
            }
        });
    }
}