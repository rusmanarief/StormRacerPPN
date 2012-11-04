package com.afieq.stormracerppn;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Dashboard extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_dashboard, menu);
		return true;
	}

	public void onClickBtnTeamMember(View view) {
		Intent i = new Intent(this, TeamMember.class);
		startActivity(i);
	}

	public void onClickBtnCarDesign(View view) {
		Intent i = new Intent(this, CarDesign.class);
		startActivity(i);
	}

	public void onClickBtnSponsors(View view) {
		Intent i = new Intent(this, Sponsors.class);
		startActivity(i);
	}

	public void onClickBtnResultsStats(View view) {
		Intent i = new Intent(this, ResultsStats.class);
		startActivity(i);
	}

	public void onClickBtnPhotos(View view) {
		Intent i = new Intent(this, Photos.class);
		startActivity(i);
	}

	public void onClickBtnFacebook(View view) {
		Uri uri = Uri.parse("http://www.facebook.com/stormracerppn");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}
}
