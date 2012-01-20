package com.stylingandroid.verticaltext;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class VerticalTextActivity extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.main );

		TextView tv = (TextView) findViewById( R.id.animated_rotation );
		tv.startAnimation( AnimationUtils.loadAnimation( this,
				R.anim.rotatetext ) );
	}
}