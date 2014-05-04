package com.tab.adek.budi;


import com.adek.budi.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class c_tab_item_penjelasansuku extends Fragment {
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Lampung",
			"Bengkulu","Jambi","Sumatera Selatan","Gorontalo","Bali","Bangka Belitung","Banten",
			"DKI Jakarta","Jawa Barat","Jawa Tengah","Jawa Timur","Kepulauan Riau",
			"DI Yogyakarta"
	};
	private int[][] listsuku = {
			{R.string.s_prov_suku_0},
			{R.string.s_prov_suku_1}
	};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		String temp = "";
		View rootView = inflater.inflate(R.layout.tab_item_penjelasansuku, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		TextView txt = (TextView)rootView.findViewById(R.id.txtSuku);
		TextView txtp = (TextView)rootView.findViewById(R.id.txtP);
		temp +=txtp.getText()+ " "+kirim;
		txtp.setText(temp);
		for(int i=0;i<listProv.length;i++){ 
			if(kirim.equals(listProv[i])) 
				txt.setText(listsuku[i][0]);
		}
		return rootView;
	}
}
