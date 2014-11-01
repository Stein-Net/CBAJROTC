package com.stein.jrotc.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.shephertz.app42.paas.sdk.android.App42API;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App42API.initialize(
                this,
                "a2c4da5256fa72d3751fa5ed5769b6756dded7680c299fb1d908203d5a7548de",
                "b0711cdc58e10709e694cd4ab3c7c66dbbe0edb6c73b30803f2d644c412b404c");
        App42API.setLoggedInUser("User") ;
        Util.registerWithApp42("71026218266");

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
        Intent intent = new Intent(this, GalleryActivity.class);
        startActivity(intent);
    }

    public void BrigadeInfo(View view) {
        Intent intent = new Intent(this, BrigadeInfo.class);
        startActivity(intent);
    }

    public void CurrentInformation(View view) {
        Intent intent = new Intent(this, CurrentInformation.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);

    }


    public void onStart() {
        super.onStart();

    }

    /*
     * * This method is called when a Activty is stop disable all the events if
     * occuring (non-Javadoc)
     *
     * @see android.app.Activity#onStop()
     */
    public void onStop() {
        super.onStop();

    }

    /*
     * This method is called when a Activty is finished or user press the back
     * button (non-Javadoc)
     *
     * @override method of superclass
     *
     * @see android.app.Activity#onDestroy()
     */
    public void onDestroy() {
        super.onDestroy();

    }

    /*
     * called when this activity is restart again
     *
     * @override method of superclass
     */
    public void onReStart() {
        super.onRestart();

    }

    /*
     * called when activity is paused
     *
     * @override method of superclass (non-Javadoc)
     *
     * @see android.app.Activity#onPause()
     */
    public void onPause() {
        super.onPause();
        unregisterReceiver(mBroadcastReceiver);

    }

    /*
     * called when activity is resume
     *
     * @override method of superclass (non-Javadoc)
     *
     * @see android.app.Activity#onResume()
     */
    public void onResume() {
        super.onResume();
        String message = getIntent().getStringExtra(App42GCMService.EXTRA_MESSAGE);
        Log.d("MainActivity-onResume", "Message Recieved :"+message);
        IntentFilter filter = new IntentFilter(App42GCMService.DISPLAY_MESSAGE_ACTION);
        filter.setPriority(2);
        registerReceiver(mBroadcastReceiver, filter);
    }

    final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {

            String message = intent.getStringExtra(App42GCMService.EXTRA_MESSAGE);
            Log.i("MainActivity-BroadcastReceiver", "Message Recieved " +" : " +message);
            ((TextView) findViewById(R.id.text)).setText(message);

        }
    };


}
