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

public class playbook {
	private TestObject reportlist=findTestObject('Object Repository/ReportList/playbook/reportlist')
	private TestObject playbook=findTestObject('Object Repository/ReportList/playbook/click playbook')
	private TestObject cvendor=findTestObject('Object Repository/ReportList/playbook/choose vendor')
	private TestObject checkall=findTestObject('Object Repository/ReportList/playbook/checkall')
	private TestObject assign=findTestObject('Object Repository/ReportList/playbook/Assign')
	@Keyword
	def addingplaybook(){
		WebUI.click(reportlist)
		WebUI.click(playbook)
		WebDriver driver = DriverFactory.getWebDriver()

		Select cv = new Select(driver.findElement(By.xpath('//*[@id="slt-Vendor"]')))
		cv.selectByValue("3210886")
		WebUI.delay(2)
		WebUI.click(checkall)
		WebUI.delay(2)
		WebUI.click(assign)
	}
	@Keyword
	def Alldropdowns(){
		WebUI.click(reportlist)
		WebUI.click(playbook)
		WebDriver driver = DriverFactory.getWebDriver()

		Select cv = new Select(driver.findElement(By.xpath('//*[@id="slt-Vendor"]')))
		cv.selectByValue("3210886")
		Select rr = new Select(driver.findElement(By.xpath('//*[@id="slt-retailer-filter"]')))
		rr.selectByValue("3110010")

		Select aa = new Select(driver.findElement(By.xpath('//*[@id="slt-Analyst"]')))
		aa.selectByValue("1083")
		Select rt = new Select(driver.findElement(By.xpath('//*[@id="slt-ReportType"]')))
		rt.selectByValue("331100101")
		Select ad = new Select(driver.findElement(By.xpath('//*[@id="slt-Assigned"]')))
		ad.selectByValue("1")
	}
}
