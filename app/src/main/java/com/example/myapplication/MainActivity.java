package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences mSharedPref;
    private SharedPreferences.Editor editor;
    public static final String PREF_KEY_COMMENT = "PREF_KEY_COMMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonHistory = (Button) findViewById(R.id.button_history);


        Button buttonOk1 = (Button) findViewById(R.id.bnt_1);
        Button buttonOk2 = (Button) findViewById(R.id.bnt_2);
        Button buttonOk3 = (Button) findViewById(R.id.bnt_3);
        Button buttonOk4 = (Button) findViewById(R.id.bnt_4);
        Button buttonOk5 = (Button) findViewById(R.id.bnt_5);
        Button buttonOk6 = (Button) findViewById(R.id.bnt_6);
        Button buttonOk7 = (Button) findViewById(R.id.bnt_7);

        final EditText editText1 = (EditText) findViewById(R.id.edit_1);
        final EditText editText2 = (EditText) findViewById(R.id.edit_2);
        final EditText editText3 = (EditText) findViewById(R.id.edit_3);
        final EditText editText4 = (EditText) findViewById(R.id.edit_4);
        final EditText editText5 = (EditText) findViewById(R.id.edit_5);
        final EditText editText6 = (EditText) findViewById(R.id.edit_6);
        final EditText editText7 = (EditText) findViewById(R.id.edit_7);

        //Enregistrer un commentaire
        mSharedPref = getApplicationContext().getSharedPreferences("PREF_KEY_COMMENT", 0); // 0 - for private mode
        editor = mSharedPref.edit();

        buttonHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "GO to history", Toast.LENGTH_SHORT).show();

                Intent history = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(history);

            }
        });


        buttonOk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("COMMENT_1" , editText1.getText().toString()    ); // COMMENT_09062019
                editor.putString("MOOD_DAY_09062019" , "SAD"   ); // COMMENT_09062019
                editor.commit(); // commit changes

                Toast.makeText(getApplicationContext(),
                        "Button1 Clicked! : "+editText1.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        buttonOk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("COMMENT_2", editText2.getText().toString()    ); // COMMENT_10062019
                editor.commit(); // commit changes

                Toast.makeText(getApplicationContext(),
                        "Button2 Clicked! : "+editText2.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        buttonOk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("COMMENT_3", editText3.getText().toString()    ); //
                editor.commit(); // commit changes

                Toast.makeText(getApplicationContext(),
                        "Button4 Clicked! : "+editText3.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        buttonOk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("COMMENT_4", editText4.getText().toString()    ); //
                editor.commit(); // commit changes

                Toast.makeText(getApplicationContext(),
                        "Button4 Clicked! : "+editText4.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        buttonOk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("COMMENT_5", editText5.getText().toString()    ); //
                editor.commit(); // commit changes

                Toast.makeText(getApplicationContext(),
                        "Button5 Clicked! : "+editText5.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        buttonOk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("COMMENT_6", editText6.getText().toString()    ); //
                editor.commit(); // commit changes

                Toast.makeText(getApplicationContext(),
                        "Button6 Clicked! : "+editText6.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        buttonOk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putString("COMMENT_7", editText7.getText().toString()    ); //
                editor.commit(); // commit changes

                Toast.makeText(getApplicationContext(),
                        "Button7 Clicked! : "+editText7.getText(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
