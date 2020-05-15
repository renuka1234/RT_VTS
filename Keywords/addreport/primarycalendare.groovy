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


import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger


public class primarycalendare {
	private TestObject reportlist=findTestObject('Object Repository/ReportList/Date range/reportlist')
	private TestObject filter=findTestObject('Object Repository/ReportList/Date range/Date filter')
	private TestObject search=findTestObject('Object Repository/ReportList/Date range/search')
	@Keyword
	def month1(){
		WebUI.click(reportlist)


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
}











