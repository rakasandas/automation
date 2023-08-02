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

public class RegisteredUser extends BasePageObject{
	private TestObject setComment
	private TestObject btnPostComment
	private TestObject verifySuccessPostComment
	private TestObject btnFollowingContent
	private TestObject verifySuccessFollCont


	public RegisteredUser() {
		setComment = createTestObjectByXpath("setComment", "//*[@id = 'IdTxtAddKonten']")
		btnPostComment = createTestObjectByXpath("btnPostComment", "//*[@id = 'IdJudulKonten']")
		verifySuccessPostComment = createTestObjectByXpath("verifySuccessPostComment", "//*[@id = 'IdDescKonten']")
		btnFollowingContent = createTestObjectByXpath("btnFollowingContent", "//*[@id = 'IdBtnAddKonten']")
		verifySuccessFollCont = createTestObjectByXpath("verifySuccessFollCont", "//*[@id = 'IdBtnEditKonten']")
	}

	public void SetTextComment(dtComment) {
		WebUI.waitForElementPresent(setComment, 10)
		WebUI.takeScreenshot()
		WebUI.setText(setComment, dtComment)
		WebUI.takeScreenshot()
	}

	public void ClickBtnPostComment() {
		WebUI.waitForElementPresent(btnPostComment, 10)
		WebUI.takeScreenshot()
		WebUI.click(btnPostComment)
		WebUI.waitForElementPresent(verifySuccessPostComment, 10)
		WebUI.takeScreenshot()
	}

	public void ClickBtnFollowingContent() {
		WebUI.waitForElementPresent(btnFollowingContent, 10)
		WebUI.takeScreenshot()
		WebUI.click(btnFollowingContent)
		WebUI.waitForElementPresent(verifySuccessFollCont, 10)
		WebUI.takeScreenshot()
	}
}
