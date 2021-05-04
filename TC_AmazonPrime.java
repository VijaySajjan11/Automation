package com.qa.testscript3;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.testscript.ExcelUtility;

public class TC_AmazonPrime extends AmazonTestBase {
	
	@Test
	public void login()
	{
		prime.getLoginButton().click();
	}
	
	@Test(priority=1)
	public void signin() 
	{
		prime.getemail().sendKeys("vijaykumarsajjan32@gmail.com");
		prime.getpassword().sendKeys("Vijay@123");
		prime.getsignin().click();
	}
	
	@Test(priority=2,dataProvider="supplyData")  
	public void search(String input1) throws InterruptedException
	{
		
		prime.getsearchBox().sendKeys(input1,Keys.ENTER);
		prime.getsearchBox().click();
		prime.getsearchBox().clear();
		Thread.sleep(5000);
		prime.getMovie().click();
		Thread.sleep(5000);

	}
	
		@DataProvider
	public String[][] supplyData() throws IOException
	{
		String xlPath = "C:\\Users\\HP\\eclipse-workspace\\Vijay\\SeleniumAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
		String xlSheet = "Sheet1";
		int rowCount =ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
		String[][] data = new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
		for(int j=0;j<cellCount;j++)
			{
				data[i-1][j] =ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}
		return data;
		
	}

	
	
}