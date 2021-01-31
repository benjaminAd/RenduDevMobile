package com.example.exo1td1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        setContentView(tv);*/

        //Modification de code
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        layout.addView(tv);
        EditText editText = new EditText(this);
        editText.setHint("Entre du texte");
        layout.addView(editText);
        setContentView(layout);

    }
}