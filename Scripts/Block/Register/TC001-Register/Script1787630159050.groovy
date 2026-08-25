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

WebUI.setText(findTestObject('Object Repository/SignUp_SignIn_Page/Input_Name'), 'testing')

String randomEmail = "raihankemal43$System.currentTimeMillis()@gmail.com"

WebUI.setText(findTestObject('Object Repository/SignUp_SignIn_Page/Input_Email'), randomEmail)

WebUI.click(findTestObject('Object Repository/SignUp_SignIn_Page/button_Signup'))

WebUI.click(findTestObject('Object Repository/SignUp_Page/input_Mr_id_gender1'))

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp_Page/input__password'), 'SmEdr1oCsUuHMptqLZp8Rg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp_Page/select_Day123456789101112131415161718192021_40ab5b'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp_Page/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp_Page/select_Year20212020201920182017201620152014_f874ed'), 
    '2003', true)

WebUI.click(findTestObject('Object Repository/SignUp_Page/input_Date of Birth_newsletter'))

WebUI.click(findTestObject('Object Repository/SignUp_Page/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__first_name'), 'raihan')

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__last_name'), 'kemal')

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input_Company_company'), 'TAK')

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input_(Street address, P.O. Box, Company na_957d3e'), 'Jalan TAK')

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input_Address 2_address2'), 'Jalan TAK 2')

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp_Page/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Canada', true)

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__state'), 'Canadaaa')

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__city'), 'Canadaaaaa')

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__zipcode'), '111111')

WebUI.setText(findTestObject('Object Repository/SignUp_Page/input__mobile_number'), '08589299919')

WebUI.click(findTestObject('Object Repository/SignUp_Page/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Account Created_Page/Verify_Account Created'))

