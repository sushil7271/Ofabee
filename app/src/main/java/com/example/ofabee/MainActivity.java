package com.example.ofabee;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;


public class MainActivity extends Activity {

	
	TextView fb;
	TextView ofabee;
	TextView txt_forgot;
	ImageView img_submit;
	
	int i=0;
	EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
      
        
         fb=(TextView)findViewById(R.id.txt_facebook);
         ofabee=(TextView)findViewById(R.id.textView4); 
         txt_forgot=(TextView)findViewById(R.id.txt_forgot);
         img_submit=(ImageView)findViewById(R.id.submit);
         
         Typeface font1 = Typeface.createFromAsset(getAssets(), "fonts/LANENAR_.ttf");
         ofabee.setTypeface(font1);
         
         
         password=(EditText)findViewById(R.id.editText2);
         
         password.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
				
				if(s.length()>0){
					txt_forgot.setVisibility(View.GONE);
					img_submit.setVisibility(View.VISIBLE);
				
				}
				else {
					txt_forgot.setVisibility(View.VISIBLE);
					img_submit.setVisibility(View.GONE);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				if(s.length()>0){
					txt_forgot.setVisibility(View.GONE);
					img_submit.setVisibility(View.VISIBLE);
				
				}
				else {
					txt_forgot.setVisibility(View.VISIBLE);
					img_submit.setVisibility(View.GONE);
				}
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
		});
         
        
   		fb.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				Intent i = new Intent(MainActivity.this,CourseList.class);
				startActivity(i);
				
				
			}
		});
   
        
    }
    
    
    
    


   
}
