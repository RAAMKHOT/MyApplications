package com.notification_demo1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Airplane_Demo1 extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent arg1) 
	{
		Toast.makeText(context, "Airoplan mode is chenged", Toast.LENGTH_SHORT).show();
	}

}
