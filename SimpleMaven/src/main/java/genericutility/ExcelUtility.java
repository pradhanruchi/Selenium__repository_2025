package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Ruchi Pradhan
 */

public class ExcelUtility {
	/**
	 * This method will return String formate
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return String
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	/**
	 * This method will return String formate
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return String
	 * @throws IOException
	 */
	public double getNumberDataFromExcel(String sheetName,int rowIndex,int colIndex) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	
	}
	/**
	 * This method will return Boolean fromate
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return boolean
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int colIndex) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	
	}
	/**
	 * This method will retrun DateAndTime formate
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return String
	 * @throws IOException
	 */
	public LocalDateTime getDateAndTimeFromExcel(String sheetName,int rowIndex,int colIndex) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();

}
}
	
	
