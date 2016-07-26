package com.example.android.nanodegreebuttons;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayGoToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button launches the Go Ubiquitous app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayMovieToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button launches the Popular Movies app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayCapstoneToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button launches the Capstone app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayStockToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button launches the Stock Hawk app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayBiggerToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button launches the Build It Bigger app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayMaterialToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button launches the Make Your App Material app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
