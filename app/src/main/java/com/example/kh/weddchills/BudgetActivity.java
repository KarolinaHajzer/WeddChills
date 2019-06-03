package com.example.kh.weddchills;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BudgetActivity extends AppCompatActivity {

    EditText mEditTextStr, mEditTextInt, mWholeBudget;
    Button mAddBtn, mSaveBtn;
    TextView textViewStr, textViewInt, textViewRemBudget, textViewRemBudgetInt;
    int oneServiceBudget;
    int remainingbudget;
    int RemBudget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        mEditTextStr = findViewById(R.id.budget_edit_text_str);
        mEditTextInt = findViewById(R.id.budget_edit_text_int);
        mWholeBudget = findViewById(R.id.whole_budget_for_wedding_editText);
        mAddBtn = findViewById(R.id.addbudgetBtn);
        mSaveBtn = findViewById(R.id.saveBtn);
        textViewStr = findViewById(R.id.textViewStr);
        textViewInt = findViewById(R.id.textViewInt);
        textViewRemBudget = findViewById(R.id.budget_left_textView);
        textViewRemBudgetInt = findViewById(R.id.budget_left_textViewINT);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int WholeBudgetInt = Integer.valueOf(mWholeBudget.getText().toString());
                if(textViewStr.getText().toString().isEmpty() && textViewInt.getText().toString().isEmpty()){
                    textViewStr.setText(mEditTextStr.getText());
                    textViewStr.append("\n");
                    textViewInt.setText(mEditTextInt.getText());
                    oneServiceBudget = Integer.valueOf(mEditTextInt.getText().toString());
                    textViewInt.append("\n");
                    remainingbudget = WholeBudgetInt - oneServiceBudget;
                    //textViewRemBudget.append(Integer.toString(remainingbudget));
                    textViewRemBudgetInt.setText("");
                    textViewRemBudgetInt.append(Integer.toString(remainingbudget));

                    }else{
                    //apending textView with values from EditText
                    textViewStr.append(mEditTextStr.getText());
                    textViewStr.append("\n");
                    textViewInt.append(mEditTextInt.getText());
                    textViewInt.append("\n");

                    oneServiceBudget = Integer.valueOf(mEditTextInt.getText().toString()); //integer from editText
                    RemBudget = Integer.valueOf(textViewRemBudgetInt.getText().toString());// integer from textView remaining budget
                    //RemBudget = Integer.parseInt(textViewRemBudget.getText().toString());
                    //RemBudget = Integer.valueOf(textViewRemBudget.getText().toString());
                    remainingbudget = RemBudget - oneServiceBudget; // remaining budget is budeget from RemBudg textView minus service budget from editText
                    textViewRemBudgetInt.setText("");
                    textViewRemBudgetInt.append(Integer.toString(remainingbudget));
                    }

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
