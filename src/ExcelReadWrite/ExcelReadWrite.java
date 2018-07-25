package testpackage.ExcelCommunication.ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadWrite {

	public void ReadWriteExcel() throws IOException{
		
		File xlfile1 = new File ("Scenarios.xls");
		
		FileInputStream xlinputfile = new FileInputStream(xlfile1);
		FileOutputStream xloutputfile = new FileOutputStream(xlfile1);
	
		XSSFWorkBook objwkbook = new xssfworkbook(xlinputfile);
		XSSFsheet objwksheet = objwkbook.getsheet("Sheet1");
		
		int rowcount = objwksheet.getlastrownum();
		
		
		
		
	}
	
	
	
	
}
