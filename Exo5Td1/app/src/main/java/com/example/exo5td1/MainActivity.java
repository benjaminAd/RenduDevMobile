package com.example.exo5td1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox linux, mac, windows;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnCheckWindows();
        addListenerOnButton();
    }

    public void addListenerOnCheckWindows() {
        windows = (CheckBox) findViewById(R.id.windows_option);
        windows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox) v).isChecked())
                    Toast.makeText(MainActivity.this, "Bro, try Linux :)", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void addListenerOnButton() {
        linux = (CheckBox) findViewById(R.id.linux_option);
        mac = (CheckBox) findViewById(R.id.macos_option);
        windows = (CheckBox) findViewById(R.id.windows_option);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(v -> {
            StringBuffer result = new StringBuffer();
            result.append("Linux check:").append(linux.isChecked());
            result.append("\nMac OS check:").append(mac.isChecked());
            result.append("\nWindows check:").append(windows.isChecked());
            Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
        });
    }
}