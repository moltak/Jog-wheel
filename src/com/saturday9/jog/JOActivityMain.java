package com.saturday9.jog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.saturday9.jog.CircularSeekBar.OnSeekChangeListener;

public class JOActivityMain extends Activity {
	
	private CircularSeekBar circularSeekBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		circularSeekBar = (CircularSeekBar)findViewById(R.id.circular_seekbar);
		circularSeekBar.setMaxProgress(100);
		circularSeekBar.setProgress(50);
		circularSeekBar.invalidate();
		circularSeekBar.setSeekBarChangeListener(new OnSeekChangeListener() {
			@Override
			public void onProgressChange(CircularSeekBar view, int newProgress) {
				System.out.println(newProgress);
			}
		});
	}

	public void onButtonClicked(View view) {
		switch (view.getId()) {
		case R.id.left:
			circularSeekBar.setProgress(Float.valueOf(circularSeekBar.getProgress() - 1));
			break;

		case R.id.right:
			circularSeekBar.setProgress(Float.valueOf(circularSeekBar.getProgress() + 1));
			break;

		default:
			break;
		}
	}
}
