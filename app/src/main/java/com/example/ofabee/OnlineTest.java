package com.example.ofabee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class OnlineTest extends Activity {
	
	ImageView menu_pdf;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.course);
		
		menu_pdf=(ImageView)findViewById(R.id.menu_course_pdf);
		
		menu_pdf.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i =new Intent(OnlineTest.this, Login.class);
				startActivity(i);
			}
		});
		
		
		
	}

	public void  submit(View v){
		
		Intent i = new Intent(OnlineTest.this,Lecture.class);
		startActivity(i);
		
	}
	
}
