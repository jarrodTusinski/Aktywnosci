package com.example.jarek.aktywnosci;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Obrazek extends Activity {
    //    Button submitButton = (Button) findViewById(R.id.submit_button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);
        Button change = (Button) findViewById(R.id.changePicToRed);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changePictureToRed(v);

            }
        });
    }
    public void changePictureToRed(View v) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.android2);
    }
    public void changePictureToGreen(View v) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.android);
    }

    //TODO: zrobic to normalnie (zeby back wracal do tego co bylo a nie robil nowe)
    public void backToMain(View v) {
        Context context; //kontekst aplikacji
        context = getApplicationContext();
        Intent intent = new Intent(context,MainActivityApp.class); // podac jakiej klasy aktywnosc chcemy wywolac
        startActivity(intent); // i wywolac aktywnosc
    }
}