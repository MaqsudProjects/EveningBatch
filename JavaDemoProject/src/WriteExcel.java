import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcel {
	
	static File f;
	static FileOutputStream fos;
	static FileInputStream fis;
	static HSSFWorkbook workbook;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell,cell1,cell2;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Create a File
		//File f=new File("TestData//Login.xls");
		f=new File(System.getProperty("user.dir")+"//TestData//Signup.xls");
		
		
		//FileInputStream Object Create for read the data
		 fis=new FileInputStream(f);
		
		//Create an object of Workbook
		 workbook=new HSSFWorkbook(fis);
		
		//Create Sheet
		/* sheet=workbook.createSheet();
		
		//Create Row
		 row=sheet.createRow(0);
		
		//Create Cell
		 cell=row.createCell(0);
		 cell1=row.createCell(1);
		 cell2=row.createCell(2);
		 
		
		
		cell.setCellValue("Automation Testing");
		cell1.setCellValue("Pune");
		cell2.setCellValue("Radical");*/
		
		sheet=workbook.getSheetAt(0);
		
		row=sheet.getRow(0);
		
		 cell=row.getCell(0);
		 cell1=row.getCell(1);
		 cell2=row.getCell(2);
		
		/*System.out.println("Cell0 Data::"+cell.getStringCellValue());
		System.out.println("Cell1 Data::"+cell1.getStringCellValue());
		System.out.println("Cell2 Data::"+cell2.getStringCellValue());
		*
		*
		*/
		 
		int countNoOfRows= sheet.getLastRowNum();
		System.out.println("No of Rows::"+countNoOfRows);
		System.out.println("--------------------------------------------------");
		int countNoOfCells=row.getLastCellNum();
		System.out.println("No of Cells::"+countNoOfCells);
		System.out.println("--------------------------------------------------"); 
		
		for(int i=0; i<countNoOfCells; i++)
		{
			System.out.println(sheet.getRow(0).getCell(i).getStringCellValue());
		}
		
		
		
		//Generate FileOutputStream Object
		try {
			 
			 fos=new FileOutputStream(f);
			//System.out.println("Excel File is Successfully Created!");
			workbook.write(fos);
			workbook.close();
			fos.close();
			System.out.println("Data is Successfully written inside the file");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
