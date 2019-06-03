package com.example.kh.weddchills;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BudgetActivity extends AppCompatActivity {

    EditText mEditTextStr, mEditTextInt;
    Button mAddBtn, mSaveBtn;
    TextView textViewStr, textViewInt, textViewRemBudget, textViewRemBudgetInt, mWholeBudget;
    int oneServiceBudget;
    int remainingbudget;
    int RemBudget;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT0 = "text0";
    private String text;

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

        mWholeBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                text = sharedPreferences.getString(TEXT0, "");
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(BudgetActivity.this);
                mBuilder.setTitle("Enter your budget");
                mBuilder.setCancelable(false);
                final EditText input = new EditText(BudgetActivity.this);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                mBuilder.setView(input);

                mBuilder.setPositiveButton(R.string.ok_btn, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        /*
                        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString(TEXT0, input.getText().toString());
                        editor.apply();
                        */
                        mWholeBudget.setText(input.getText());
                        mWholeBudget.setClickable(false);
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

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