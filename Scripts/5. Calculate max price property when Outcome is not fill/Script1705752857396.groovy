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
import com.thoughtworks.selenium.webdriven.commands.GetValue as GetValue
import graphql.execution.ResultPath as ResultPath
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.btnproperti.co.id/tools/hitung-harga-properti')

WebUI.setText(findTestObject('Page_Hitung Harga Properti Maksimal BTN/input_gaji'), Gaji)

WebUI.takeScreenshot('C:\\\\Katalon\\\\TestCase5\\\\1. Input Pemasukan.png')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Hitung Harga Properti Maksimal BTN/select_waktu'), 
    Waktu, true)

WebUI.takeScreenshot('C:\\\\Katalon\\\\TestCase5\\\\2. Pilih Tahun.png')

WebUI.verifyElementNotClickable(findTestObject('Page_Hitung Harga Properti Maksimal BTN/button_Hitung'))

