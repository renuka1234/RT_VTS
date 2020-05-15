package reportlistdropdownvalues

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

public class primarychooseanalyst {
	private TestObject reportlist=findTestObject('Object Repository/ReportList/reportlistoverall/reportlist')
	private TestObject assigned=findTestObject('Object Repository/ReportList/reportlistoverall/clickassigned')
	private TestObject showbackup=findTestObject('Object Repository/ReportList/Backup/showbackup')
	private TestObject backup=findTestObject('Object Repository/ReportList/Backup/backup')
	private TestObject search=findTestObject('Object Repository/ReportList/reportlistoverall/search')
	private TestObject export=findTestObject('Object Repository/ReportList/reportlistoverall/export')
	@Keyword
	def panalyst(){
		WebUI.click(reportlist)
		WebDriver driver = DriverFactory.getWebDriver()
		Select pa = new Select(driver.findElement(By.xpath('//*[@id="flt-analyst"]')))
		pa.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def pvendor(){
		WebUI.click(reportlist)
		WebDriver driver = DriverFactory.getWebDriver()
		Select pa = new Select(driver.findElement(By.xpath('//*[@id="flt-vendor"]')))
		pa.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def pfrequency(){
		WebUI.click(reportlist)
		WebDriver driver = DriverFactory.getWebDriver()

		Select pa = new Select(driver.findElement(By.xpath('//*[@id="flt-frequency"]')))
		pa.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def pduedate(){
		WebUI.click(reportlist)
		WebDriver driver = DriverFactory.getWebDriver()

		Select pd = new Select(driver.findElement(By.xpath('//*[@id="flt-DayDue"]')))
		pd.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def aanalyst1(){
		WebUI.click(reportlist)
		WebUI.click(assigned)
		WebDriver driver = DriverFactory.getWebDriver()

		Select ad = new Select(driver.findElement(By.xpath('//*[@id="flt-analyst"]')))
		ad.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def avendor1(){
		WebUI.click(reportlist)
		WebUI.click(assigned)
		WebDriver driver = DriverFactory.getWebDriver()
		Select aa = new Select(driver.findElement(By.xpath('//*[@id="flt-vendor"]')))
		aa.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def afrequency1(){
		WebUI.click(reportlist)
		WebUI.click(assigned)
		WebDriver driver = DriverFactory.getWebDriver()
		Select aa = new Select(driver.findElement(By.xpath('//*[@id="flt-frequency"]')))
		aa.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def aduedate1(){
		WebUI.click(reportlist)
		WebUI.click(assigned)
		WebDriver driver = DriverFactory.getWebDriver()
		Select ad = new Select(driver.findElement(By.xpath('//*[@id="flt-DayDue"]')))
		ad.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def banalyst(){
		WebUI.click(reportlist)
		WebUI.click(showbackup)
		WebUI.click(backup)
		WebDriver driver = DriverFactory.getWebDriver()

		Select ba = new Select(driver.findElement(By.xpath('//*[@id="flt-analyst"]')))
		ba.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def bvendor(){
		WebUI.click(reportlist)
		WebUI.click(showbackup)
		WebUI.click(backup)
		WebDriver driver = DriverFactory.getWebDriver()

		Select bd = new Select(driver.findElement(By.xpath('//*[@id="flt-vendor"]')))
		bd.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def bfrequency(){
		WebUI.click(reportlist)
		WebUI.click(showbackup)
		WebUI.click(backup)
		WebDriver driver = DriverFactory.getWebDriver()

		Select bf= new Select(driver.findElement(By.xpath('//*[@id="flt-frequency"]')))
		bf.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
	@Keyword
	def bduedate(){
		WebUI.click(reportlist)
		WebUI.click(showbackup)
		WebUI.click(backup)
		WebDriver driver = DriverFactory.getWebDriver()

		Select bd = new Select(driver.findElement(By.xpath('//*[@id="flt-DayDue"]')))
		bd.selectByIndex(2);
		WebUI.click(search)
		WebUI.click(export)
	}
}
