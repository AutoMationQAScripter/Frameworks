package configs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchData {
	public static String username;
	public static String password;
	public static void fetchData() throws IOException {
		String FilePath = "C:\\Users\\santo\\Desktop\\users.xlsx" ;
		FileInputStream fs = new FileInputStream(FilePath);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sh1= wb.getSheetAt(0);
		username =sh1.getRow(1).getCell(0).getStringCellValue();
		password =sh1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		
		}

}
