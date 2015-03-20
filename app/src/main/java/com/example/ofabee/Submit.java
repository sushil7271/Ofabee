package com.example.ofabee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Submit extends Activity{
	
	TextView revised;

	int revised_count;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.submit);
		
		revised=(TextView)findViewById(R.id.revised_count);
		
		Intent intent=getIntent();
		
		String revise=intent.getExtras().getString("revised");
		revised.setText(revise);
		
		
		
	}
}
