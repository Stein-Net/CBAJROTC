package com.stein.jrotc.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

import com.stein.a_company;

public class FirstBatallion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_batallion);
    }

    public void a_company(View view) {
        Intent intent = new Intent(this, a_company.class);
        startActivity(intent);

    }

    public void b_company(View view) {
        Intent intent = new Intent(this, b_company.class);
        startActivity(intent);
    }
}
