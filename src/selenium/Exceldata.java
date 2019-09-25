package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.ea.generic.Cell;
import com.ea.generic.DataFormatter;
import com.ea.generic.Sheet;

public class Exceldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public static String getData(String filePath, String sheetName, int rn, int cn)
	{
		try 
		{
//			FileInputStream fis = new FileInputStream(new File(filePath));
//			DataFormatter df = new DataFormatter();
//			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
//			String data = sh.getRow(rn).getCell(cn).getStringCellValue();
			
			FileInputStream fis = new FileInputStream(new File(filePath));
			DataFormatter df = new DataFormatter();
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			Cell cellData = sh.getRow(rn).getCell(cn);
			String data = df.formatCellValue(cellData);
			return data;

		} 
		catch (Exception e) 
		{
			return "";
		}
	}
	
	
	public static int getRowCount(String filePath, String sheetName)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(filePath));
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			int rc = sh.getLastRowNum();
			return rc;
		} 
		catch (Exception e) 
		{
			return 0;
		}
	}
	
	public static int getCellCount(String filePath, String sheetName, int rn)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(filePath));
			Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
			int cc = sh.getRow(rn).getLastCellNum();
			return cc;
		} 
		catch (Exception e) 
		{
			return 0;
		}
	}
	
	public static void getScreenShot(WebDriver driver, String name)
	{
		try 
		{
			TakesScreenshot t = (TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dst = new File("./screenshots/"+name+".png");
			FileHandler.copy(src, dst);
			FileHandler.copy(src, dst);
		} 
		catch (IOException e) {
		}
	}

}
