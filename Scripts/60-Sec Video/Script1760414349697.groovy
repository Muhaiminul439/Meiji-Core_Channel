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

Mobile.startExistingApplication('com.meiji.sp')

Mobile.delay(3)

for (int i = 1; i <= 30; i++) 
	{ 
    
    Mobile.tap(findTestObject('Object Repository/60-sec video/com.horcrux.svg.PathView'), 0)
    Mobile.tap(findTestObject('Object Repository/60-sec video/android.widget.TextView -'), 0)
    Mobile.tap(findTestObject('Object Repository/60-sec video/android.view.ViewGroup'), 0)
    Mobile.tap(findTestObject('Object Repository/60-sec video/android.widget.TextView - (1)'), 0)
    Mobile.tap(findTestObject('Object Repository/60-sec video/android.view.ViewGroup (1)'), 0)
    Mobile.tap(findTestObject('Object Repository/60-sec video/android.view.View'), 0)
    
    Mobile.delay(5) 
    Mobile.sendKeys(findTestObject('Object Repository/60-sec video/android.widget.EditText -'), 'Video-' + i)
    
    Mobile.tap(findTestObject('Object Repository/60-sec video/android.widget.TextView - (2)'), 0)
    
    Mobile.delay(3) 
}


