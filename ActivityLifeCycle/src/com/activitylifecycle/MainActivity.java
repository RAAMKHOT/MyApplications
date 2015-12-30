package com.activitylifecycle;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

	TextView indicatertextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		indicatertextview=(TextView) findViewById(R.id.textViewindicater);
		indicatertextview.setText("Inside onCreate()");
		Toast.makeText(MainActivity.this, "onCreate()", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		indicatertextview.setText("Inside onStart()");
		Toast.makeText(MainActivity.this, "onStart()", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		indicatertextview.setText("Inside onResume()");
		Toast.makeText(MainActivity.this, "onResume()", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		indicatertextview.setText("Inside onPause()");
		Toast.makeText(MainActivity.this, "onPause()", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		indicatertextview.setText("Inside onStop()");
		Toast.makeText(MainActivity.this, "onStop()", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		indicatertextview.setText("Inside onDestroy()");
		Toast.makeText(MainActivity.this, "onDestroy()", Toast.LENGTH_SHORT).show();
	}
}
