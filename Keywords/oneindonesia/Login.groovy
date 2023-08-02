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

public class Login extends BasePageObject{
	private TestObject setUsername
	private TestObject setPassword
	private TestObject btnLogin
	private TestObject verifySuccessLogin
	private TestObject verifyFailedLogin
	private TestObject verifyDataEmpty
	private TestObject verifyLockedAccount

	public Login() {
		setUsername = createTestObjectByXpath("setUsername", "//*[@id = 'IdUsername']")
		setPassword = createTestObjectByXpath("setPassword", "//*[@id = 'IdPassword']")
		btnLogin = createTestObjectByXpath("btnLogin", "//*[@id = 'IdBtnLogin']")
		verifySuccessLogin = createTestObjectByXpath("verifySuccessLogin", "//*[@id = 'IdSuccessLogin']")
		verifyFailedLogin = createTestObjectByXpath("verifyFailedLogin", "//*[@id = 'IdFailedLogin']")
		verifyDataEmpty = createTestObjectByXpath("verifyDataEmpty", "//*[@id = 'IdDataEmpty']")
		verifyLockedAccount = createTestObjectByXpath("verifyLockedAccount", "//*[@id = 'IdLockedAccount']")
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

	public void ClickBtnLogin(dtVerifyLogin) {
		WebUI.waitForElementPresent(btnLogin, 5)
		WebUI.takeScreenshot()
		WebUI.click(btnLogin)
		switch (dtVerifyLogin) {
			case "Success Register" :
				WebUI.waitForElementPresent(verifySuccessLogin, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Success Login')
				break
			case "Failed Register" :
				WebUI.waitForElementPresent(verifyFailedLogin, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Failed Login')
				break
			case "Data Empty" :
				WebUI.waitForElementPresent(verifyDataEmpty, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Data Empty')
				break
			case "Locked Account" :
				WebUI.waitForElementPresent(verifyLockedAccount, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Locked Account')
				break
		}
	}
}
