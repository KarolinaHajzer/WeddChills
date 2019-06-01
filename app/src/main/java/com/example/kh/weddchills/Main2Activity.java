package com.example.kh.weddchills;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    String items[] = new String [] {"1.Reserve the date of the ceremony",
            "2.Reserve the wedding hall","3.Booking of accommodation for guests",
            "4.Dj / band","5.Photographer / Filmmaker","6.Transport of the Bride and Groom.",
            "7.Additional attractions","8.Invitations","9.Hairdresser / makeup artist",
            "10.Wedding rings", "11.Bride and Groom outfits","12.Additional options"};
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
                android.widget.Toast.makeText(Main2Activity.this,items[position],android.widget.Toast.LENGTH_SHORT).show();
                /*
                ListEntry entry = (ListEntry) parent.getAdapter().getItem(position);
                Intent intent = new Intent(MainActivity.this, SendMessage.class);
                intent.putExtra(EXTRA_MESSAGE, entry.getMessage());
                startActivity(intent);
                 */
            }
        });
    }
}
