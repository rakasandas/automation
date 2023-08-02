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

public class Administrator extends BasePageObject{
	private TestObject txtAddKonten
	private TestObject setJudulKonten
	private TestObject setDescKonten
	private TestObject btnAddKonten
	private TestObject btnEditKonten
	private TestObject setEditJudul
	private TestObject verifySuccessAddKonten
	private TestObject verifyDataEmpty
	private TestObject btnDeleteKonten
	private TestObject btnYesDeleteKonten
	private TestObject btnNoDeleteKonten
	private TestObject verifySuccessDelete

	public Administrator() {
		txtAddKonten = createTestObjectByXpath("txtAddKonten", "//*[@id = 'IdTxtAddKonten']")
		setJudulKonten = createTestObjectByXpath("setJudulKonten", "//*[@id = 'IdJudulKonten']")
		setDescKonten = createTestObjectByXpath("setDescKonten", "//*[@id = 'IdDescKonten']")
		btnAddKonten = createTestObjectByXpath("btnAddKonten", "//*[@id = 'IdBtnAddKonten']")
		btnEditKonten = createTestObjectByXpath("btnEditKonten", "//*[@id = 'IdBtnEditKonten']")
		setEditJudul = createTestObjectByXpath("setEditJudul", "//*[@id = 'IdEditJudul']")
		verifySuccessAddKonten = createTestObjectByXpath("verifySuccessAddKonten", "//*[@id = 'IdSuccessAddKonten']")
		verifyDataEmpty = createTestObjectByXpath("verifyDataEmpty", "//*[@id = 'IdDataEmpty']")
		btnDeleteKonten = createTestObjectByXpath("btnDeleteKonten", "//*[@id = 'IdBtnDeleteKonten']")
		btnYesDeleteKonten = createTestObjectByXpath("btnYesDeleteKonten", "//*[@id = 'IdBtnYesDeleteKonten']")
		btnNoDeleteKonten = createTestObjectByXpath("btnDebtnNoDeleteKontenleteKonten", "//*[@id = 'IdBtnNoDeleteKonten']")
		verifySuccessDelete = createTestObjectByXpath("verifyDataEmpty", "//*[@id = 'verifySuccessDelete']")
	}

	public void ClickTxtAddKonten() {
		WebUI.waitForElementPresent(txtAddKonten, 10)
		WebUI.takeScreenshot()
		WebUI.click(txtAddKonten)
		WebUI.waitForElementPresent(setJudulKonten, 10)
		WebUI.takeScreenshot()
	}

	public void SetJudulKonten(dtJudulKonten) {
		WebUI.waitForElementPresent(setJudulKonten, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setJudulKonten, dtJudulKonten)
		WebUI.takeScreenshot()
	}

	public void SetDescKonten(dtDescKonten) {
		WebUI.waitForElementPresent(setDescKonten, 5)
		WebUI.takeScreenshot()
		WebUI.setText(setDescKonten, dtDescKonten)
		WebUI.takeScreenshot()
	}

	public void ClickBtnEditKonten() {
		WebUI.waitForElementPresent(btnEditKonten, 10)
		WebUI.takeScreenshot()
		WebUI.click(btnEditKonten)
		WebUI.waitForElementPresent(setEditJudul, 10)
		WebUI.takeScreenshot()
	}

	public void ClickBtnAddKonten(dtVerifyAddKonten) {
		WebUI.waitForElementPresent(btnAddKonten, 5)
		WebUI.takeScreenshot()
		WebUI.click(btnAddKonten)
		switch (dtVerifyAddKonten) {
			case "Success Add Konten" :
				WebUI.waitForElementPresent(verifySuccessAddKonten, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Success Add Konten')
				break
			case "Data Empty" :
				WebUI.waitForElementPresent(verifyDataEmpty, 10)
				WebUI.takeScreenshot()
				KeywordUtil.logInfo('Data Empty')
				break
		}
	}

	public void ClickBtnDeleteKonten(dtDeleteKonten) {
		WebUI.waitForElementPresent(btnDeleteKonten, 10)
		WebUI.takeScreenshot()
		WebUI.click(btnDeleteKonten)
		switch (dtDeleteKonten) {
			case "Yes" :
				WebUI.waitForElementPresent(btnYesDeleteKonten, 10)
				WebUI.takeScreenshot()
				WebUI.click(btnYesDeleteKonten)
				WebUI.waitForElementPresent(verifySuccessDelete, 10)
				WebUI.takeScreenshot()
				break
			case "No" :
				WebUI.waitForElementPresent(btnNoDeleteKonten, 10)
				WebUI.takeScreenshot()
				WebUI.click(btnNoDeleteKonten)
				WebUI.waitForElementPresent(btnDeleteKonten, 10)
				WebUI.takeScreenshot()
				break
		}
	}
}
