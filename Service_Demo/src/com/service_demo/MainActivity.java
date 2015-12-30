package com.service_demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button Startbutton,Stopbutton;
	boolean count=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Startbutton=(Button) findViewById(R.id.button1);
		Stopbutton=(Button) findViewById(R.id.button2);

		Startbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0)
			{
				if(count==false)
				{
					Intent startintent=new Intent(MainActivity.this, MyService.class);
					startService(startintent);
					count=true;
				}
				else
				{
					Toast.makeText(MainActivity.this, "Service is already running stege......", Toast.LENGTH_SHORT).show();
				}
			}
		});

		Stopbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) 
			{
				if(count==false)
				{
					Toast.makeText(MainActivity.this, "Start the Service......", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Intent startintent=new Intent(MainActivity.this, MyService.class);
					stopService(startintent);
					count=false;
				}
			}
		});
	}
}
