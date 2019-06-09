package com.example.myapplication;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    private SharedPreferences mSharedPref;
    public static final String PREF_KEY_COMMENT = "PREF_KEY_COMMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

            ArrayList<RelativeLayout> listLayout = new ArrayList<>();
        ArrayList<TextView> listTextView = new ArrayList<>();
        ArrayList<Button> listButton = new ArrayList<>();

        RelativeLayout mLayout1 = this.findViewById(R.id.activity_history_7);
        RelativeLayout mLayout2 = this.findViewById(R.id.activity_history_6);
        RelativeLayout mLayout3 = this.findViewById(R.id.activity_history_5);
        RelativeLayout mLayout4 = this.findViewById(R.id.activity_history_4);
        RelativeLayout mLayout5 = this.findViewById(R.id.activity_history_3);
        RelativeLayout mLayout6 = this.findViewById(R.id.activity_history_2);
        RelativeLayout mLayout7 = this.findViewById(R.id.activity_history_1);
        Button mButton1 = findViewById(R.id.bnt_history_1);
        Button mButton2 = findViewById(R.id.bnt_history_2);
        Button mButton3 = findViewById(R.id.bnt_history_3);
        Button mButton4 = findViewById(R.id.bnt_history_4);
        Button mButton5 = findViewById(R.id.bnt_history_5);
        Button mButton6 = findViewById(R.id.bnt_history_6);
        Button mButton7 = findViewById(R.id.bnt_history_7);

        TextView textView1 = (TextView) findViewById(R.id.edit_history_1);
        TextView textView2 = (TextView) findViewById(R.id.edit_history_2);
        TextView textView3 = (TextView) findViewById(R.id.edit_history_3);
        TextView textView4 = (TextView) findViewById(R.id.edit_history_4);
        TextView textView5 = (TextView) findViewById(R.id.edit_history_5);
        TextView textView6 = (TextView) findViewById(R.id.edit_history_6);
        TextView textView7 = (TextView) findViewById(R.id.edit_history_7);

        listLayout.add(mLayout7);
        listButton.add(mButton7);
        listTextView.add(textView7);
        listLayout.add(mLayout6);
        listButton.add(mButton6);
        listTextView.add(textView6);
        listLayout.add(mLayout5);
        listButton.add(mButton5);
        listTextView.add(textView5);
        listLayout.add(mLayout4);
        listButton.add(mButton4);
        listTextView.add(textView4);
        listLayout.add(mLayout3);
        listButton.add(mButton3);
        listTextView.add(textView3);
        listLayout.add(mLayout2);
        listButton.add(mButton2);
        listTextView.add(textView2);
        listLayout.add(mLayout1);
        listButton.add(mButton1);
        listTextView.add(textView1);

        layoutConstructor(listLayout, listTextView, listButton);

    }


    //constructor of different layout
    public void layoutConstructor(ArrayList<RelativeLayout> listLayout, ArrayList<TextView> listTextView, ArrayList<Button> listButton) {

        for (int i = 1; i <= listLayout.size(); i++) {

            SharedPreferences mSharedPref = getApplicationContext().getSharedPreferences("PREF_KEY_COMMENT", 0); // 0 - for private mode

            String commentaire = mSharedPref.getString("COMMENT_"+i, null);

            if(commentaire == null || commentaire.isEmpty()){
                listLayout.get(i-1).setBackgroundColor(Color.RED);

                listButton.get(i-1).setVisibility(View.INVISIBLE);
            } else{
                listTextView.get(i-1).setText(mSharedPref.getString("COMMENT_"+i, null));
                listLayout.get(i-1).setBackgroundColor(Color.TRANSPARENT);
            }

        }
    }
}
