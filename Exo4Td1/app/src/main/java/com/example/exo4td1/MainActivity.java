package com.example.exo4td1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private boolean flag;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.mainbutton);
        button2 = (Button) findViewById(R.id.secondaryButton);
        textView = (TextView) findViewById(R.id.textView);
        flag = true;

        button.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "Message bouton 1", Toast.LENGTH_LONG).show());

       /* button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) textView.setVisibility(View.VISIBLE);
                else textView.setVisibility(View.INVISIBLE);
                flag = !flag;
            }
        });*/

        button2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (flag) textView.setVisibility(View.VISIBLE);
                else textView.setVisibility(View.INVISIBLE);
                flag = !flag;
                return true;
            }
        });
    }
}