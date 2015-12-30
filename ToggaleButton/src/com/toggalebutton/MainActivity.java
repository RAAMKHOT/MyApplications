package com.toggalebutton;

import android.os.Bundle;
import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	ToggleButton statetogglebutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		statetogglebutton=(ToggleButton) findViewById(R.id.toggleButton1);
		
		statetogglebutton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				if(state==true){
					Toast.makeText(MainActivity.this, "Button is ON", Toast.LENGTH_SHORT).show();
				}else{
					Toast.makeText(MainActivity.this, "Button is OFF", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
