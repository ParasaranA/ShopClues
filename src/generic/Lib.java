package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Lib {

	public static String getCellvalue(String excelpath,String sheet,int r,int c)
	{
		String v=" ";
		try{
			Workbook wb=WorkbookFactory.create(new FileInputStream(excelpath));
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return v;
	}
	public static int getRowCount(String excelpath,String sheet)
	{
		int rc=0;
		try{
			Workbook wb=WorkbookFactory.create(new FileInputStream(excelpath));
			rc=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e){
			
		}
		return rc;
	}
}
