package exceldata;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	static String excelpath = "C:\\software1\\nanna\\sai123\\resources\\excelsheets\\testdata.xlsx";
	
	public static String readdata(int row , int clm) throws IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		return wb.getSheet("Sheet1").getRow(row).getCell(clm).getStringCellValue();
		
	}
	public static void writedata(int row ,int clm , String value) throws IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet1").getRow(row).createCell(clm).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		fos.close();
		
	}

}
