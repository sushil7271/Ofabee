package com.example.ofabee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
	
    // options
	TextView option1;
	TextView option2;
	TextView option3;
	TextView option4;
	
	TextView question_number;
	TextView text_questions;
	// answer option images
	ImageView img_1;
	ImageView img_2;
	ImageView img_3;
	ImageView img_4;
	// footer images
	ImageView backward;
	ImageView forward;
	CheckBox revised;
	String[] questions;
	Integer[] revised_queu;
	
	int revised_count=0;
	int question_count=1;
	int max=20;
	int option;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		option1=(TextView)findViewById(R.id.option1);
		option2=(TextView)findViewById(R.id.option2);
		option3=(TextView)findViewById(R.id.option3);
		option4=(TextView)findViewById(R.id.option4);
		
		question_number=(TextView)findViewById(R.id.textView1);
		text_questions=(TextView)findViewById(R.id.question1);
		revised_queu= new Integer[20];
		
		img_1=(ImageView)findViewById(R.id.img_1);
		img_2=(ImageView)findViewById(R.id.img_2);
		img_3=(ImageView)findViewById(R.id.img_3);
		img_4=(ImageView)findViewById(R.id.img_4);
		
		forward=(ImageView)findViewById(R.id.arrow_front);
		backward=(ImageView)findViewById(R.id.arrow_back);
		
		Log.e("revised", "");
		revised=(CheckBox)findViewById(R.id.revised_later);
		questions=getResources().getStringArray(R.array.question_array);
		Log.e("revised", "crossed");
		option1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				option=0;
				img_1.setImageResource(R.drawable.tick);
				img_2.setImageResource(R.drawable.round);
				img_3.setImageResource(R.drawable.round);
				img_4.setImageResource(R.drawable.round);
				
			}
			});
		
			option2.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							// TODO Auto-generated method stub
				
							option=1;
							img_1.setImageResource(R.drawable.round);
							img_2.setImageResource(R.drawable.tick);
							img_3.setImageResource(R.drawable.round);
							img_4.setImageResource(R.drawable.round);
							
							
						}
					});


			option3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					option=2;
					img_1.setImageResource(R.drawable.round);
					img_2.setImageResource(R.drawable.round);
					img_3.setImageResource(R.drawable.tick);
					img_4.setImageResource(R.drawable.round);
				}
			});



			option4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					option=3;
					img_1.setImageResource(R.drawable.round);
					img_2.setImageResource(R.drawable.round);
					img_3.setImageResource(R.drawable.round);
					img_4.setImageResource(R.drawable.tick);
				}
				});
			
			Log.e("revised", "check box");
			revised.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if (((CheckBox) v).isChecked()) {
						
					//	Toast.makeText(Login.this, "Hello", 1000).show();
						
					//	revised_queu[revised_count]=question_count;
						
					}	
				}
			});
			
			
			forward.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					question_count=question_count+1;
					questions_queu();
					
				}
			});
	}
	
	public void questions_queu(){
		
		if(question_count < max){
		question_number.setText("Question "+question_count+"/20");
		text_questions.setText(questions[question_count]);
		
		if (revised.isChecked()) {
			revised_queu[revised_count]=question_count;
			revised_count=revised_count+1;
			revised.setChecked(false);
		}
		
		else if(option <= 3){
			
			
		}
		
		}
		else{
			Toast.makeText(Login.this, "Questions Over", 1000).show();
		}
		
	}
	public void question_submit(View v){
		
		
		String revised_value= Integer.toString(revised_count);
		Intent i = new Intent(Login.this,Submit.class);
		i.putExtra("revised", revised_value);
		startActivity(i);
		
	
	}
}
