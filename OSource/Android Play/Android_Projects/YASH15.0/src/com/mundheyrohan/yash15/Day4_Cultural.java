package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day4_Cultural extends Activity implements OnClickListener{
Button freshers,warofdj;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day4_cultural);
		
		freshers=(Button)findViewById(R.id.freshers);
		warofdj=(Button)findViewById(R.id.warofdj);
		
		freshers.setOnClickListener(this);
		warofdj.setOnClickListener(this);
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		case R.id.freshers:
			Intent freshers=new Intent("com.mundheyrohan.yash15.Freshers");
			startActivity(freshers);
			break;
		
		case R.id.warofdj:
			Intent warofdj=new Intent("com.mundheyrohan.yash15.Warofdj");
			startActivity(warofdj);
			
			break;
		}
		
		
	}

}