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
import curaHealthcare.Constant
import curaHealthcare.Helper

WebUI.takeScreenshot(Constant.pathCapture+'Login/Landing Page.png')

WebUI.click(findTestObject(Constant.buttonMakeAppointment))

WebUI.waitForElementPresent(findTestObject(Constant.textLoginAppointment), 5)

WebUI.takeScreenshot(Constant.pathCapture+'Login/Login Page.png')

WebUI.setText(findTestObject(Constant.fieldUsername), Constant.dataUsername)

WebUI.setText(findTestObject(Constant.fieldPassword), Constant.dataPassword)

WebUI.takeScreenshot(Constant.pathCapture+'Login/Filled Login Page.png')

WebUI.click(findTestObject(Constant.buttonLogin))

WebUI.waitForElementPresent(findTestObject(Constant.textMakeAppointment), 5)

WebUI.takeScreenshot(Constant.pathCapture+'Login/Login Success.png')