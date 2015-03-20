package com.example.ofabee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CourseList extends Activity {
	
	ImageView menu_course;
	ListView list;
	Listadapters adapter;
	String[] planet;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_course);
		
		menu_course=(ImageView)findViewById(R.id.menu_my_course);
		
		list=(ListView)findViewById(R.id.my_course_list);
		
		planet = getResources().getStringArray(R.array.planets_array);
		
		
		adapter= new Listadapters(CourseList.this, planet);
		Lecture.t=2;
		list.setAdapter(adapter);
				
				
		menu_course.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent i =new Intent(CourseList.this, CurriculumListing.class);
				startActivity(i);
				
			}
		});
	}

}
