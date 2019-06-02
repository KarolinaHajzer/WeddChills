package com.example.kh.weddchills;

import android.content.SharedPreferences;
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
    public static ArrayList<String> checkedCheckboxesList_STR = new ArrayList<>();
    public static ArrayList<String> allCheckboxesList_STR = new ArrayList<>();
    String guest_name;
    CheckBox checkbox ;
    private static final String FILE_NAME = "guest_list.txt";
    String string_of_numbers;
    String listString = "";
    String listStringInt = "";
    public String SHARED_PREFS = "sharedPrefs";
    public String CHECKBOX_TEXT = "checkbox_text";
    public String CHECKBOX = "checkbox";

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
        loadUpdateData();
        /*
        File f = getFileStreamPath(FILE_NAME);
        if(f.length()==0){
            try {
                FileOutputStream fileout=openFileOutput(FILE_NAME, MODE_PRIVATE);
                OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                outputWriter.write("");
                outputWriter.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        FileInputStream fis = null;
        String sb_string = "";
        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;
            String guests = "";

            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
                sb_string = sb.toString();
                String[] separated = sb_string.split(":");
                guests = separated[0];
               // String ints = separated[1];

               // int iteger_from_string = Integer.parseInt(ints.replaceAll("[\\D]", ""));
                //String strArray[] = iteger_from_string.split(" ");

                for(int k=0;k<ll.getChildCount();k++){
                    View v = ll.getChildAt(k);
                    if(v instanceof CheckBox){
                        if(((CheckBox)v).isChecked()){
                            checkedCheckboxesList_INT.add(ll.getChildAt(k).getId());
                        }
                    }
                }

            }
            Toast.makeText(this, guests, Toast.LENGTH_LONG).show();
            //invitation_edit_text.setText(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        */
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

        for (int k = 0; k < ll.getChildCount(); k++) {
            v = ll.getChildAt(k);
            if (v instanceof CheckBox) {
                String text_of_checkbox = ((CheckBox) v).getText().toString();
                editor.putString(CHECKBOX_TEXT, text_of_checkbox);
                editor.putBoolean(CHECKBOX, ((CheckBox) v).isChecked());

                editor.apply();
                Toast.makeText(this, "File saved!",
                        Toast.LENGTH_LONG).show();
            }
            /*
            if (v instanceof CheckBox) {
                if (((CheckBox) v).isChecked()) {
                    String text_of_checkbox = ((CheckBox) v).getText().toString();
                    editor.putString(CHECKBOX_TEXT, text_of_checkbox);
                    editor.putBoolean(CHECKBOX, switch1.isChecked());

                    editor.apply();
                    //checkedCheckboxesList_STR.add(text_of_checkbox);
                    //checkedCheckboxesList_INT.add(v.getId());
                }
            }*/
        }
    }
    public void loadUpdateData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        for (int k = 0; k < ll.getChildCount(); k++) {
            View v = ll.getChildAt(k);
            if (v instanceof CheckBox) {
                ((CheckBox) v).setText(sharedPreferences.getString(CHECKBOX_TEXT, ""));
                ((CheckBox) v).setChecked(sharedPreferences.getBoolean(CHECKBOX, false));
            }
    }
/*
        for (String s : allCheckboxesList_STR) {
            listString += s + "\t";
        }

        for (Integer s : checkedCheckboxesList_INT) {
            listStringInt += s + "\t";
        }

        FileOutputStream fos = null;
        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(listString.getBytes());
            fos.write(":".getBytes());
            fos.write(listStringInt.getBytes());
            Toast.makeText(this, "File saved!",
                    Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {

                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        Toast.makeText(this, "Data saved" + checkedCheckboxesList_INT + allCheckboxesList_STR, Toast.LENGTH_SHORT).show();
    }
*/


}}
