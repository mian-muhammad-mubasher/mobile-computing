package pk.edu.pucit.mc.fragmentdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class DetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		int index = getIntent().getIntExtra("index",-1);
		String description = "";
		if(index == -1){
			description = "No movie selected!";
		}else{
			description  = MainActivity.movies[index].getDescription();
		}
		TextView tv = (TextView)findViewById(R.id.detail_text_view);
		tv.setText(description);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}

}
