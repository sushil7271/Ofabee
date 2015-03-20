package com.example.ofabee;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class SplashScreen extends Activity {

	AsyncTask<Void, Void, Void> mRegisterTask;
	 // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
   public static SharedPreferences book ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		
		new Handler().postDelayed(new Runnable() {
			 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
 
            @Override
            public void run() {
            	
            	Intent i = new Intent(SplashScreen.this,MainActivity.class);
            	startActivity(i);
            	finish();
            	
            }
        }, SPLASH_TIME_OUT);
	}
	
}
