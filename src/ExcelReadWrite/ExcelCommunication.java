package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCommunication {
	
	static File xlfile1 = new File (".\\src\\ExcelReadWrite\\Scenarios.xlsx");
	static XSSFWorkbook objWorkbook;
	static XSSFSheet objWorksheet;
	static FileInputStream xlinputfile ;
	static FileOutputStream xlOutputfile ;
/*	
	ExcelReadWrite(){
		
	}*/
	
/*	public static void main(String[] args) throws IOException{
//		ReadExcel();
		WritExcel();
	}
	*/
	public static void WritExcel() throws IOException{
		xlinputfile = new FileInputStream(xlfile1);
		
		objWorkbook = new XSSFWorkbook(xlinputfile);
		objWorksheet = objWorkbook.getSheet("Scenarios");
		objWorksheet.getRow(0).createCell(3).setCellValue("Result");
		
		xlOutputfile = new FileOutputStream(xlfile1);
		objWorkbook.write(xlOutputfile);
		objWorkbook.close();
	}
	
	public static String ReadExcel(String sheetName, int row, int cellnum) throws IOException{
		xlinputfile = new FileInputStream(xlfile1);
	
		objWorkbook = new XSSFWorkbook(xlinputfile);
		objWorksheet = objWorkbook.getSheet("Scenarios");
		
		return objWorksheet.getRow(row).getCell(cellnum).getStringCellValue();
		
/*		int maximumRows = objWorksheet.getLastRowNum();
		
		for(int i = 0; i <= maximumRows; i++){
			XSSFRow row = objWorksheet.getRow(i);
			int columns = row.getLastCellNum();
			System.out.println("Row Number: " + i + " has " + columns + " columns") ;
		}*/
		//objWorkbook.close();
	}
}
