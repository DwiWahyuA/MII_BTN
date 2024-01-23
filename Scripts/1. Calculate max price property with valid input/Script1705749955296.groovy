import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import groovy.json.StringEscapeUtils as ExcelKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.btnproperti.co.id/tools/hitung-harga-properti')

WebUI.setText(findTestObject('Object Repository/Page_Hitung Harga Properti Maksimal BTN/input_gaji'), Gaji)

//pemasukan = WebUI.getText(findTestObject('Object Repository/Page_Hitung Harga Properti Maksimal BTN/input_gaji'))
WebUI.takeScreenshot('C:\\\\Katalon\\\\TestCase1\\\\1. Input Pendapatan.png')

WebUI.setText(findTestObject('Object Repository/Page_Hitung Harga Properti Maksimal BTN/input_pengeluaran'), 
    Pengeluaran)

//pengeluaran = WebUI.getText(findTestObject('Object Repository/Page_Hitung Harga Properti Maksimal BTN/input_pengeluaran'))
WebUI.takeScreenshot('C:\\\\Katalon\\\\TestCase1\\\\2. Input Pengeluaran.png')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Hitung Harga Properti Maksimal BTN/select_waktu'), 
    Waktu, true)

waktu = WebUI.getNumberOfSelectedOption(findTestObject('Object Repository/Page_Hitung Harga Properti Maksimal BTN/select_waktu'))

WebUI.takeScreenshot('C:\\\\Katalon\\\\TestCase1\\\\3. Pilih Tahun.png')

WebUI.click(findTestObject('Object Repository/Page_Hitung Harga Properti Maksimal BTN/button_Hitung'))

WebUI.takeScreenshot('C:\\\\Katalon\\\\TestCase1\\\\4. Result.png')

//fungsi untuk mengambil hasil perhitungan dari web
resultOnWeb = WebUI.getText(findTestObject('Page_Hitung Harga Properti Maksimal BTN/result'))

//fungsi untuk menghilangkan simbol Rp
resultTrim = resultOnWeb.replaceAll('[^0-9.]', '')

bil_pemasukan = Double.parseDouble(Gaji)

bil_pengeluaran = Double.parseDouble(Pengeluaran)

bil_waktu = (waktu * 12)

Penghasilan_bersih = (bil_pemasukan - bil_pengeluaran)

Total = ((Penghasilan_bersih * bil_waktu) / 3)

//fungsi untuk melakukan verifikasi antara hasil dari web dengan hasil perhitungan
WebUI.verifyEqual(Result, resultTrim)

