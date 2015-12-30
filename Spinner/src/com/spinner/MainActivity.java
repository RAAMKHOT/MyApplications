package com.spinner;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	//create the reference of the widgets(Spinner and TextView.
	Spinner countryspinner;
	TextView selectedtextview;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);     
		setContentView(R.layout.activity_main);
		
		final String[] country={"India","Pakistan","USA","Japan","Newyark","Kenada","Chinna","Shrilanka","America"};
		//create the adapter object..using three different arguments
		ArrayAdapter<String> countryadt=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, country);
		countryspinner =(Spinner) findViewById(R.id.spinner1);
		countryspinner.setAdapter(countryadt);
		
		selectedtextview=(TextView) findViewById(R.id.textViewselecteditem);
		
		countryspinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int position, long arg3) 
			{
				selectedtextview.setText("You are selected "+country[position]);
				//Toast.makeText(MainActivity.this, country[position], Toast.LENGTH_SHORT).show();
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0)
			{
				
			}
		});
	}
}
