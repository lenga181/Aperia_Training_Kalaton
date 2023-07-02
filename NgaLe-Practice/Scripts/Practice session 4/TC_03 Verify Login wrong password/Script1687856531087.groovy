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


// Open browse then open URLs
WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
WebUI.maximizeWindow()

// Verify the Login page displays with :URL: /auth/login
assert WebUI.getUrl() == "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

// Input username and password
WebUI.setText(findTestObject('Page_Login/txt_userName'), 'Admin')
WebUI.setText(findTestObject('Page_Login/txt_passWord'), 'admin1234')

//Should input successful
WebUI.verifyElementAttributeValue(findTestObject('Page_login/txt_UserName'), 'value','Admin',1)
WebUI.verifyElementAttributeValue(findTestObject('Page_login/txt_passWord'), 'value','admin1234',1)

// Click Button Login
WebUI.click(findTestObject('Page_Login/btn_Login'))

// Should display "Invalid credentials" text
WebUI.verifyTextPresent("Invalid credentials", false)

// Username/password inputted before should clear
WebUI.verifyElementAttributeValue(findTestObject('Page_login/txt_UserName'), 'value','',1)
WebUI.verifyElementAttributeValue(findTestObject('Page_login/txt_passWord'), 'value','',1)

// Close browser
WebUI.closeBrowser()
