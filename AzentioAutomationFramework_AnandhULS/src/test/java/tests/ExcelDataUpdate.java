package tests;

import java.util.HashMap;
import java.util.Map;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;

public class ExcelDataUpdate {
	public static void main(String args[])
	{
		ConfigFileReader configFileReader= new ConfigFileReader();
		ExcelData exceldata = new ExcelData(configFileReader.getAutoLoanTestDataFilePath(), "NewApp_CustomerDetailsTestData", "Dataset ID");
		Map<String,String> testData= new HashMap<>();
		testData=exceldata.getTestdata("DS01_AT_AT_AL_CUSDETAILS_01");
		System.out.println("TestData "+testData.get("search_date_of_birth"));
	}

}
