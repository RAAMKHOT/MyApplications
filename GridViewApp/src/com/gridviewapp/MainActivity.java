package com.gridviewapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

	GridView phonesgridviews;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		phonesgridviews=(GridView) findViewById(R.id.gridViewphones);
		
		final String[] phones={"SONY","SAMSUMG","NOKIA","MI","LAVA","MICROMAX","MOTO","SPICE"};
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, phones);
		
		phonesgridviews.setAdapter(adapter);
		
		phonesgridviews.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,long arg3)
			{
				Toast.makeText(MainActivity.this, phones[pos], Toast.LENGTH_SHORT).show();
			}
		});
	}

}
