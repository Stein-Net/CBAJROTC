package com.stein.jrotc.app;

import android.content.Context;

import com.google.android.gcm.GCMBroadcastReceiver;

public class App42GCMReceiver extends GCMBroadcastReceiver{
	@Override
	protected String getGCMIntentServiceClassName(Context context) { 
		return "com.stein.jrotc.app.App42GCMService";
	} 
}