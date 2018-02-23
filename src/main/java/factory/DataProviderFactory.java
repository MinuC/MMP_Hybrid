package factory;

import dataReader.ConfigReader;
import dataReader.ExcelReader;
import dataReader.ORReader;


public class DataProviderFactory {
	
	public static ConfigReader getConfig(){ // static so that I can directly call
		
		ConfigReader config = new ConfigReader();// creating and returning the object
		return config;
	}
	
	public static ExcelReader getExcel(){ // static so that I can directly call
		
		ExcelReader excel = new ExcelReader();// creating and returning the object
		return excel;
	}
	
	
	
	public static ORReader getObject(){ // static so that I can directly call
		
		ORReader or = new ORReader();// creating and returning the object
		return or;
	}

}
