package com.webstaurant.utils;

public class Constants {

	public static final int PAGE_LOAD_TIME=30;
	public static final int IMPLICIT_LOAD_TIME=10;
	public static final int EXPLICITI_LOAD_TIME=30;
	public static final String CREDENTIALS_FILEPATH=System.getProperty("user.dir")
			+"/src/test/resources/configs/Configuration.properties";
	public static final String REPORT_FILEPATH=System.getProperty("user.dir")
			+"/target/report/Webstourant.html";
	public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")
			+"/target/screenshots/";
	public static final String OS_NAME=System.getProperty("os.name");
	public static final String USER_NAME=System.getProperty("user.name");
}
