package com.android.attendance.activity;

import com.example.androidattendancesystem.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button start;

	/**
	 * restaurer le dernier état en utilisant les données stockées dans bundle
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		start =(Button)findViewById(R.id.buttonstart);
		start.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// Pour démarrer l'activité LoginActivity à l’aide de l'intention
				Intent intent =new Intent(MainActivity.this,LoginActivity.class);
				startActivity(intent);
			}
		});



	}

	/**
	 * Creer les options du menu
	 * @param menu
	 * @return
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Monter le menu;
		// cela ajoute des éléments à la barre d’action si elle est présente
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
