package com.example.kh.weddchills;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class InvitationsActivity extends AppCompatActivity {

    EditText invitation_edit_text;
    Button mInvitationSaveButton;
    SharedPreferences saved_notes;
    String saved_notes_before;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitations);

        saved_notes = getSharedPreferences("prefID", Context.MODE_PRIVATE);

        String name = saved_notes.getString("nameKey","No name");

        TextView label = findViewById(R.id.labelID);
        label.setText(name);
        invitation_edit_text = findViewById(R.id.invitation_edit_text_id);
        mInvitationSaveButton = findViewById(R.id.invitation_save_button);

        // add-write text into file
        try {
            FileOutputStream fileout=openFileOutput("mytextfile.txt", MODE_PRIVATE);
            OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
            outputWriter.write(invitation_edit_text.getText().toString());
            outputWriter.close();

            //display file saved message
            Toast.makeText(getBaseContext(), "File saved successfully!",
                    Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
        }


        mInvitationSaveButton.setOnClickListener(new View.OnClickListener() {
                                                     @Override
                                                     public void onClick(View v) {
             //get reference to TextView
             TextView label = findViewById(R.id.labelID);

             //get references to Name and Age EditTexts
             EditText invitation_edit_text = findViewById(R.id.invitation_edit_text_id);

             //set up SharedPreferences
             saved_notes = getSharedPreferences("prefID", Context.MODE_PRIVATE);
             saved_notes_before = saved_notes.getString("prefID",null);
             SharedPreferences.Editor editor = saved_notes.edit();
             editor.putString("nameKey", saved_notes_before + invitation_edit_text.getText().toString());

             editor.apply();
             label.setText("Saved");
         }
     }
    );
    }
}


