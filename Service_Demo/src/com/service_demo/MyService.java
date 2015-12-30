package com.service_demo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service 
{
	MediaPlayer mp;
	@Override
	public void onCreate()
	{
		mp=MediaPlayer.create(MyService.this, R.raw.sound_1);
		
		super.onCreate();
		Toast.makeText(MyService.this, "Service is created....", Toast.LENGTH_SHORT).show();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) 
	{
		Toast.makeText(MyService.this, "Service is Started....", Toast.LENGTH_SHORT).show();
		mp.start();
		return super.onStartCommand(intent, flags, startId);
	}
	@Override
	public void onDestroy() 
	{
		mp.stop();
		Toast.makeText(MyService.this, "Service is Destroy....", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

	@Override
	public IBinder onBind(Intent arg0) 
	{
		return null;
	}
}
