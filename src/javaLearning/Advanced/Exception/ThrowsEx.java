package javaLearning.Advanced.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openTextFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public static void openTextFile() throws IOException  {
		File file = new File(".\\src\\ExcelReadWrite\\Scenarios.xls");
		FileInputStream ip = new FileInputStream(file);
	}

}
