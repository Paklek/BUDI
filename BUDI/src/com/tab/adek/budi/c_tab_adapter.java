package com.tab.adek.budi;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class c_tab_adapter extends FragmentPagerAdapter {

	public c_tab_adapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			return new c_tab_item_penjelasansuku();
		case 1:
			return new c_tab_item_bajuadat();
		case 2:
			return new c_tab_item_rumahadat();
		case 3:
			return new c_tab_item_makanankhas();
		case 4:
			return new c_tab_item_tariadat();
		case 5:
			return new c_tab_item_senjatatradisional();
		case 6:
			return new c_tab_item_lagudaerah();
		}
		

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 7;
	}

}

