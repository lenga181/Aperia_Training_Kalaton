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
import com.sun.org.apache.bcel.internal.generic.RETURN

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Open browse then open URLs: https://opensource-demo.orangehrmlive.com
WebUI.openBrowser('')
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com')
WebUI.maximizeWindow()

// Verify the Login page displays with :URL: /auth/login
assert WebUI.getUrl() == 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'
index = WebUI.getWindowIndex()

//Click 'Click  link 'OrangeHRM, Inc.''
WebUI.click(findTestObject('Page_login/link_OrangeHRM'))

// Verify user refirect to HRM page:URL: orangehrm.com
WebUI.switchToWindowIndex(index+1)
assert WebUI.getUrl() == 'https://www.orangehrm.com/'

// Verify Title contains text: OrangeHRM Software
title_text = WebUI.getWindowTitle()
WebUI.verifyEqual(title_text.contains('OrangeHRM HR Software'),true)

// Close browser
WebUI.closeBrowser()