package com.loginapp1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView username,password;
	Button submitbutton,clearbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		username=(TextView) findViewById(R.id.editText_username);
		password=(TextView) findViewById(R.id.editText_password);
		
		submitbutton=(Button) findViewById(R.id.button_submit);
		clearbutton=(Button) findViewById(R.id.button_clear);
		
		submitbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				if(username.getText().toString().equalsIgnoreCase("raam") && password.getText().toString().equals("vinod"))
				{
					Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
