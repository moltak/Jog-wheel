package com.saturday9.jog;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class JOActivityMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		CircularSeekBar seekbar = (CircularSeekBar)findViewById(R.id.circular_seekbar);
		seekbar.setMaxProgress(100);
		seekbar.setProgress(50);
		seekbar.invalidate();
	}
}
