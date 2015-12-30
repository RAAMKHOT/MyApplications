package com.AsyncTask.networking;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity 
{
	ImageView DwnlImg;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		DwnlImg=(ImageView) findViewById(R.id.imageView_DownloadImage);
		AsyncNetworking obj1=new AsyncNetworking(DwnlImg);
		obj1.execute();
	}
}
