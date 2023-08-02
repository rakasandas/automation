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

public class VerifyEmail extends BasePageObject{
	private TestObject verifyEmail
	private TestObject hyperlinkVerify
	private TestObject verifySuccessVerif

	public VerifyEmail() {
		verifyEmail = createTestObjectByXpath("verifyEmail", "//*[@id = 'IdVerifyEmail']")
		hyperlinkVerify = createTestObjectByXpath("hyperlinkVerify", "//*[@id = 'IdHyperLinkVerify']")
		verifySuccessVerif = createTestObjectByXpath("verifySuccessVerif", "//*[@id = 'IdVerifySuccessVerif']")
	}

	public void VerifyEmailPage() {
		WebUI.waitForElementPresent(verifyEmail, 10)
		WebUI.takeScreenshot()
	}

	public void ClickHyperlinkVerify() {
		WebUI.waitForElementPresent(hyperlinkVerify, 5)
		WebUI.takeScreenshot()
		WebUI.click(hyperlinkVerify)
		WebUI.waitForElementPresent(verifySuccessVerif, 5)
		WebUI.takeScreenshot()
	}
}
