package com.webstaurant.testbase;

import com.webstaurant.pages.MainPageElements;

public class PageInitializer extends BaseClass{
	
	protected static MainPageElements mainpg;
	
	
	public static void initializeAllPages() {
		mainpg=new MainPageElements();
	}

}
