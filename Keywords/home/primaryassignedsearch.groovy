package home

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

public class primaryassignedsearch {
	private TestObject home=findTestObject('Object Repository/Home/home')
	private TestObject primary =findTestObject('Object Repository/Home/primary')
	private TestObject assigned =findTestObject('Object Repository/Home/assigned')
	private TestObject search=findTestObject('Object Repository/Home/search')
	@Keyword
	def PA(){
		WebUI.click(home)
		WebUI.click(primary)
		WebDriver driver = DriverFactory.getWebDriver()
		Select pa = new Select(driver.findElement(By.xpath('//*[@id="lst-filter-Analyst"]')))
		pa.selectByIndex(2);
		WebUI.click(search)
	}
	@Keyword
	def AS(){
		WebUI.click(home)
		WebUI.click(assigned)
		WebDriver driver = DriverFactory.getWebDriver()
		Select aa = new Select(driver.findElement(By.xpath('//*[@id="lst-filter-Analyst"]')))
		aa.selectByIndex(2);
		WebUI.click(search)
	}
}

