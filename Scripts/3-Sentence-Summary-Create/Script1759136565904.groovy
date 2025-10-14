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

for (int i = 1; i <=30;i++){

    Mobile.tap(findTestObject('Object Repository/3-sentence summary/com.horcrux.svg.CircleView'), 0)
    Mobile.tap(findTestObject('Object Repository/3-sentence summary/android.widget.TextView -'), 0)
    Mobile.tap(findTestObject('Object Repository/3-sentence summary/android.widget.TextView - Web'), 0)

    String url = "https://www.article" + i + ".com"
    Mobile.sendKeys(findTestObject('Object Repository/3-sentence summary/android.widget.EditText - URL'), url)

    Mobile.tap(findTestObject('Object Repository/3-sentence summary/android.view.ViewGroup'), 0)

    String text = "🥗 健康的な食事とはどのようなものですか？\n\n" +
                  "🥦 なぜ野菜を毎日食べる必要があるのですか？\n\n" +
                  "Article " + i + " 🍚 主食・主菜・副菜のバランスはどう取るべきですか？\n\n" +
                  "🍵 食事の時間帯は健康に影響しますか？\n\n" +
                  "🍣 外食が多いとき、どのように健康を保てますか？"

    Mobile.sendKeys(findTestObject('Object Repository/3-sentence summary/android.widget.EditText -'), text)
    Mobile.tap(findTestObject('Object Repository/3-sentence summary/android.view.ViewGroup (1)'), 0)

    Mobile.delay(3)
}


