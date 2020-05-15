package addreport

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




public class addreport {
	private TestObject reportlist=findTestObject('Object Repository/ReportList/reportlistoverall/reportlist')
	private TestObject addreport=findTestObject('Object Repository/ReportList/reportlistoverall/Add report')
	private TestObject vendorname=findTestObject('Object Repository/ReportList/vendor details/vendorname')
	private TestObject retailer=findTestObject('Object Repository/ReportList/vendor details/Retailer')
	private TestObject retaildashboard=findTestObject('Object Repository/ReportList/Retail dashboard/retaildashboard')
	private TestObject squarefoot=findTestObject('ReportList/Retail dashboard/square foot')
	private TestObject adhoc=findTestObject('Object Repository/ReportList/Retail dashboard/Adhoc')
	private TestObject add=findTestObject('Object Repository/ReportList/Retail dashboard/Add')
	private TestObject exceldart=findTestObject('Object Repository/ReportList/Excel Dart/excel dart')
	private TestObject reportname=findTestObject('Object Repository/ReportList/Excel Dart/Report Name')
	private TestObject assignedto =findTestObject('Object Repository/ReportList/Excel Dart/Assigned to')
	private TestObject approver=findTestObject('Object Repository/ReportList/Excel Dart/approver')
	private TestObject spdayadd=findTestObject('Object Repository/ReportList/Excel Dart/Add sp day')
	private TestObject eod =findTestObject('Object Repository/ReportList/Excel Dart/End of the day')
	private TestObject add2=findTestObject('Object Repository/ReportList/Excel Dart/add2')
	private TestObject save=findTestObject('Object Repository/ReportList/Excel Dart/save')
	@Keyword
	def reportlistnew(){

		WebUI.click(reportlist)
		WebUI.click(addreport)
		WebDriver driver = DriverFactory.getWebDriver()

		Select vn = new Select(driver.findElement(By.xpath('//*[@id="slt-Vendor"]')))
		vn.selectByValue('3210886');
		Select cu = new Select(driver.findElement(By.xpath('//*[@id="slt-Retailer"]')))
		cu.selectByValue('3110006');
		WebUI.click(retaildashboard)
		WebUI.click(squarefoot)
		WebUI.setText(adhoc,'Testing1')
		WebUI.click(add)
		WebUI.click(exceldart)
		WebUI.setText(reportname, 'report1')
		Select st = new Select(driver.findElement(By.xpath('//*[@id="slt-Assignedto"]')))
		st.selectByValue('1076');
		Select apr = new Select(driver.findElement(By.xpath('//*[@id="slt-approver"]')))
		apr.selectByValue('1078');
		WebUI.click(spdayadd)
		WebUI.click(eod)
		WebUI.click(add2)
		WebUI.click(save)
	}
	@Keyword
	def reportvalidation(){
		WebUI.click(reportlist)
		WebUI.click(addreport)
		WebUI.click(save)
	}
}
