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

Scanner scanner = new Scanner(System.in);
System.out.println("nhập vào vị trí cần tìm: ");
int index = scanner.nextInt();
String[] items_array = ["Java", "C#", "C++", "PyThon", "GoLang", "Swift", "Scartch"];
List<String> item_list = Arrays.asList(items_array);
Boolean vitri=false;

if(index>item_list.size()-1 || index<0)
   {
	   vitri=true;
   }

   if(vitri)
	   {
		   System.out.println("không tìm thấy giá trị nào của vị trí  ["+String.valueOf(index) +"] .");
	   }

	   else {
		   System.out.println("giá trị của["+ index+"] là:"+item_list.get(index-1));
	   }