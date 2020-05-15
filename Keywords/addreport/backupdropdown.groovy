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

public class backupdropdown {
	private TestObject reportlist=findTestObject('Object Repository/ReportList/reportlistoverall/reportlist')
	private TestObject showbackup=findTestObject('Object Repository/ReportList/Backup/showbackup')
	private TestObject backup=findTestObject('Object Repository/ReportList/Backup/backup')
	private TestObject search=findTestObject('Object Repository/ReportList/reportlistoverall/search')
	private TestObject reset=findTestObject('Object Repository/ReportList/reportlistoverall/Reset')



	@Keyword
	def filters(){
		WebUI.click(reportlist)
		WebUI.click(showbackup)
		WebUI.click(backup)
		WebDriver driver = DriverFactory.getWebDriver()
		Select  ay= new Select(driver.findElement(By.xpath('//*[@id="flt-analyst"]')))
		ay.selectByIndex(2);
		Select ve = new Select(driver.findElement(By.xpath('//*[@id="flt-vendor"]')))
		ve.selectByIndex(2);

		Select fr = new Select(driver.findElement(By.xpath('//*[@id="flt-frequency"]')))
		fr.selectByIndex(2);

		Select  dd= new Select(driver.findElement(By.xpath('//*[@id="flt-DayDue"]')))
		dd.selectByIndex(2);
		WebUI.click(search)
	}
}

