package file_handling;

public class Manage_XLSX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"/src/main/java/file_handling/Data.xlsx";
		Xls_Reader xlsm = new Xls_Reader(path);
		
		//1. count rows in Excel
		int rowCount = xlsm.getRowCount("LoginTest");
		System.out.println(rowCount);
		
		//2. Count columns in Excel
		int colCount = xlsm.getColumnCount("LoginTest");
		System.out.println(colCount);
		colCount = xlsm.getColumnCount("CartTest");
		System.out.println(colCount);
		
		
		//3. Reading Data in Excel
		String cellData = xlsm.getCellData("LoginTest", 1, 3);
		System.out.println(cellData);
		
		cellData = xlsm.getCellData("CartTest", "Operation", 2);
		System.out.println(cellData);
		
		
		//4. Writing Data in to Excel
		xlsm.setCellData("LoginTest", "Browser", 6, "Opera Browser");
		
	}

}
