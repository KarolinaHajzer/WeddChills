package com.example.kh.weddchills;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;


public class GuestListActivity extends AppCompatActivity {
    Button mAddGuest;
    Button mSaveBtn;
    EditText mEnterGuestName;
    LinearLayout ll;
    int Id_number = 0;
    int chechboxId;
    public static ArrayList<Integer> checkedCheckboxesList_INT = new ArrayList<>();
    public static ArrayList<String> allCheckboxesList_STR = new ArrayList<>();
    String guest_name;
    CheckBox checkbox ;
    private static final String FILE_NAME = "guest_list.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_list);

        mAddGuest = findViewById(R.id.button);
        mSaveBtn = findViewById(R.id.savebtn);
        mEnterGuestName = findViewById(R.id.guest_list_edit_text_id);
        ll = findViewById(R.id.layoutID);



        mAddGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guest_name = mEnterGuestName.getText().toString();
                CheckBox ckbx = createNewCheckBox(guest_name);
                mEnterGuestName.getText().clear();
                ll.addView(ckbx);
                allCheckboxesList_STR.add(guest_name);

            }
        });
        //loadData();
        //updateViews();
        }

    private CheckBox createNewCheckBox(String text) {
        final LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        final CheckBox checkBox = new CheckBox(this);
        checkBox.setLayoutParams(lparams);
        checkBox.setText(text);
        checkBox.setId(Id_number);
        Id_number++;
        return checkBox;
    }

    public void save(View v) {

        for(int k=0;k<ll.getChildCount();k++){
            v = ll.getChildAt(k);
            if(v instanceof CheckBox){
                if(((CheckBox)v).isChecked()){
                    checkedCheckboxesList_INT.add(ll.getChildAt(k).getId());
                }
            }
        }
        Toast.makeText(this, "Data saved" + checkedCheckboxesList_INT + allCheckboxesList_STR, Toast.LENGTH_SHORT).show();
    }
    public void loadData() {

    }

    public void updateViews() {
    }
}
