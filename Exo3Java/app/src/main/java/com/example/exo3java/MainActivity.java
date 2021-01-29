package com.example.exo3java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        EditText nom = new EditText(this);
        nom.setHint(R.string.label1);
        EditText prenom = new EditText(this);
        prenom.setHint(R.string.label2);
        EditText age = new EditText(this);
        age.setHint(R.string.label3);
        EditText Domaine = new EditText(this);
        Domaine.setHint(R.string.label4);
        EditText numTel = new EditText(this);
        numTel.setHint(R.string.label5);
        Button submit = new Button(this);
        submit.setText(R.string.label6);
        layout.addView(nom);
        layout.addView(prenom);
        layout.addView(age);
        layout.addView(Domaine);
        layout.addView(numTel);
        layout.addView(submit);
        setContentView(layout);
    }
}