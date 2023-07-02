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

Map<String, String> map = new HashMap()

map.put('Ten', 'Nga')

map.put('Chieu cao', '1.5')

float chieuCao = Float.parseFloat(map.get('Chieu cao'))

System.out.println('Nhập Cân Nặng')

Scanner input = new Scanner(System.in)

float canNang = input.nextFloat()

map.put('Cân Nặng', +(canNang))

float bMI = canNang / (chieuCao * chieuCao)

System.out.println('BMI' + bMI)

System.out.println('Thông tin:' + map)

if (bMI < 16) {
	System.out.println(('BMI = ' + bMI) + ' - Thể trạng của bạn là: gầy cấp độ 3')
} else if ((bMI >= 16) && (bMI < 17)) {
	System.out.println(('BMI = ' + bMI) + ' - Thể trạng của bạn là: gầy cấp độ 2')
} else if ((bMI >= 17) && (bMI < 18.5)) {
	System.out.println(('BMI = ' + bMI) + ' - Thể trạng của bạn là: gầy cấp độ 1')
} else if ((bMI >= 18.5) && (bMI < 25)) {
	System.out.println(('BMI = ' + bMI) + ' - Thể trạng của bạn là: Bình thường')
} else if ((bMI >= 25) && (bMI < 30)) {
	System.out.println(('BMI = ' + bMI) + ' - Thể trạng của bạn là: Thừa cân rồi nha')
} else if ((bMI >= 30) && (bMI < 35)) {
	System.out.println(('BMI = ' + bMI) + ' - Thể trạng của bạn là: béo phì độ 1')
} else if ((bMI >= 35) && (bMI < 40)) {
	System.out.println(('BMI = ' + bMI) + '- Thể trạng của bạn là: béo phì độ 2')
} else {
	System.out.println(('BMI = ' + bMI) + ' - Thể trạng của bạn là: béo phì độ 3')
}