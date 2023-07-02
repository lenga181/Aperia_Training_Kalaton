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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

// Open browse then open URLs
WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com')
WebUI.maximizeWindow()

// Verify the Login page displays with :URL: /auth/login
assert WebUI.getUrl() == "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

// Verify the Form title: Login
WebUI.verifyElementVisible(findTestObject('Page_Login/Title_Login'))

// Verify the Username and password textbox should display
WebUI.verifyElementVisible(findTestObject('Page_Login/txt_userName'))
WebUI.verifyElementVisible(findTestObject('Page_Login/txt_passWord'))

// Verify the button 'Login' should display
WebUI.verifyElementVisible(findTestObject('Page_Login/btn_Login'))

// Click on Login button
WebUI.click(findTestObject('Page_Login/btn_Login'))

// Should display "Required" text at username and password
WebUI.verifyElementText(findTestObject('Page_Login/lbl_UserNameRequired'), 'Required')
WebUI.verifyElementText(findTestObject('Page_Login/lbl_PassWordRequired'), 'Required')

// Close Browser
WebUI.closeBrowser()

