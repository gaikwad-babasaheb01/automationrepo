package fileHandling;

import java.io.IOException;

public class TextXlsReaderClass {

	public static void main(String[] args) throws IOException {

		Xls_Reader xl=new Xls_Reader("G:\\automationrepo\\BasicCoreJava\\src\\fileHandling\\TestData.xls");
		
		//get row count
		System.out.println(xl.getRowCount("Sheet1"));
		
		//get colun count
		System.out.println(xl.getColumnCount("Sheet1"));
		
		//get Cell data
		System.out.println(xl.getCellData("sheet1", 1, 1));
	}

}
