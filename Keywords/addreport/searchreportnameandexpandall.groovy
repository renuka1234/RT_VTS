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

import internal.GlobalVariable

public class searchreportnameandexpandall {
	private TestObject reportlist=findTestObject('Object Repository/ReportList/reportlistoverall/reportlist')
	private TestObject searchreport=findTestObject('Object Repository/ReportList/reportlistoverall/reportname')
	private TestObject search=findTestObject('Object Repository/ReportList/reportlistoverall/search')
	private TestObject expand =findTestObject('Object Repository/ReportList/reportlistoverall/expandall')
	private TestObject assigned=findTestObject('Object Repository/ReportList/reportlistoverall/clickassigned')
	private TestObject showbackup=findTestObject('Object Repository/ReportList/Backup/showbackup')
	private TestObject backup=findTestObject('Object Repository/ReportList/Backup/backup')

	@Keyword
	def searchrname(){
		WebUI.click(reportlist)
		WebUI.setText(searchreport,'po report')
		WebUI.click(search)
		WebUI.click(assigned)
		WebUI.setText(searchreport,'po report')
		WebUI.click(search)
		WebUI.click(showbackup)
		WebUI.click(backup)
		WebUI.setText(searchreport,'po report')
		WebUI.click(search)
	}
	@Keyword
	def exapndall(){
		WebUI.click(reportlist)
		WebUI.click(expand)
		WebUI.click(assigned)
		WebUI.click(expand)
		WebUI.click(showbackup)
		WebUI.click(backup)
		WebUI.click(expand)
	}
}

