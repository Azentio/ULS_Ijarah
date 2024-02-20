package dataprovider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "configs//data.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public String getIjaraApplicationURL() {
		String url = properties.getProperty("IjaraApplicationURL");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getBrowser() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	public long getTimeOut() {
		String timeOut = properties.getProperty("timeout");
		long parseLong = Long.parseLong(timeOut);
		if (parseLong != 0)
			return parseLong;
		else
			throw new RuntimeException("timeOut not specified in the Configuration.properties file.");
	}

	public long getPollingTime() {
		String pollingTime = properties.getProperty("pollingTime");
		long parseLong = Long.parseLong(pollingTime);
		if (parseLong != 0)
			return parseLong;
		else
			throw new RuntimeException("pollingTime not specified in the Configuration.properties file.");
	}

	public String getTestDataFilePath() {

		String filePath;
		filePath = System.getProperty("user.dir") + "\\TestData\\ulsTestData.xlsx";

		return filePath;
	}
	public String getAutoLoanTestDataFilePath() {

		String filePath;
		filePath = System.getProperty("user.dir") + "\\TestData\\ULS_AutoLoanTestData.xlsx";

		return filePath;
	}

	public String getJSFilePath() {
		String jsFilePath;
		jsFilePath = System.getProperty("user.dir") + "\\TestData\\ulsJsPaths.xlsx";
		return jsFilePath;
	}

	

	public void setJarahRecordReferenceNumber(String referenceNumber) throws IOException {
		OutputStream outputStream = new FileOutputStream(new File(propertyFilePath));
		properties.setProperty("IjarahRecordReferenceNumber", referenceNumber);
		properties.store(outputStream, null);

	}

	public String getIjarahRecordReferenceNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("IjarahRecordReferenceNumber");
		return recordReferenceNumber;
	}

	public void setTawruqqRecordReferenceNumber(String refernceNumber) throws IOException {
		OutputStream outputStream = new FileOutputStream(new File(propertyFilePath));
		properties.setProperty("TawruqqRecordReferenceNumber", refernceNumber);
		properties.store(outputStream, null);
	}

	public String getTawruqqRecordRefereneNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("TawruqqRecordReferenceNumber");
		return recordReferenceNumber;
	}
	public String getAutoLoanReferenceNumber()
	{
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("autoLoanReferenceNumber");
		return recordReferenceNumber;
	}public String getAutoLoanNewAppReferenceNumber()
	{
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("getAutoLoanNewAppReferenceNumber");
		return recordReferenceNumber;
	}
	public String getAutioLoanAppDataEntryRefNo()
	{
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("autoLoanAppDataEntryReferenceNumber");
		return recordReferenceNumber;
	}
	public void SetAutoLoanReferenceNumber(String referenceNumber) throws IOException
	{
		OutputStream outputStream = new FileOutputStream(new File(propertyFilePath));
		properties.setProperty("autoLoanReferenceNumber", referenceNumber);
		properties.store(outputStream, null);
	}
	public String getTawruqqOfferingRecordReferenceNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("TawruqqOfferingReferenceNumber");
		return recordReferenceNumber;
	}

	public void setMurabahaRecordReferenceNumber(String referenceNumber) throws IOException {
		OutputStream outputStream = new FileOutputStream(new File(propertyFilePath));
		properties.setProperty("MurabaharecordReferenceNumber", referenceNumber);
		properties.store(outputStream, null);

	}

	public String getMurabahaPurchaseOrderApprovalRecordReferenceNumber() throws IOException {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("MurabahaPurchaseOrderApprovalRecordNumber");
		return recordReferenceNumber;

	}

	public String getMurabahaRecordRefereneNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("MurabaharecordReferenceNumber");
		return recordReferenceNumber;
	}
	public String getTawruqqAppDataCheckReferenceNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("TawruqqAppDataCheckReferenceNumber");
		return recordReferenceNumber;
	}
	public String getMurabahaPurchaseOrderRecordRefereneNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("MurabahaPurchaseOrderRefNo");
		return recordReferenceNumber;
	}
	public String getIjarahAppDataEntryRecordReferenceNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("IjarahAppDataEntryRecordReferenceNumber");
		return recordReferenceNumber;
	}
	public String getMurabahaDataEntryRecordReferenceNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("murabahaDataEntryRecordReferenceNumber");
		return recordReferenceNumber;
	}
	public String getIjarahDataCheckRecordReferenceNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("IjarahAppDataCheckRecordReferenceNumber");
		return recordReferenceNumber;
	}
	public String getMurabahaDataCheckRecordReferenceNumber() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("MurabahaDataCheckRefNo");
		return recordReferenceNumber;
	}
	//AutoLoanDisbMkrRecordNo
	public String getAutoloanDisMkrRecordNo() {
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("AutoLoanDisbMkrRecordNo");
		return recordReferenceNumber;
	}
	public String getAutoLoanDataEntryRecordReferenceNumber()
	{
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("getAutoLoanDataEntryReferenceNumber");
		return recordReferenceNumber;
	}
	
	public String getAutoLoanOfferingReferedReferenceNumber()
	{
		String recordReferenceNumber;
		recordReferenceNumber = properties.getProperty("getAutoLoanOfferingReferenceNumber");
		return recordReferenceNumber;
	}
}
