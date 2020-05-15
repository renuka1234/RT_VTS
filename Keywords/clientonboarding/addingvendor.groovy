package clientonboarding

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement

import org.openqa.selenium.WebDriver

import internal.GlobalVariable

public class addingvendor {
	private TestObject clientonboarding =findTestObject('Object Repository/Client OnBoarding/Client on boarding')
	private TestObject addvendor=findTestObject('Object Repository/Client OnBoarding/Add Vendor')
	private TestObject vendorname=findTestObject('Object Repository/Client OnBoarding/vendor name')
	private TestObject vendorcode=findTestObject('Object Repository/Client OnBoarding/vendor code')
	private TestObject contractenddate=findTestObject('Object Repository/Client OnBoarding/contract end date')
	private TestObject enddate=findTestObject('Object Repository/Client OnBoarding/End date')
	private TestObject contactdetails=findTestObject('Object Repository/Client OnBoarding/contact details')
	private TestObject addretailer=findTestObject('Object Repository/Client OnBoarding/Add Retailer')
	private TestObject retailer=findTestObject('Object Repository/Client OnBoarding/Retailer')
	private TestObject hovbu=findTestObject('Object Repository/Client OnBoarding/HOVBU')
	private TestObject primaryanalyst =findTestObject('Object Repository/Client OnBoarding/primary Analyst')
	private TestObject backupanalyst=findTestObject('Object Repository/Client OnBoarding/Back up analyst')
	private TestObject iscanalyst=findTestObject('Object Repository/Client OnBoarding/isc analyst')
	private TestObject status=findTestObject('Object Repository/Client OnBoarding/status')
	private TestObject servicetype=findTestObject('Object Repository/Client OnBoarding/service type')
	private TestObject hourlyrate=findTestObject('Object Repository/Client OnBoarding/hourly rate')
	private TestObject notes=findTestObject('Object Repository/Client OnBoarding/notes')
	private TestObject name=findTestObject('Object Repository/Client OnBoarding/Name')
	private TestObject email=findTestObject('Object Repository/Client OnBoarding/Email')
	private TestObject contactnumber=findTestObject('Object Repository/Client OnBoarding/contact number')
	private TestObject add=findTestObject('Object Repository/Client OnBoarding/Add')
	private TestObject save=findTestObject('Object Repository/Client OnBoarding/save')
	private TestObject save2=findTestObject('Object Repository/Client OnBoarding/save 2')
	private TestObject clientsearch=findTestObject('Object Repository/Client OnBoarding/clientsearch')
	private TestObject clientedit=findTestObject('Object Repository/Client OnBoarding/client edit')
	private TestObject moreoptions=findTestObject('Object Repository/Client OnBoarding/clientmoreoption')
	private TestObject update=findTestObject('Object Repository/Client OnBoarding/update')
	@Keyword
	def vendor1(){
		WebDriver driver = DriverFactory.getWebDriver()
		WebUI.click(clientonboarding)
		WebUI.click(addvendor)
		WebUI.setText(vendorname,'Marc 19 Testing')
		WebUI.setText(vendorcode, '1234')
		Select cu = new Select(driver.findElement(By.xpath('//*[@id="slt-intensity"]')))
		cu.selectByIndex(2);
		WebUI.click(contractenddate)
		WebUI.click(enddate)
		WebUI.click(contactdetails)
		WebUI.click(addretailer)
		Select re = new Select(driver.findElement(By.xpath('//*[@id="slt-Retailer"]')))
		re.selectByIndex(2);
		WebUI.setText(hovbu, '1234')
		Select pa = new Select(driver.findElement(By.xpath('//*[@id="slt-PrimaryAnalyst"]')))
		pa.selectByIndex(4);
		Select ba = new Select(driver.findElement(By.xpath('//*[@id="slt-BackupAnalyst"]')))
		ba.selectByIndex(13);
		Select isc = new Select(driver.findElement(By.xpath('//*[@id="slt-IscAnalyst"]')))
		isc.selectByIndex(3);
		Select st= new Select(driver.findElement(By.xpath('//*[@id="slt-Status"]')))
		st.selectByIndex(2);
		Select se = new Select(driver.findElement(By.xpath('//*[@id="slt-ServiceStatus"]')))
		se.selectByIndex(2);
		WebUI.setText(hourlyrate, '2')
		WebUI.setText(notes,'new retailer')
		WebUI.setText(name,'test')
		WebUI.setText(email,'test@gmail.com')
		WebUI.setText(contactnumber,'9848014548')
		WebUI.click(add)
		WebUI.click(save)
		WebUI.click(save2)
	}
	@Keyword
	def clientdropdowns(){
		WebUI.click(clientonboarding)
		WebDriver driver = DriverFactory.getWebDriver()
		Select ve= new Select(driver.findElement(By.xpath('//*[@id="lst-filter-vendorretailer-vendor"]')))
		ve.selectByIndex(2);
		Select re = new Select(driver.findElement(By.xpath('//*[@id="lst-filter-vendorretailer-responsibility"]')))
		re.selectByIndex(2);
		WebUI.click(clientsearch)
	}
	@Keyword
	def validation(){
		WebUI.click(clientonboarding)
		WebUI.click(addvendor)
		WebUI.click(save2)
	}
	@Keyword
	def editvendor(){
		WebUI.click(clientonboarding)
		WebDriver driver = DriverFactory.getWebDriver()
		Select ve1= new Select(driver.findElement(By.xpath('//*[@id="lst-filter-vendorretailer-vendor"]')))
		ve1.selectByValue("3210886");
		WebUI.click(clientsearch)
		WebUI.click(moreoptions)
		WebUI.click(clientedit)
		WebUI.clearText(vendorname)
		WebUI.setText(vendorname,'march 19 testing')
		WebUI.click(update)
	}
}
