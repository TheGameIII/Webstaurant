package com.webstaurant.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	private static Properties prop;
	private static FileInputStream fis;
	public static Properties readProperties(String filePath) {
		try {
			fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	public static String getProperties(String key) {
		return prop.getProperty(key);
	}
}
