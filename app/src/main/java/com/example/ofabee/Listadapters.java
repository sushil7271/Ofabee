package com.example.ofabee;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Listadapters extends BaseAdapter{

	Context context;
	LayoutInflater inflater;
	String[] Title;
	Integer[] img;
	View view;
	
	public Listadapters(Context c, String[] text1) {
		// TODO Auto-generated constructor stub
		
		context = c;
		Title = text1;
		
		inflater = (LayoutInflater)c.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		//inflater = LayoutInflater.from(c);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Title.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(Lecture.t == 0){
		
		 view = inflater.inflate(R.layout.lecture_list, parent, false);
		
		//TextView tv1 = (TextView)view.findViewById(R.id.text);
		
		//tv1.setText(Title[position]);
		
		}
		else if(Lecture.t == 1){
			 view = inflater.inflate(R.layout.course_list, parent, false);
			
			TextView tv1 = (TextView)view.findViewById(R.id.sub_topic);
			
			tv1.setText(Title[position]);
			
		}
		
		else if(Lecture.t == 2){
			 view = inflater.inflate(R.layout.mycourse_list, parent, false);
			// TextView tv1 = (TextView)view.findViewById(R.id.text2);
			// tv1.setText(Title[position]);
		}
		
		return view;
	}

}
