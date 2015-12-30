package com.siapp;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

	EditText princileedittext,timeedittext,rateedittext;
	Button calculatebutton;
	TextView simpleintrest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        princileedittext=(EditText) findViewById(R.id.editTextPrinciple);
        timeedittext=(EditText) findViewById(R.id.editTextTime);
        rateedittext=(EditText) findViewById(R.id.editTextRate);
        
        calculatebutton=(Button) findViewById(R.id.buttoncalculate);
        
        simpleintrest=(TextView) findViewById(R.id.textViewprofit);
        
        calculatebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				double p=Double.parseDouble(princileedittext.getText().toString());
				double t=Double.parseDouble(timeedittext.getText().toString());
				double r=Double.parseDouble(rateedittext.getText().toString());
				
				double si=p*t*r/100;
				
				simpleintrest.setText(String.valueOf(si));
			}
		});
    }
}
