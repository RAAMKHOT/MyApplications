package com.swapapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText inputedittext;
	TextView resulttextview;
	Button swapbutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		inputedittext=(EditText) findViewById(R.id.editTextinputstr);
		
		resulttextview=(TextView) findViewById(R.id.textViewresultstr);
		
		swapbutton=(Button) findViewById(R.id.buttonswap);
		
		swapbutton.setOnClickListener(new OnClickListener() {
			
			char[] r;
			@Override
			public void onClick(View v) {
				String inputstr=inputedittext.getText().toString();
				StringBuilder strbul=new StringBuilder(inputstr);
				StringBuilder revstr=strbul.reverse();
				
				//String result=String.valueOf(r);
				resulttextview.setText(revstr);
			}
		});
	}
}
