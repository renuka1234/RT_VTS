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

public class Retaildashboard {
	private TestObject reportlist=findTestObject('Object Repository/ReportList/reportlistoverall/reportlist')
	private TestObject search=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/search vendor')
	private TestObject clickanalyst=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/clickanalyst')
	private TestObject clickvendor=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/clickvendor')
	private TestObject clickstatus=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/clickstatus')
	private TestObject clickcomplete=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/clickcomplete')
	private TestObject clicknotes=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/click notes')
	private TestObject textnotes=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/textnotes')
	private TestObject savenotes=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/savenotes')
	private TestObject daterange=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/daterange')
	private TestObject date=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/date')
	private TestObject clickexceldart=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/clickexceldart')
	private TestObject excelnotes=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/excelnotes')
	private TestObject exceltext=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/excel text')
	private TestObject excelsave=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/excelsave')
	private TestObject analystclick=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/analystclick')
	private TestObject clickstarttime=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/clickstarttime')
	private TestObject starttime=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/starttime')
	private TestObject clickendtime=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/clickendtime')
	private TestObject end1=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/end1')
	private TestObject end2=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/end2')
	private TestObject subject=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/subject')
	private TestObject analystnotes1=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/analystnotes1')
	private TestObject analystsave=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/analystsave')
	private TestObject addnotes=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/addnotes')
	private TestObject datesearch=findTestObject('Object Repository/ReportList/Retail,excel,and analyst intraction/datesearch')
	@Keyword
	def retail(){
		WebUI.click(reportlist)
		WebDriver driver = DriverFactory.getWebDriver()
		Select cu = new Select(driver.findElement(By.xpath('//*[@id="flt-vendor"]')))
		cu.selectByValue("3210886");
		WebUI.click(search)
		WebUI.click(clickanalyst)
		WebUI.click(clickvendor)
		WebUI.click(clickstatus)
		WebUI.click(clickcomplete)
		WebUI.click(clicknotes)
		WebUI.setText(textnotes,'newnotes')
		WebUI.click(savenotes)
	}
	@Keyword
	def excel(){
		WebUI.click(reportlist)
		WebUI.click(daterange)
		WebUI.click(date)
		WebUI.click(datesearch)
		WebDriver driver = DriverFactory.getWebDriver()
		Select cu = new Select(driver.findElement(By.xpath('//*[@id="flt-vendor"]')))
		cu.selectByValue("3210886");
		WebUI.click(search)
		WebUI.click(clickanalyst)
		WebUI.click(clickvendor)
		WebUI.click(clickexceldart)
		WebUI.click(excelnotes)
		WebUI.setText(exceltext,'newexcel')
		WebUI.click(excelsave)
	}
	@Keyword
	def analyst(){
		WebUI.click(reportlist)
		WebDriver driver = DriverFactory.getWebDriver()
		Select cu = new Select(driver.findElement(By.xpath('//*[@id="flt-vendor"]')))
		cu.selectByValue("3210886");
		WebUI.click(search)
		WebUI.click(clickanalyst)
		WebUI.click(clickvendor)
		WebUI.click(analystclick)
		WebUI.click(addnotes)
		WebUI.click(clickstarttime)
		WebUI.click(starttime)
		WebUI.click(clickendtime)
		WebUI.click(end1)
		WebUI.click(end2)
		Select re = new Select(driver.findElement(By.xpath('//*[@id="slt-retailer"]')))
		re.selectByValue("3110006");
		Select nt = new Select(driver.findElement(By.xpath('//*[@id="slt-interaction"]')))
		nt.selectByValue("331100502");
		WebUI.setText(subject, 'newsubject')
		WebUI.setText(analystnotes1,'notes123')
		WebUI.click(analystsave)
	}
}