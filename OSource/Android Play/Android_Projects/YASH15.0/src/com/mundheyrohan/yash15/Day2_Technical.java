package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day2_Technical extends Activity implements OnClickListener{
Button modelmarvel,ttycoon,leathebacon;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day2_technical);
		modelmarvel=(Button)findViewById(R.id.modelmarvels);
		ttycoon=(Button)findViewById(R.id.ttycoon);
		leathebacon=(Button)findViewById(R.id.leathbackon);
		
		modelmarvel.setOnClickListener(this);
		ttycoon.setOnClickListener(this);
		leathebacon.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch(v.getId())
		{
		
		case R.id.modelmarvels:
			Intent model=new Intent("com.mundheyrohan.yash15.Modelmarvels");
			startActivity(model);
			
			break;
			
		case R.id.ttycoon:
			Intent ttycoon=new Intent("com.mundheyrohan.yash15.Ttycoon");
			startActivity(ttycoon);
			
			break;
			
		case R.id.leathbackon:
			Intent leathbackon=new Intent("com.mundheyrohan.yash15.Leathebacon");
			startActivity(leathbackon);
			
			break;
			
			
		}
		
		
	}
	
	

}
