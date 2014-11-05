package com.stein.jrotc.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *  This Application was written by Gregory Rudolph in 2013,
 *  then updated in 2014 for the new CBA Chain of command.
 *
 *  DO NOT CHANGE THESE BUTTONS UNLESS YOU KNOW WHAT YOU ARE DOING
 *
 *  To update for future years, see Strings.xml file
 *
 *  To update cover image- replace brigadeimg.png in the Drawable folders
 *
 */

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void AboutProgram(View view) {
        Intent intent = new Intent(this, about_program.class);
        startActivity(intent);
    }

    public void ContactUs(View view) {
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }

    public void openGallery(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }

    public void BrigadeInfo(View view) {
        Intent intent = new Intent(this, BrigadeInfo.class);
        startActivity(intent);
    }

    public void CurrentInformation(View view) {
        Intent intent = new Intent(this, CurrentInformation.class);
        startActivity(intent);
    }


}