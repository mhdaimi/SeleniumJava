package frameworks.dataDriven.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelCommunication {
	
	
	public void read() throws IOException{
		
		File testCases = new File("InputForDataDrivenFramework.xlsx");
		FileInputStream fileInput = new FileInputStream(testCases);
		
		
		
	}
	
	
}
