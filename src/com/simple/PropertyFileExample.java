package com.simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f= new File("./config.properties");
		try {
			FileInputStream fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			
			
			System.out.println(prop.getProperty("browser"));
			
			
			FileOutputStream fos = new FileOutputStream(f);
			
			
			FileWriter fw = new FileWriter(f);
			fw.write("data=bb");
			//System.out.println(prop.getProperty("data"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}



