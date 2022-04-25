package executionEngine;

import config.ActionKeywords;
import utility.ExcelUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DriverScript {
	public static void main(String[] args) throws Exception {

		// Declaring the path of the Excel file with the name of the Excel file
		String sPath = "D:\\TestAutomation\\TestAutomation_KDF\\src\\dataEngine\\DataEngine.xlsx";

		// Here we are passing the Excel path and SheetName as arguments to connect with
		// Excel file
		ExcelUtils.setExcelFile(sPath, "Test Steps");
		// Hard coded values are used for Excel row & columns for now
		// In later chapters we will replace these hard coded values with varibales
		// This is the loop for reading the values of the column 3 (Action Keyword) row
		// by row
		for (int iRow = 1; iRow <= 9; iRow++) {
			// Storing the value of excel cell in sActionKeyword string variable
			String sActionKeywords = ExcelUtils.getCellData(iRow, 3);
			// Comparing the value of Excel cell with all the project keywords

			if (sActionKeywords.equals("openBrowser")) {
				// This will execute if the excel cell value is 'openBrowser'
				// Action Keyword is called here to perform action
				ActionKeywords.openBrowser();
			} else if (sActionKeywords.equals("navigate")) {
				// This will execute if the excel cell value is 'navigate'
				// Action Keyword is called here to perform action
				ActionKeywords.navigate();
			} else if (sActionKeywords.equals("SwitchToWindow")) {
				// This will execute if the excel cell value is 'SwitchToWindow'
				// Action Keyword is called here to perform action
				ActionKeywords.SwitchToWindow();
			
			} else if (sActionKeywords.equals("waitFor")) {
				// This will execute if the excel cell value is 'waitFor'
				// Action Keyword is called here to perform action
				ActionKeywords.waitFor();
			}else if (sActionKeywords.equals("input_Username")) {
					// This will execute if the excel cell value is 'input_Username'
					// Action Keyword is called here to perform action
					ActionKeywords.input_Username();
					
			}else if (sActionKeywords.equals("input_Password")) {
						// This will execute if the excel cell value is 'input_Password'
						// Action Keyword is called here to perform action
						ActionKeywords.input_Password();
						
			}else if (sActionKeywords.equals("payment_Page")) {
							// This will execute if the excel cell value is 'payment_Page'
							// Action Keyword is called here to perform action
							ActionKeywords.payment_Page();
							
			}else if (sActionKeywords.equals("waitFor")) {
				// This will execute if the excel cell value is 'waitFor'
				// Action Keyword is called here to perform action
				ActionKeywords.waitFor();
				
			} else if (sActionKeywords.equals("closeBrowser")) {
				// This will execute if the excel cell value is 'closeBrowser'
				// Action Keyword is called here to perform action
				ActionKeywords.closeBrowser();
			}

		}

	}

}
