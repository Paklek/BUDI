package com.act.adek.budi;

import com.adek.budi.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class c_act_menu extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_menu);
		Button[] btn={
				(Button)findViewById(R.id.btn_provinsi),
				(Button)findViewById(R.id.btn_setting),
				(Button)findViewById(R.id.btn_tentang_budi),
				(Button)findViewById(R.id.btn_keluar)
		};
		btn[0].setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				// Tombol menuju List Provinsi
				Intent prov_Act = new Intent("com.act.adek.budi.C_ACT_LIST_PROV");
				startActivity (prov_Act);
			}
		});
		btn[1].setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				// Tombol Pengaturan Aplikasi
				Intent setting_Act = new Intent("com.act.adek.budi.C_ACT_SETT");
				startActivity (setting_Act);
			}
		});
		btn[2].setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				// Tombol menuju ke activity tentang BUDI
			}
		});
		btn[3].setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				// Tombol keluar dari aplikasi
				dialogkeluar(c_act_menu.this);
			}
		});
	}
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	     if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	 dialogkeluar(c_act_menu.this);
	     }
	     return super.onKeyDown(keyCode, event);    
	}
	//Dialog Alert Jika Aplikasi ingin keluar
	public static void dialogkeluar(c_act_menu context){
		AlertDialog.Builder b = new AlertDialog.Builder(context);
    	b.setMessage("Apakah anda ingin keluar dari aplikasi");
    	b.setTitle("Konfirmasi"); 
    	b.setPositiveButton("Keluar", new DialogInterface.OnClickListener(){
    	@Override
    	public void onClick(DialogInterface dialog, int which){
    	    //stuff you want the button to do
    		System.exit(0);
    	}
    	});
    	b.setNegativeButton("Batal", new DialogInterface.OnClickListener(){
    	@Override
    	public void onClick(DialogInterface dialog, int which){
    	    //stuff you want the button to do
    	
    	}
    	});
    	b.show();
    
	}
}
