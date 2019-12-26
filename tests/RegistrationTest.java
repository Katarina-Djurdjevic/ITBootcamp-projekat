package page.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;
import page.objects.PetStoreManu;
import page.objects.Registration;
import page.objects.SignIn;

public class RegistrationTest {
	
	private static void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePage homePage = new HomePage(driver);
		SignIn signIn = new SignIn(driver);
		Registration registration = new Registration(driver);
		PetStoreManu petStoreMenu = new PetStoreManu(driver);

		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i <=20; i++) {
			driver.manage().deleteAllCookies();

			homePage.navigateToPage();
			homePage.enterStore();
			signIn.clickSignIn();
			signIn.clickRegister();

			String url = Registration.URL;
			driver.get(url);
			driver.manage().window().maximize();
			String currUrl = driver.getCurrentUrl();

			assertEquals(url, currUrl);

			if (url.equals(currUrl)) {
				System.out.println("Otvorena je trazena stranica!");
			} else {
				System.out.println("Nije otvorena trazena stranica!");
				System.out.println("Trenutni url je " + currUrl);
			}

			String id = String.valueOf("Random" + Math.random());
			String newPass = ExcelUtils.getDataAt(i, 1);
			String repeatPass = ExcelUtils.getDataAt(i, 1);
			String firstName = ExcelUtils.getDataAt(i, 2);
			String lastName = ExcelUtils.getDataAt(i, 3);
			String mail = ExcelUtils.getDataAt(i, 4);
			String phone = ExcelUtils.getDataAt(i, 5);
			String address1 = ExcelUtils.getDataAt(i, 6);
			String address2 = ExcelUtils.getDataAt(i, 7);
			String city = ExcelUtils.getDataAt(i, 8);
			String state = ExcelUtils.getDataAt(i, 9);
			String zip = Integer.valueOf(Double.valueOf(ExcelUtils.getDataAt(i, 10)).intValue()).toString();
			String country = ExcelUtils.getDataAt(i, 11);
			String language = ExcelUtils.getDataAt(i, 12);
			String favourite = ExcelUtils.getDataAt(i, 13);

			registration.inputUserId(id);
			registration.inputNewPassword(newPass);
			registration.inputRepeatPassword(repeatPass);
			registration.inputFirstName(firstName);
			registration.inputLastName(firstName);
			registration.inputLastName(lastName);
			registration.inputMail(mail);
			registration.inputPhone(phone);
			registration.inputAddress1(address1);
			registration.inputAddress2(address2);
			registration.inputCity(city);
			registration.inputState(state);
			registration.inputZip(zip);
			registration.inputCountry(country);
			registration.inputLanguage(language);
			registration.inpuFavourite(favourite);
			registration.clickEnableList();
			registration.clickEnableBanner();
			
			sleep();
			registration.clickBtnSave();

			assertEquals(petStoreMenu.getBirdsImg().isDisplayed(), true);

			signIn.clickSignIn();
			signIn.inputUsername(id);
			signIn.inputPassword(newPass);
			signIn.clickLogin();

			assertEquals(signIn.getSignOutLink().isDisplayed(), true);
		}
		sleep();
	}

}
