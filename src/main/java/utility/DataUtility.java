package utility;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility 
{

//	1. Method to read single cell data
//	2. Method to read Single row data
//	3. Method to read All rows data
	public static Object[] getAlldata(String filename, String sheetname) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("./src/test/resources/Testdata/"+filename ) ;
			
			Workbook workbook = WorkbookFactory.create(fin);
			
			Sheet sheet = workbook.getSheet(sheetname);
			
			int rowCount = sheet.getPhysicalNumberOfRows();
			Object[] allRowData = new Object[ rowCount-1 ];
			for( int rowIndex=1 ; rowIndex< rowCount ; rowIndex++ )
			{
				int cellCount = sheet.getRow(rowIndex).getPhysicalNumberOfCells();
				HashMap<String, String> rowData = new HashMap<>();
				for( int cellIndex=0; cellIndex < cellCount ; cellIndex++ )
				{
					String key = sheet.getRow(0).getCell(cellIndex).getStringCellValue();
					String value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
					rowData.put(key, value);
				}
				allRowData[rowIndex-1] = rowData;
			}
			return allRowData ;
		}
		catch (Exception e) 
		{
			System.out.println( e );
		}
		return null ;
	}
	
	
	public static String getEnvironmentProperty(String key) {
		
		try 
		{
			FileInputStream fin = new FileInputStream("./Environment.properties");
			
			Properties properties = new Properties();
			
			properties.load(fin);
			
			return properties.getProperty(key);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null ;
	}
}









