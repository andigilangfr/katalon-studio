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

/*
 * GET CURRENT DATE
 */

WebUI.takeScreenshot(Constant.pathCapture+'Appointment/Make Appointment Page.png')

Helper newHelper = new Helper()
newHelper.CurrentDate()

/*
 * FILL
 */

WebUI.check(findTestObject(Constant.checkboxReadSubmission))

WebUI.setText(findTestObject(Constant.fieldDate), GlobalVariable.days + '/' + GlobalVariable.months + '/' + GlobalVariable.years)

WebUI.setText(findTestObject(Constant.fieldComment), 'COMMENT')

WebUI.takeScreenshot(Constant.pathCapture+'Appointment/Filled Appointment.png')

WebUI.click(findTestObject(Constant.buttonBookAppointment))

/*
 * VERIFY AND WRITE INTO EXCEL
 */

if (WebUI.verifyElementPresent(findTestObject(Constant.textAppoinmentConfirmation), 5, FailureHandling.OPTIONAL)) {
	newHelper.demoKey('PASSED')
} else {
	newHelper.demoKey('FAILED')
}


WebUI.takeScreenshot(Constant.pathCapture+'Appointment/Confirmation Appointment.png')