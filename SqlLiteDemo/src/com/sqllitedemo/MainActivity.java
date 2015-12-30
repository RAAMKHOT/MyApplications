package com.sqllitedemo;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity 
{
	Button loginbutton,cancelbutton;
	EditText usernameedittext,passwordedittext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		loginbutton=(Button) findViewById(R.id.buttonlogin);
		cancelbutton=(Button) findViewById(R.id.buttoncancel);
		
		usernameedittext=(EditText) findViewById(R.id.editTextusername);
		passwordedittext=(EditText) findViewById(R.id.editTextpassword);
	}
}