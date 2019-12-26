package page.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;
import page.objects.HomePage;
import page.objects.PetStoreManu;
import page.objects.Registration;
import page.objects.SignIn;

public class PageTests {
	
	private void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
	}
	
	WebDriver driver;
	HomePage homePage;
	Registration registration;
	SignIn signIn;
	PetStoreManu petStoreMenu;

	@BeforeSuite()
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		signIn = new SignIn(driver);
		registration = new Registration(driver);
		petStoreMenu = new PetStoreManu(driver);
	}

	@AfterSuite()
	public void close() {
		driver.close();
	}

	@BeforeMethod()
	public void clearCookies() {
		driver.manage().deleteAllCookies();
	}

	//test za ulazak na homepage
	@Test
	public void testEnterStore() {
		homePage.openPage();
		homePage.enterStore();

		assertEquals(petStoreMenu.getBirdsImg().isDisplayed(), true);
		sleep();
	}

	//test za logovanje
	@Test
	public void testSignin() {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);
		String id = Integer.valueOf(Double.valueOf(ExcelUtils.getDataAt(1, 0)).intValue()).toString();
		String pass = ExcelUtils.getDataAt(1, 1);

		homePage.openPage();
		homePage.enterStore();
		signIn.clickSignIn();
		signIn.inputUsername(id);
		signIn.inputPassword(pass);
		signIn.clickLogin();

		assertEquals(signIn.getSignOutLink().isDisplayed(), true);

		sleep();
	}

	//test za menjanje podataka logovanog korisnika
	@Test()
	public void testChange() {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);
		String id = Integer.valueOf(Double.valueOf(ExcelUtils.getDataAt(1, 0)).intValue()).toString();
		String pass = ExcelUtils.getDataAt(1, 1);

		homePage.openPage();
		homePage.enterStore();
		signIn.clickSignIn();
		signIn.inputUsername(id);
		signIn.inputPassword(pass);
		signIn.clickLogin();

		assertEquals(signIn.getSignOutLink().isDisplayed(), true);

		signIn.clickMyAccount();

		String newPass = ExcelUtils.getDataAt(2, 1);
		String repeatPass = ExcelUtils.getDataAt(2, 1);
		String firstName = ExcelUtils.getDataAt(2, 2);
		String lastName = ExcelUtils.getDataAt(2, 3);
		String mail = ExcelUtils.getDataAt(2, 4);
		String phone = ExcelUtils.getDataAt(2, 5);
		String address1 = ExcelUtils.getDataAt(2, 6);
		String address2 = ExcelUtils.getDataAt(2, 7);
		String city = ExcelUtils.getDataAt(2, 8);
		String state = ExcelUtils.getDataAt(2, 9);
		String zip = Integer.valueOf(Double.valueOf(ExcelUtils.getDataAt(2, 10)).intValue()).toString();
		String country = ExcelUtils.getDataAt(2, 11);

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
		registration.clickEnableList();
		registration.clickEnableBanner();
		
		registration.clickBtnEdit();

		driver.manage().deleteAllCookies();

		homePage.openPage();
		homePage.enterStore();
		signIn.clickSignIn();
		signIn.inputUsername(id);
		signIn.inputPassword(newPass);
		signIn.clickLogin();

		assertEquals(signIn.getSignOutLink().isDisplayed(), true);

		sleep();
	}

	//test menija na homepage-u
	@Test
	public void testMenu() {
		homePage.openPage();
		homePage.enterStore();
		petStoreMenu.clickBirdsImg();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Birds");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickBirds2Img();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Birds");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickBirdsSide();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Birds");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickBirdsTop();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Birds");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickCatsImg();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Cats");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickCatsSide();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Cats");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickCatsTop();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Cats");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickDogsImg();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Dogs");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickDogsSide();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Dogs");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickDogsTop();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Dogs");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickFishImg();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Fish");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickFishSide();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Fish");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickFishTop();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Fish");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickReptilesImg();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Reptiles");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickReptilesSide();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Reptiles");
		sleep();
		homePage.navigateToPage();
		homePage.enterStore();
		petStoreMenu.clickReptilesTop();
		assertEquals(petStoreMenu.getCatalogTitle().getText(), "Reptiles");
		sleep();
	}

	//test registrovanje novog korisnika
	@Test
	public void testRegistration() {
		ExcelUtils.setExcell("UserRandomData.xlsx");
		ExcelUtils.setWorkSheet(0);

		homePage.navigateToPage();
		homePage.enterStore();
		signIn.clickSignIn();
		signIn.clickRegister();

		String url = Registration.URL;
		driver.get(url);
		String currUrl = driver.getCurrentUrl();

		assertEquals(url, currUrl);

		if (url.equals(currUrl)) {
			System.out.println("Otvorena je trazena stranica!");
		} else {
			System.out.println("Nije otvorena trazena stranica!");
			System.out.println("Trenutni url je " + currUrl);
		}
		sleep();

		String id = "Random" + Math.random();
		String newPass = ExcelUtils.getDataAt(1, 1);
		String repeatPass = ExcelUtils.getDataAt(1, 1);
		String firstName = ExcelUtils.getDataAt(1, 2);
		String lastName = ExcelUtils.getDataAt(1, 3);
		String mail = ExcelUtils.getDataAt(1, 4);
		String phone = ExcelUtils.getDataAt(1, 5);
		String address1 = ExcelUtils.getDataAt(1, 6);
		String address2 = ExcelUtils.getDataAt(1, 7);
		String city = ExcelUtils.getDataAt(1, 8);
		String state = ExcelUtils.getDataAt(1, 9);
		String zip = Integer.valueOf(Double.valueOf(ExcelUtils.getDataAt(1, 10)).intValue()).toString();
		String country = ExcelUtils.getDataAt(1, 11);
		String language = ExcelUtils.getDataAt(1, 12);
		String favourite = ExcelUtils.getDataAt(1, 13);

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
		registration.clickBtnSave();

		assertEquals(petStoreMenu.getBirdsImg().isDisplayed(), true);

		signIn.clickSignIn();
		signIn.inputUsername(id);
		signIn.inputPassword(newPass);
		signIn.clickLogin();

		assertEquals(signIn.getSignOutLink().isDisplayed(), true);
		sleep();
	}
	
	//test ubacivanje zeljene zivotinje u korpu
	@Test()
	public void testCart() {
		homePage.openPage();
		homePage.enterStore();
		petStoreMenu.clickBirdsImg();
		petStoreMenu.clickFirstBird();
		petStoreMenu.clickAddToCartBtn();

		assertEquals(petStoreMenu.getProductId().getText(), "AV-CB-01");
		sleep();
	}

	
}
