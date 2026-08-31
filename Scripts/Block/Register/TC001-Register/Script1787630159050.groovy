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

WebUI.click(findTestObject('Home_Page/Url_Signup Login'))

WebUI.setText(findTestObject('Object Repository/SignUp_SignIn_Page/Input_Name'), RegisterName)

String randomEmail = "raihankemal43${System.currentTimeMillis()}@gmail.com"

WebUI.setText(findTestObject('Object Repository/SignUp_SignIn_Page/Input_Email'), randomEmail)

WebUI.click(findTestObject('Object Repository/SignUp_SignIn_Page/button_Signup'))

WebUI.click(findTestObject('Object Repository/SignUp_Page/input_Mr_id_gender1'))

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp_Page/input__password'), 'SmEdr1oCsUuHMptqLZp8Rg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp_Page/select_dropdownDayOfBirth'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp_Page/select_dropdownMonthOfBirth'), '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp_Page/select_dropdownYearOfBirth'), '2003', true)

//WebUI.click(findTestObject('Object Repository/SignUp_Page/checkbox_Newsletter'))

// User melakukan uncheck SignUp Newsletter
if (checkbox_Newsletter == true ) {
	WebUI.check(findTestObject('Object Repository/SignUp_Page/checkbox_Newsletter'))
} else {
	WebUI.uncheck(findTestObject('Object Repository/SignUp_Page/checkbox_Newsletter'))
}

//WebUI.click(findTestObject('Object Repository/SignUp_Page/checkbox_SpecialOffer'))

// User melakukan check Special Offer
if (checkbox_SpecialOffer == true ) {
	WebUI.check(findTestObject('Object Repository/SignUp_Page/checkbox_SpecialOffer'))
} else {
	WebUI.uncheck(findTestObject('Object Repository/SignUp_Page/checkbox_SpecialOffer'))
}

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__firstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__lastName'), LastName)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input_Company'), Company)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input_StreetAddress'), StreetAddress)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input_StreetAdress2'), StreetAddress2)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp_Page/select_dropdownCountry'), Country, true)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__state'), State)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__city'), City)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__zipcode'), ZipCode)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__mobileNumber'), MobileNumber)

WebUI.click(findTestObject('Object Repository/SignUp_Page/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account Created_Page/Verify_Account Created'))

