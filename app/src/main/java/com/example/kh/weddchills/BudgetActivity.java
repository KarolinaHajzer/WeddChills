package com.example.kh.weddchills;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BudgetActivity extends AppCompatActivity {

    EditText mEditTextStr, mEditTextInt;
    Button mAddBtn, mSaveBtn;
    TextView textViewStr, textViewInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        mEditTextStr = findViewById(R.id.budget_edit_text_str);
        mEditTextInt = findViewById(R.id.budget_edit_text_int);
        mAddBtn = findViewById(R.id.addbudgetBtn);
        mSaveBtn = findViewById(R.id.saveBtn);
        textViewStr = findViewById(R.id.textViewStr);
        textViewInt = findViewById(R.id.textViewInt);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStr.setText(mEditTextStr.getText());
                textViewInt.setText(mEditTextInt.getText());
                mEditTextStr.getText().clear();
                mEditTextInt.getText().clear();
            }
        });

        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });



    }
}
