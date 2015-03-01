package com.example.findaroundme;


import ressources.Compte;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private Button bInscrire; 
	private EditText tUsr; 
	private EditText tPsw;
	private EditText tMail;
	private EditText tDn;
	private EditText tTel;
	private EditText tCp;
	private Dialog box;

	private Compte compte = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		box = new Dialog(this);
		bInscrire = (Button) findViewById(R.id.btInscrire);
		tUsr = (EditText) findViewById(R.id.tUsrN);
		tPsw = (EditText) findViewById(R.id.tPsw);
		tMail = (EditText) findViewById(R.id.tMail);
		tDn = (EditText) findViewById(R.id.tDn);
		tTel = (EditText) findViewById(R.id.tTel);
		tCp = (EditText) findViewById(R.id.tCp);
		bInscrire.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				compte = new Compte(tUsr.toString(),tPsw.toString(),tMail.toString(),tDn.toString(),tTel.toString(),tCp.toString());
				box.setContentView(R.layout.boite_dial);
				box.setTitle("Yahoo !");
				box.show();

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
