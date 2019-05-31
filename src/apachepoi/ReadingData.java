package apachepoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	public static void main(String[] args)  {
		/*
		 * we need to open excel sheet first if not found throws FileNotFoundException
		 */

		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\PANKAJ\\Desktop\\EMPINFO.xlsx");
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		/**
		 * now need to fetch data from workbook if fail throws IOException
		 */
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			System.out.println("hi");
			e.printStackTrace();
		}
		/**
		 * now need to select sheet from the workbook 
		 */
		//XSSFSheet sheet = workbook.getSheet("Sheet1"); // providing sheet name 
		 XSSFSheet sheet = workbook.getSheetAt(0); // providing through index
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		for (int i = 0; i < rowcount; i++) {
			XSSFRow currentrow = sheet.getRow(i); // focused on current row
			for (int j = 0; j < colcount; j++) {
			String value = currentrow.getCell(j).toString(); // read value from cell
				System.out.println(value);
			}
		}
	}

}
