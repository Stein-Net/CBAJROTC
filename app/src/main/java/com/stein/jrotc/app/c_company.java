package com.stein.jrotc.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.stein.cco_fst;
import com.stein.cco_trd;

public class c_company extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_company);
    }

    public void cfirstplatoon(View view) {
        Intent intent = new Intent(this, cco_fst.class);
        startActivity(intent);
    }

    public void csecondplatoon(View view) {
        Intent intent = new Intent(this, cco_snd.class);
        startActivity(intent);
    }

    public void cthirdplatoon(View view) {
        Intent intent = new Intent(this, cco_trd.class);
        startActivity(intent);
    }
}
