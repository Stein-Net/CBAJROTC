package com.stein.jrotc.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class b_company extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_company);
    }

    public void bsecondplatoon(View view) {
        Intent intent = new Intent(this, bco_fst.class);
        startActivity(intent);
    }

    public void bfirstplatoon(View view) {
        Intent intent = new Intent(this, bco_snd.class);
        startActivity(intent);
    }

    public void bthirdplatoon(View view) {
        Intent intent = new Intent(this, bco_trd.class);
        startActivity(intent);
    }
}
