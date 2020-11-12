package com.webstaurant.testbase;

import com.webstaurant.pages.MainPageElements;

public class PageInitializer extends BaseClass{
	
	protected static MainPageElements webs;
	
	
	public static void initializeAllPages() {
		webs=new MainPageElements();
	}

}
