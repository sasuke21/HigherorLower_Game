package com.ssuji.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String toast) {
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

    public void check(View view) {
        EditText numberEntered = findViewById(R.id.numberEntered);
        int n = Integer.parseInt(numberEntered.getText().toString());
        if (n < randomNumber) {
            makeToast("Higher!");
        }
        else if (n > randomNumber) {
            makeToast("Lower!");
        }
        else {
            makeToast("Congrats! You got that right \n  try again");
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 5;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 5;
    }
}
