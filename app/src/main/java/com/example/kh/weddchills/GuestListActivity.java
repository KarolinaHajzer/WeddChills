package com.example.kh.weddchills;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;


public class GuestListActivity extends AppCompatActivity {
    Button mAddGuest;
    EditText mEnterGuestName;
    LinearLayout ll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_list);

        mAddGuest = findViewById(R.id.button);
        mEnterGuestName = findViewById(R.id.guest_list_edit_text_id);
        ll = findViewById(R.id.layoutID);

        mAddGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox ckbx = createNewCheckBox(mEnterGuestName.getText().toString());
                mEnterGuestName.getText().clear();
                ll.addView(ckbx);
            }
        });
        }

    private CheckBox createNewCheckBox(String text) {
        final LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        final CheckBox checkBox = new CheckBox(this);
        checkBox.setLayoutParams(lparams);
        checkBox.setText(text);
        return checkBox;
    }
}
