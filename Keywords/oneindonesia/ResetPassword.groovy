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

public class ResetPassword extends BasePageObject{
	private TestObject btnResetPassword
	private TestObject setPassword
	private TestObject setNewPassword
	private TestObject setNewPasswordVal
	private TestObject btnOk
	private TestObject verifySuccessReset
	private TestObject verifyFailedReset
	private TestObject verifyDataEmpty

	public ResetPassword() {
		btnResetPassword = createTestObjectByXpath("btnResetPassword", "//*[@id = 'IdBtnReset']")
		setPassword = createTestObjectByXpath("setPassword", "//*[@id = 'IdPassword']")
		setNewPassword = createTestObjectByXpath("setNewPassword", "//*[@id = 'IdNewPassword']")
		setNewPasswordVal = createTestObjectByXpath("setNewPasswordVal", "//*[@id = 'IdNewPasswordVal']")
		btnOk = createTestObjectByXpath("btnOk", "//*[@id = 'IdBtnOk']")
		verifySuccessReset = createTestObjectByXpath("verifySuccessReset", "//*[@id = 'IdSuccessReset']")
		verifyFailedReset = createTestObjectByXpath("verifyFailedReset", "//*[@id = 'IdFailedReset']")
		verifyDataEmpty = createTestObjectByXpath("verifyDataEmpty", "//*[@id = 'IdDataEmpty']")
	}

	public void ClickBtnResetPassword() {
		WebUI.waitForElementPresent(btnResetPassword, 10)
		WebUI.takeScreenshot()
		WebUI.click(btnResetPassword)
		WebUI.waitForElementPresent(setPassword, 10)
		WebUI.takeScreenshot()
	}

	public void SetTextPassword(dtPassword) {
		WebUI.waitForElementPresent(setPassword, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setPassword, dtPassword)
		WebUI.takeScreenshot()
	}

	public void SetTextNewPassword(dtNewPassword) {
		WebUI.waitForElementPresent(setNewPassword, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setNewPassword, dtNewPassword)
		WebUI.takeScreenshot()
	}

	public void SetTextNewPasswordVal(dtNewPasswordVal) {
		WebUI.waitForElementPresent(setNewPasswordVal, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setNewPasswordVal, dtNewPasswordVal)
		WebUI.takeScreenshot()
	}

	public void ClickBtnOk(dtVerifyReset) {
		WebUI.waitForElementPresent(btnOk, 5)
		WebUI.takeScreenshot()
		WebUI.click(btnOk)
		switch (dtVerifyReset) {
			case "Success Reset" :
				WebUI.waitForElementPresent(verifySuccessReset, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Success Reset')
				break
			case "Failed Reset" :
				WebUI.waitForElementPresent(verifyFailedReset, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Failed Reset')
				break
			case "Data Empty" :
				WebUI.waitForElementPresent(verifyDataEmpty, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Data Empty')
				break
		}
	}
}
