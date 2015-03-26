package com.mundheyrohan.yash15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Day5_Sports extends Activity implements OnClickListener{
Button basketball,tabletennis;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day5_sports);
		basketball=(Button)findViewById(R.id.basketball);
		tabletennis=(Button)findViewById(R.id.tabletennis);
		
		basketball.setOnClickListener(this);
		tabletennis.setOnClickListener(this);
		
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.basketball:
			Intent basketball=new Intent("com.mundheyrohan.yash15.Basketball");
			startActivity(basketball);
			
			break;
		case R.id.tabletennis:
			Intent tabletennis=new Intent("com.mundheyrohan.yash15.Tabletenis");
			startActivity(tabletennis);
			
			break;

		}
	}

}