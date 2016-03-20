package com.project.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {

	ListView fitbitlist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fitbitlist = (ListView)findViewById(R.id.list_fitbit);
		fitbitlist.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		// TODO Auto-generated method stub
		String item = fitbitlist.getItemAtPosition(position).toString();
		//Toast.makeText(this, item, Toast.LENGTH_SHORT).show();
		Intent callintent = new Intent(this, CallActivity.class);
		callintent.putExtra("itemvalue", item);
		startActivity(callintent);
	}

}