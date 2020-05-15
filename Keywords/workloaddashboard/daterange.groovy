package workloaddashboard

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

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

import org.openqa.selenium.WebDriver


import internal.GlobalVariable

public class daterange {
	private TestObject workload=findTestObject('Object Repository/workload dashboard/workload')
	private TestObject search=findTestObject('Object Repository/workload dashboard/search')
	private TestObject ltext1=findTestObject('Object Repository/workload dashboard/live reports/text')
	private TestObject ltext2=findTestObject('Object Repository/workload dashboard/live reports/text2')
	private TestObject ttext1 =findTestObject('Object Repository/workload dashboard/Terminated reports/text1')
	private TestObject ttext2=findTestObject('Object Repository/workload dashboard/Terminated reports/Text2')
	private TestObject wtext1=findTestObject('Object Repository/workload dashboard/workloadlist/text1')
	private TestObject wtext2=findTestObject('Object Repository/workload dashboard/workloadlist/text2')
	private TestObject atext1=findTestObject('Object Repository/workload dashboard/Analyst Interaction/text1')
	private TestObject atext2=findTestObject('Object Repository/workload dashboard/Analyst Interaction/text2')
	private TestObject export=findTestObject('Object Repository/workload dashboard/Analyst Interaction/export')


	@Keyword
	def dr(){

		WebUI.click(workload)


		for (int i=1;i<=7;i++) {
			WebDriver driver = DriverFactory.getWebDriver()
			KeywordLogger log = new KeywordLogger()

			driver.findElement(By.xpath('//*[@id="date-filter"]')).click();

			WebElement field1 = driver.findElement(By.xpath("/html/body/div/div[1]/ul/li["+i+"]"))
			Thread.sleep(3000);
			String date=field1.getText();
			log.logInfo( date);
			field1.click()
		}
	}
	@Keyword
	def livereports(){
		WebUI.click(workload)
		WebUI.verifyElementPresent(ltext1, 0)
		WebUI.verifyElementPresent(ltext2, 0)
	}
	@Keyword
	def terminatedreports(){
		WebUI.click(workload)
		WebUI.verifyElementPresent(wtext1,0 )
		WebUI.verifyElementPresent(wtext2, 0)
	}
	@Keyword
	def workloadlist(){
		WebUI.click(workload)
		WebUI.click(wtext1)
		WebUI.click(wtext2)
	}
	@Keyword
	def analystreport1(){
		WebUI.click(workload)
		WebUI.click(atext1)
		WebUI.click(atext2)
		WebUI.click(export)
	}
}
