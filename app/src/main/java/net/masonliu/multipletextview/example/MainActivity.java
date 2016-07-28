package net.masonliu.multipletextview.example;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

import net.masonliu.multipletextview.library.MultipleTextViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity implements MultipleTextViewGroup.OnMultipleTVItemClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		List<String> dataList = new ArrayList<String>();
		
		dataList.add("Mr  Shu");
		dataList.add("Mr  Shu");
		
		dataList.add("");
		dataList.add("Mr  Shu Mr  Shu");

		dataList.add("Mr  Shu");
		dataList.add("雪梅 雪梅");
		dataList.add("雪梅雪梅雪梅雪梅");
		dataList.add("YangYang");

		dataList.add("Mason");
		dataList.add("LOVE");
		dataList.add("8023");
		dataList.add("Ma");


		MultipleTextViewGroup rl = (MultipleTextViewGroup) findViewById(R.id.main_rl);
		rl.setOnMultipleTVItemClickListener(this);
		rl.setTextViews(dataList);
		
	}


	public void onMultipleTVItemClick(View view, int position) {
		Toast.makeText(getApplicationContext(), "sssss"+position, Toast.LENGTH_SHORT).show();
	}

}
