package amazonmavenpackage.AmazonMavenProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ExcelSheetProgram{
	
	public static String username;
	public  static String password;
	
	public void ExcelData1() throws EncryptedDocumentException, IOException 
	{

		FileInputStream f1=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\AmazonMavenProject\\ExcelSheet\\excelsheetdata.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
        
        username=NumberToTextConverter.toText(wb.getSheet("Registration").getRow(1).getCell(0).getNumericCellValue());
         password=wb.getSheet("Registration").getRow(1).getCell(1).getStringCellValue();
        
        
        
    }

}