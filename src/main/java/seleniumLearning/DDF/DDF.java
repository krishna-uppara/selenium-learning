package seleniumLearning.DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDF
{

	public InputStream dataFile;
	public Workbook workBook;

	public DDF(String filename) throws Exception, InvalidFormatException
	{

		System.out.println(filename);
		try
		{
			dataFile = new FileInputStream(".//excels//" + filename);
			workBook = WorkbookFactory.create(dataFile);

		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * 
	 * @param testcase
	 * @return
	 */
	public HashMap<String, String> getRow(String testcase)
	{
		HashMap<String, String> testData = new HashMap<String, String>();
		String testSheetName = getTestSheetName(testcase);
		Sheet testSheet = workBook.getSheet(testSheetName);
		String cellData;
		int totalRows = testSheet.getLastRowNum();
		int totalCells = testSheet.getRow(0).getLastCellNum();
		System.out.println(totalRows);
		System.out.println(totalCells);
		// Row starts from 1 as first row is header
		for (int row = 1; row <= totalRows; row++)
		{
//			System.out.println(testSheet.getRow(row).getCell(0).toString());

			if (testcase.equalsIgnoreCase(testSheet.getRow(row).getCell(0).toString()))
			{

				// int totalCells = testSheet.getRow(row).getLastCellNum();
				for (int cell = 1; cell <= totalCells; cell++)
				{
					// First column shows the scenario name.
					if (testSheet.getRow(row).getCell(cell) == null)
					{
						cellData = "";
					}

					else
					{
						cellData = testSheet.getRow(row).getCell(cell).toString();
						System.out.println(cellData);
					}

					String celllName = testSheet.getRow(0).getCell(cell).toString();
					System.out.println(celllName);
					testData.put(celllName, cellData);
				}
				break;
			}
		}

		return testData;
	}

	public String getTestSheetName(String testcase)
	{

		Sheet overviewSheet = workBook.getSheet("overview"); // first sheet
		int totalRows = overviewSheet.getLastRowNum();

		// Row starts from 1 as first row is header
		for (int row = 1; row <= totalRows; row++)
		{
//			System.out.println(overviewSheet.getRow(row).getCell(1).toString());
			if (testcase.equalsIgnoreCase(overviewSheet.getRow(row).getCell(1).toString()))
			{
				return overviewSheet.getRow(row).getCell(0).toString();
			}
		}
		return "TestSheet Not Found";
	}

	public static void main(String[] args) throws Exception, Throwable
	{
		DDF excel = new DDF("smokeTest1.xlsx");
		HashMap<String, String> testData = excel.getRow("aaaa");
		System.out.println(testData);
	}

}
