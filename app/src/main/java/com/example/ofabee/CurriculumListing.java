package com.example.ofabee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

public class CurriculumListing extends Activity  {
	
	ImageView menu_course;
	ListView list;
	 String[] planet;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.curricullam);
		
		planet = getResources().getStringArray(R.array.planets_array);
		
		list=(ListView)findViewById(R.id.course_list);
		menu_course=(ImageView)findViewById(R.id.menu_course);
		
		Listadapters adapter =  new Listadapters(getApplicationContext(), planet);
		Lecture.t=1;
		list.setAdapter(adapter);
		
		
		
		/* ArrayAdapter<String> aDate = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,planet);
		aDate.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		topic_spinner.setAdapter(aDate);
		subtopic_spinner.setAdapter(aDate);*/
		

		menu_course.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i =new Intent(CurriculumListing.this, Lecture.class);
				startActivity(i);
			}
		});
		
		
	}
	

	
}
