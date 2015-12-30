package com.plapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText actamtedittext,slgamtedittext;
	Button calcutebutton;
	TextView profittextview,losstextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		actamtedittext=(EditText) findViewById(R.id.editTextactualcost);
		slgamtedittext=(EditText) findViewById(R.id.editTextsellingcost);

		calcutebutton=(Button) findViewById(R.id.buttoncalculating);

		profittextview=(TextView) findViewById(R.id.textViewprofit);
		losstextview=(TextView) findViewById(R.id.textViewloss);

		calcutebutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				double ActualAmount=Double.parseDouble(actamtedittext.getText().toString());
				double SallingAmount=Double.parseDouble(slgamtedittext.getText().toString());

				double result=SallingAmount-ActualAmount;

				if(result>0)
				{
					profittextview.setText(String.valueOf(result));
					losstextview.setText("0.0");
				}
				else
				{
					losstextview.setText(String.valueOf(result));
					profittextview.setText("0.0");
				}
			}
		});
	}    
}
