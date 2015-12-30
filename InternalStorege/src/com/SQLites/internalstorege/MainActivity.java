package com.SQLites.internalstorege;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;

public class MainActivity extends Activity {

	EditText inputedittext;
	Button savebutton,readbutton;
	TextView displaytextview;
	private FileOutputStream fos;
	private FileInputStream  fis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		inputedittext=(EditText) findViewById(R.id.editText_input);
		savebutton=(Button) findViewById(R.id.button_save);
		readbutton=(Button) findViewById(R.id.button_read);
	    displaytextview=(TextView) findViewById(R.id.textView1);
	    
	    savebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				String inputdata=inputedittext.getText().toString();
				try 
				{
					fos=openFileOutput("Demo1", Context.MODE_PRIVATE);
					fos.write(inputdata.getBytes());
				}
				catch (FileNotFoundException e) 
				{
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally
				{
					try {
						fos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
	    
	    readbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				try {
				      fis=openFileInput("Demo1");
				      InputStreamReader is=new InputStreamReader(fis);
				      BufferedReader reader=new BufferedReader(is);
				      
				      StringBuffer buffer=new StringBuffer();
				      String line="";
				      
				      try {
						while((line=reader.readLine())!=null){
							buffer.append(line+"\r"+"\n");	  
						  }
						displaytextview.setText(buffer.toString());
					} catch (IOException e) {
						e.printStackTrace();
					}
				      
				      
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}
}
