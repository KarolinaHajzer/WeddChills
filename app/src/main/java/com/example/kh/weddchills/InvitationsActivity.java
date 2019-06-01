package com.example.kh.weddchills;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class InvitationsActivity extends AppCompatActivity {

    EditText invitation_edit_text;
    Button mInvitationSaveButton;
    TextView invitation_text_view;
    static final int READ_BLOCK_SIZE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitations);

        invitation_edit_text = findViewById(R.id.invitation_edit_text_id);
        invitation_text_view = findViewById(R.id.labelID);
        mInvitationSaveButton = findViewById(R.id.invitation_save_button);

        File f = getFileStreamPath("mytextfile.txt");
        if(f.length()>0){
            try {
                FileOutputStream fileout=openFileOutput("mytextfile.txt", MODE_PRIVATE);
                OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                outputWriter.write("0");
                outputWriter.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        try {
            FileInputStream fileIn=openFileInput("mytextfile.txt");

                InputStreamReader InputRead = new InputStreamReader(fileIn);

                char[] inputBuffer = new char[READ_BLOCK_SIZE];
                String s = "";
                int charRead;

                while ((charRead = InputRead.read(inputBuffer)) > 0) {
                    // char to string conversion
                    String readstring = String.copyValueOf(inputBuffer, 0, charRead);
                    s += readstring;
                }
                InputRead.close();
                invitation_text_view.setText(s);
                //Toast.makeText(getBaseContext(), s, Toast.LENGTH_SHORT).show();



        } catch (Exception e) {
            e.printStackTrace();
        }


        mInvitationSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream fileout=openFileOutput("mytextfile.txt", MODE_APPEND);
                    OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                    outputWriter.append(invitation_edit_text.getText().toString());
                    outputWriter.close();

                    //display file saved message
                    Toast.makeText(getBaseContext(), "File saved successfully!",
                            Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }}