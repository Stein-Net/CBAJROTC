package com.stein.jrotc.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

import com.stein.a_company;

public class SecondBatallion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_batallion);
    }

    public void c_company(View view) {
        Intent intent = new Intent(this, c_company.class);
        startActivity(intent);

    }

    public void d_company(View view) {
        Intent intent = new Intent(this, d_company.class);
        startActivity(intent);
    }
}
