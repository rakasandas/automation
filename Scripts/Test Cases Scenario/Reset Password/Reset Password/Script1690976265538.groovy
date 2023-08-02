import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def testData = TestDataLoader.LoadTestData('ResetPass','C:/Data Binding Katalon/One Indonesia.xlsx')
def dataRow = ExecutionController.getTestCaseData(testData,"Row01")

//Open Browser
WebUI.callTestCase(findTestCase('Test Cases Global/Open Browser'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Btn Reset Password
WebUI.callTestCase(findTestCase('Test Cases Detail/Reset Password/Btn Reset Password'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set Password
WebUI.callTestCase(findTestCase('Test Cases Detail/Reset Password/Set Password'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set New Password
WebUI.callTestCase(findTestCase('Test Cases Detail/Reset Password/Set New Password'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Set New Password Val
WebUI.callTestCase(findTestCase('Test Cases Detail/Reset Password/Set New Password Val'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)

//Btn OK
WebUI.callTestCase(findTestCase('Test Cases Detail/Reset Password/Btn OK'), dataRow, FailureHandling.CONTINUE_ON_FAILURE)
