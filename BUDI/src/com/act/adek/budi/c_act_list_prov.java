package com.act.adek.budi;
import com.adek.budi.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class c_act_list_prov extends Activity {
	private ListView list;
	ArrayAdapter<?> adapter;
	EditText input;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		overridePendingTransition(R.anim.toright,0);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_list_prov);
		String[] prov={
				"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Lampung",
				"Bengkulu","Jambi","Sumatera Selatan","Gorontalo","Bali","Bangka Belitung",
				"Banten","DKI Jakarta","Jawa Barat","Jawa Tengah","Jawa Timur",
				"Kepulauan Riau","DI Yogyakarta"  
		};
		list = (ListView)findViewById(R.id.listview1);
		input = (EditText)findViewById(R.id.InputSearch);
		adapter = new ArrayAdapter<Object>(this,R.layout.dummy_list_prov,R.id.NameList,prov);
		list.setAdapter(adapter);
	        
	        list.setOnItemClickListener(new OnItemClickListener() {
	        	  @Override
	        	  public void onItemClick(AdapterView<?> parent, View view,
	        	    int position, long id) {
	        		  Object o = list.getItemAtPosition(position);
	        		  String pilihan = o.toString();
	                  Intent intent = new Intent("com.tab.adek.budi.C_TAB_MAIN");
	                  intent.putExtra("kirim", pilihan);
	                  startActivity(intent);   
	        	  }
	        	}); 
	        
	        input.addTextChangedListener(new TextWatcher() {
	             
	            public void onTextChanged(CharSequence s, int arg1, int arg2, int arg3) {	           
	            c_act_list_prov.this.adapter.getFilter().filter(s);
	            }
	             
	            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
	                    int arg3) {
	            }
	             
	            public void afterTextChanged(Editable arg0) {
	            }            
	        });
	}
	@Override
	public void onBackPressed() {
	    finish();//go back to the previous Activity
        overridePendingTransition(R.anim.toleft,0);   
	}
    
	
}
