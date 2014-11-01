package com.stein;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.stein.jrotc.app.R;
import com.stein.jrotc.app.aco_fst_p;
import com.stein.jrotc.app.aco_snd_p;
import com.stein.jrotc.app.aco_trd;

public class a_company extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_company);
    }

    public void acofst(View view) {
        Intent intent = new Intent(this, aco_fst_p.class);
        startActivity(intent);
    }


    public void acosnd(View view) {
        Intent intent = new Intent(this, aco_snd_p.class);
        startActivity(intent);
    }

    public void acotrd(View view) {
        Intent intent = new Intent(this, aco_trd.class);
        startActivity(intent);
    }
}
