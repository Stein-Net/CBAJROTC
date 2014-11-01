package com.stein.jrotc.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BrigadeInfo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brigade_info);
    }

    public void BrigadeTime(View view) {
        Intent intent = new Intent(this, Brigade.class);
        startActivity(intent);
    }

    public void Bat1(View view) {
        Intent intent = new Intent(this, FirstBatallion.class);
        startActivity(intent);
    }

    public void Bat2(View view) {
        Intent intent = new Intent(this, SecondBatallion.class);
        startActivity(intent);
    }

    public void BandInfo(View view) {
        Intent intent = new Intent(this, BandInfo.class);
        startActivity(intent);
    }
}
