package com.example.ofabee;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.VideoView;

public class Lecture extends Activity {
	
	String [] text1= null;
	ListView list;
	
	ImageView lecture_menu;
	
	public static Integer t=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lecture);
		
		list=(ListView)findViewById(R.id.listView1);
		lecture_menu=(ImageView)findViewById(R.id.imageView1);
		
		
		text1 = getResources().getStringArray(R.array.planets_array);
		
		
		
		Listadapters adapter =  new Listadapters(getApplicationContext(), text1);
		t=0;
		list.setAdapter(adapter);
		
		lecture_menu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Lecture.this,OnlineTest.class);
				startActivity(i);
				
			}
		});
		
		
		
	}

	

	

}
