package com.ibm.mobilefirstplatform.sample.bluelist;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created on 8/20/15.
 */
public class SplashActivity extends Activity {

	private static final int SPLASH_DELAY = 3 * 1000;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run () {
				finish();
			}
		}, SPLASH_DELAY);
	}
}
