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

//Open browse then open URLs	
//url: https://opensource-demo.orangehrmlive.com	
WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com')
WebUI.maximizeWindow()

// Verify the Login page displays with :URL: /auth/login
assert WebUI.getUrl() == "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

//Click 'Forgot your password'	
WebUI.click(findTestObject('Page_login/link_ForgotPassword'))

//"Should refirect to reset password page
//- URL: /auth/requestPasswordResetCode"
assert WebUI.getUrl() == "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode"

//Verify button 'Cancel'Should enable
WebUI.verifyElementClickable(findTestObject('Page_ResetPassword/btn_Cancel'))

//Verify button 'Reset Password'Should enable
WebUI.verifyElementClickable(findTestObject('Page_ResetPassword/btn_ResetPassword'))

//Click Button 'Cancel"		
WebUI.click(findTestObject('Page_ResetPassword/btn_Cancel'))

// Should display login page
assert WebUI.getUrl() == "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

// Close browser
WebUI.closeBrowser()