package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

public class ExcelCommunication {
/*	
	ExcelReadWrite(){
		
	}*/
	
	public static void main(String[] args) throws IOException{
		
		ReadExcel();
		
	}
	
	public static void ReadExcel() throws IOException{
		
		File xlfile1 = new File (".\\src\\ExcelReadWrite\\Scenarios.xls");
		
		FileInputStream xlinputfile = new FileInputStream(xlfile1);
		//FileOutputStream xloutputfile = new FileOutputStream(xlfile1);
	
		XSSFWorkbook objWorkbook = new XSSFWorkbook(xlinputfile);
		XSSFSheet objWorksheet = objWorkbook.getSheet("Sheet1");
		
		int maximumRows = objWorksheet.getLastRowNum();
		
		for(int i = 0; i < maximumRows; i++){
			XSSFRow row = objWorksheet.getRow(i);
			
			int columns = row.getLastCellNum();
			
			System.out.println("Row Number: " + i + " has " + columns + " columns") ;
		}
	}
	
}
