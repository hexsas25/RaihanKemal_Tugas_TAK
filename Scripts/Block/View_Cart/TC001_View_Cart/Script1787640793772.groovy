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

WebUI.click(findTestObject('Object Repository/Home_Page/Url_Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart_Page/Field_Shopping Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cart_Page/Url_Proceed To Checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Cart_Page/Field_Item'), 'Item')

WebUI.verifyElementText(findTestObject('Object Repository/Cart_Page/Field_Description'), 'Description')

WebUI.verifyElementText(findTestObject('Object Repository/Cart_Page/Field_Price'), 'Price')

WebUI.verifyElementText(findTestObject('Object Repository/Cart_Page/Field_Quantity'), 'Quantity')

WebUI.verifyElementText(findTestObject('Object Repository/Cart_Page/Field_Total'), 'Total')

