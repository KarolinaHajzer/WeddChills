package com.example.kh.weddchills;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    String items[] = new String [] {"1.Reserve the date of the ceremony",
            "2.Reserve the wedding hall","3.Booking of accommodation for guests",
            "4.Dj / band","5.Photographer / Filmmaker","6.Transport of the Bride and Groom.",
            "7.Additional attractions","8.Invitations","9.Hairdresser / makeup artist",
            "10.Wedding rings", "11.Bride and Groom outfits","12.Additional options"};
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT0 = "text0";
    public static final String TEXT1 = "text1";
    public static final String TEXT2 = "text2";
    public static final String TEXT3 = "text3";
    public static final String TEXT4 = "text4";
    public static final String TEXT5 = "text5";
    public static final String TEXT6 = "text6";
    public static final String TEXT7 = "text7";
    public static final String TEXT8 = "text8";
    public static final String TEXT9 = "text9";
    public static final String TEXT10 = "text10";
    public static final String TEXT11 = "text11";
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id){

                if(position == 0){
                    SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT0, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[0]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT0, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();
                }
                if(position==1){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT1, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[1]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT1, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}

                if(position==2){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT2, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[2]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT2, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==3){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT3, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[3]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT3, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==4){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT4, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[4]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT4, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==5){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT5, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[5]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT5, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==6){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT6, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[6]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT6, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==7){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT7, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[7]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT7, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==8){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT8, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[8]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT8, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==9){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT9, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[9]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT9, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==10){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT10, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[10]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT10, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
                if(position==11){SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                    text = sharedPreferences.getString(TEXT11, "");
                    AlertDialog.Builder mBuilder = new AlertDialog.Builder(Main2Activity.this);
                    mBuilder.setTitle(items[11]);
                    mBuilder.setCancelable(true);
                    mBuilder.setMessage("Enter data");
                    final EditText input = new EditText(Main2Activity.this);
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    input.setLayoutParams(lp);
                    if(text.isEmpty()){
                        mBuilder.setView(input);
                    }
                    else{
                        input.setText(text);
                        mBuilder.setView(input);
                    }
                    mBuilder.setNegativeButton(R.string.main_taska_done_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putString(TEXT11, input.getText().toString());
                            editor.apply();
                        }
                    });
                    mBuilder.setPositiveButton(R.string.main_taska_budget_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, BudgetActivity.class);
                            //startActivity(intent);
                        }
                    });
                    mBuilder.setNeutralButton(R.string.main_taska_calendar_btn, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //Intent intent = new Intent(Main2Activity.this, CalendarActivity.class);
                            //startActivity(intent);
                        }
                    });
                    AlertDialog mDialog = mBuilder.create();
                    mDialog.show();}
            }
        });
    }
}
