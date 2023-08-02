package oneindonesia

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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import global.BasePageObject

public class RegistEmail extends BasePageObject{
	private TestObject setUsername
	private TestObject setPassword
	private TestObject btnRegister
	private TestObject verifySuccessRegist
	private TestObject verifyFailedRegist
	private TestObject verifyDataEmpty

	public RegistEmail() {
		setUsername = createTestObjectByXpath("setUsername", "//*[@id = 'IdUsername']")
		setPassword = createTestObjectByXpath("setPassword", "//*[@id = 'IdPassword']")
		btnRegister = createTestObjectByXpath("btnRegister", "//*[@id = 'IdBtnRegister']")
		verifySuccessRegist = createTestObjectByXpath("verifySuccessRegist", "//*[@id = 'IdSuccessRegist']")
		verifyFailedRegist = createTestObjectByXpath("verifyFailedRegist", "//*[@id = 'IdFailedRegist']")
		verifyDataEmpty = createTestObjectByXpath("verifyDataEmpty", "//*[@id = 'IdDataEmpty']")
	}

	public void SetTextUsername(dtUsername) {
		WebUI.waitForElementPresent(setUsername, 10)
		WebUI.takeScreenshot()
		WebUI.setText(setUsername, dtUsername)
		WebUI.takeScreenshot()
	}

	public void SetTextPassword(dtPassword) {
		WebUI.waitForElementPresent(setPassword, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setPassword, dtPassword)
		WebUI.takeScreenshot()
	}

	public void ClickBtnRegister(dtVerifyRegister) {
		WebUI.waitForElementPresent(btnRegister, 5)
		WebUI.takeScreenshot()
		WebUI.click(btnRegister)
		switch (dtVerifyRegister) {
			case "Success Register" :
				WebUI.waitForElementPresent(verifySuccessRegist, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Success Register')
				break
			case "Failed Register" :
				WebUI.waitForElementPresent(verifyFailedRegist, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Failed Register')
				break
			case "Data Empty" :
				WebUI.waitForElementPresent(verifyDataEmpty, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Data Empty')
				break
		}
	}
}
