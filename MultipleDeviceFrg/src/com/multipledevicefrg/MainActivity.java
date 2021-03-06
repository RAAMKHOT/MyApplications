package com.multipledevicefrg;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements Communicater {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//this is to identify mobile device
         if  (findViewById(R.id.fragement_container)!=null)	 
         {
        	List_Version listfragment = new List_Version();
        	FragmentTransaction transaction = getFragmentManager().beginTransaction();
        	transaction.add(R.id.fragement_container,listfragment);
        	transaction.commit();
         }
	}

	@Override
	public void respond(int position) 
	{
		Log.d("DEBUG","position is--->>"+position);
		Description_Versions descritionfragment =(Description_Versions) getFragmentManager().findFragmentById(R.id.description_fragment);
		//checking if we have 2 fragments 
		if(descritionfragment!=null)
		 {
			descritionfragment.recievedata(position);
		 }
		
		else
		{
			Description_Versions descfrag = new Description_Versions();
			
			FragmentTransaction transaction = getFragmentManager().beginTransaction(); 
		    transaction.replace(R.id.fragement_container,descfrag);
		    transaction.addToBackStack(null);
		    transaction.commit();
		}
	}

}
