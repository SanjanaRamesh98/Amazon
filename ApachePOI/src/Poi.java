import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Poi {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException  {
	FileInputStream fis=new FileInputStream("./Excel/Data.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	Row r=sh.getRow(1);
	Cell c=r.getCell(1);
	String data=c.toString();
	System.out.println(data);
	}
}
