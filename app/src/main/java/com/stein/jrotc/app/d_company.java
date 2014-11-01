package com.stein.jrotc.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class d_company extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_company);
    }

    public void dfirstplatoon(View view) {
        Intent intent = new Intent(this, dco_fst.class);
        startActivity(intent);


    }

    public void dsecondplatoon(View view) {
        Intent intent = new Intent(this, dco_snd.class);
        startActivity(intent);
    }



    public void dthird(View view) {
        Intent intent = new Intent(this, dco_trd.class);
        startActivity(intent);
    }
}
