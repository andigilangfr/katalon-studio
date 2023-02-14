package curaHealthcare

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

public class Constant {

	public static final String pathCapture=GlobalVariable.path+'//'
	
	/*
	 * Test Data
	 */

	public static final String dataUsername = findTestData('Data Files/Login_Test_Data/Login').getValue(1, 1)

	public static final String dataPassword = findTestData('Data Files/Login_Test_Data/Login').getValue(2, 1)


	/*
	 * Object Confirm Appointment Page
	 */

	public static final String textAppoinmentConfirmation= 'Object Repository/Confirm_Appointment_Page/textAppointmentConfirmation'

	/*
	 * Object Dashboard Page
	 */

	public static final String buttonBookAppointment = 'Object Repository/Dashboard_Page/buttonBookAppointment'

	public static final String checkboxReadSubmission = 'Object Repository/Dashboard_Page/checkboxReadSubmission'

	public static final String fieldComment = 'Object Repository/Dashboard_Page/fieldComment'

	public static final String fieldDate = 'Object Repository/Dashboard_Page/fieldDate'

	public static final String textMakeAppointment = 'Object Repository/Dashboard_Page/textMakeAppointment'

	/*
	 * Object Confirm Appointment Page
	 */

	public static final String buttonMakeAppointment = 'Object Repository/Landing_Page/buttonMakeAppointment'

	/*
	 * Object Landing Page
	 */

	public static final String buttonLogin = 'Object Repository/Login_Page/buttonLogin'

	public static final String fieldPassword = 'Object Repository/Login_Page/fieldPassword'

	public static final String fieldUsername = 'Object Repository/Login_Page/fieldUsername'

	public static final String textLoginAppointment = 'Object Repository/Login_Page/textLoginAppointment'
}
