package com.example.kh.weddchills;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GuestListActivity extends AppCompatActivity {
    Button mAddGuest;
    Button mSaveBtn;
    EditText mEnterGuestName;
    TextView mNumber_of_checked_guests_int;
    LinearLayout ll;
    int Id_number = 0;
    List<String> mList =  new ArrayList<>();
    String mIsChecked = "0";
    String guest_name;
    CheckBox checkbox ;
    public String SHARED_PREFS = "sharedPrefs";
    int checked_guests = 0;
    int checked_guests1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_list);

        mAddGuest = findViewById(R.id.button);
        mSaveBtn = findViewById(R.id.savebtn);
        mNumber_of_checked_guests_int = findViewById(R.id.number_of_checked_guests_int);
        mEnterGuestName = findViewById(R.id.guest_list_edit_text_id);
        ll = findViewById(R.id.layoutID);



        mAddGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guest_name = mEnterGuestName.getText().toString();
                CheckBox ckbx = createNewCheckBox(guest_name);
                mEnterGuestName.getText().clear();
                ll.addView(ckbx);
            }
        });
        loadUpdateData();
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
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        for (int i = 0; i < ll.getChildCount(); i++) {
            v = ll.getChildAt(i);
            String dwukropek = ":";
            String text = ((CheckBox) v).getText().toString();
            if(((CheckBox) v).isChecked()){
                mIsChecked = "1";
                checked_guests1++;
            }else{
                mIsChecked = "0";
            }
            String whole_tetx = text + dwukropek + mIsChecked;
            mList.add(whole_tetx);
        }
            mNumber_of_checked_guests_int.setText("Number of checked guests: " + Integer.toString(checked_guests1));
            Set<String> set = new HashSet<>();
            set.addAll(mList);
            editor.putStringSet("keys", set);
            editor.apply();
            makeToast();

    }
    public void loadUpdateData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        Set<String> set = sharedPreferences.getStringSet("keys", null);

        if(set == null){mEnterGuestName.setText("");}
        else {
            List<String> stringsList = new ArrayList<>(set);
            for(int k = 0;k < stringsList.size(); k++){
                String s = stringsList.get(k);
                String[] separated = s.split(":");
                String guest_name_from_SP = separated[0];
                String isChecked_string = separated[1];

                Integer isChecked_int = Integer.valueOf(isChecked_string);
                CheckBox returned_checkbox = createNewCheckBox(guest_name_from_SP);
                if(isChecked_int == 1){
                    returned_checkbox.setChecked(true);
                    checked_guests++;
                }
                else{returned_checkbox.setChecked(false);}
                ll.addView(returned_checkbox);
            }
        }
       mNumber_of_checked_guests_int.setText("Number of checked guests: " + Integer.toString(checked_guests));
}
    public void makeToast(){
        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show();
    }
}
