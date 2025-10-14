import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.meiji.sp')

//Mobile.startApplication('C:\\Users\\User\\Downloads\\application-dbcc7fba-38af-4ce4-b336-02c15feb2ed7.apk', true)

Mobile.scrollToText('Article1')

Mobile.scrollToText('Article2')

Mobile.tap(findTestObject('Object Repository/Summary-like/com.horcrux.svg.PathView'), 0)

Mobile.scrollToText('Article3')

Mobile.tap(findTestObject('Object Repository/Summary-like/com.horcrux.svg.PathView (1)'), 0)

Mobile.scrollToText('Article4')

Mobile.tap(findTestObject('Object Repository/Summary-like/com.horcrux.svg.PathView (2)'), 0)

Mobile.closeApplication()

