package com.AsyncTask.networking;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

public class AsyncNetworking extends AsyncTask<Void, Void, Void> 
{
	Bitmap bm;
	HttpURLConnection httpurl;
	ImageView AsyncImage;
	
	public AsyncNetworking(ImageView DwnlImg) 
	{
		AsyncImage=DwnlImg;
	}
	@Override
	protected Void doInBackground(Void... arg0) 
	{
		try {
			URL imgurl=new URL("‪https://www.google.co.in/imgres?imgurl=http://www.indya101.com/c/wallpapers/wallpaper_download/15299/Vishnuvardhan/Vishnuvardhan-15299.jpg&imgrefurl=http://www.indya101.com/c/wallpapers/wallpaper/15297-vishnuvardhan-vishnuvardhan&h=768&w=1024&tbnid=8o_qaZcsggUMzM:&docid=e0NYWkTBBbtjYM&hl=en&ei=V6JvVqjtI4ee0gT29ZXIAg&tbm=isch");
			httpurl=(HttpURLConnection) imgurl.openConnection();
			InputStream ins=httpurl.getInputStream();
			bm=BitmapFactory.decodeStream(ins);
			AsyncImage.setImageBitmap(bm);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally{
			httpurl.disconnect();
		}
		return null;
	}

}
