package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day4_Sports extends Activity implements OnClickListener{

	Button tyrokick;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day4_sports);
		
		tyrokick=(Button)findViewById(R.id.tyrokick);
		
		tyrokick.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.tyrokick:
			Intent tyrokick=new Intent("com.mundheyrohan.yash15.Tyrokick");
			startActivity(tyrokick);
		break;
	
		}
		
		
	}
	
	

}
