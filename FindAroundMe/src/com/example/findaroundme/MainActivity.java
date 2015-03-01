package com.example.findaroundme;


import ressources.Compte;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private Button bInscrire = (Button) findViewById(R.id.btInscrire);
	private EditText tUsr = (EditText) findViewById(R.id.tUsrN);
	private EditText tPsw = (EditText) findViewById(R.id.tPsw);
	private EditText tMail = (EditText) findViewById(R.id.tMail);
	private EditText tDn = (EditText) findViewById(R.id.tDn);
	private EditText tTel = (EditText) findViewById(R.id.tTel);
	private EditText tCp = (EditText) findViewById(R.id.tCp);
	
	private Compte compte = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		bInscrire.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				compte = new Compte(tUsr.toString(),tPsw.toString(),tMail.toString(),tDn.toString(),tTel.toString(),tCp.toString());
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
