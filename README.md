Jog-wheel
===============

A Jog-wheel for Android.

This project forked from [RaghavSood / AndroidCircularSeekBar](https://github.com/RaghavSood/AndroidCircularSeekBar)

Screenshot:

![](https://raw.github.com/moltak/Jog-wheel/master/Jog.png)



Sample usage:
```java
public class JOActivityMain extends Activity {
  
	private JogWheel circularSeekBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		circularSeekBar = (JogWheel)findViewById(R.id.circular_seekbar);
		circularSeekBar.setMaxProgress(100);
		circularSeekBar.setProgress(50);
		circularSeekBar.invalidate();
		circularSeekBar.setSeekBarChangeListener(new OnSeekChangeListener() {
			@Override
			public void onProgressChange(JogWheel view, int newProgress) {
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
```

Advanced Usage
==============

[Advanced Usage Documentation](https://github.com/RaghavSood/AndroidCircularSeekBar/blob/master/USAGE.md#usage)
