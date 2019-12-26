package page.objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	private WebDriver driver;
	
	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	private static final String USERID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String NEWPASSWORD_XPATH = "//input[@name='password']";
	private static final String REPEATPASSWORD_XPATH = "//input[@name='repeatedPassword']";
	private static final String FIRSTNAME_XPATH = "//input[@name='account.firstName']";
	private static final String LASTNAME_XPATH = "//input[@name='account.lastName']";
	private static final String MAIL_XPATH = "//input[@name='account.email']";
	private static final String PHONE_XPATH = "//input[@name='account.phone']";
	private static final String ADDRESS1_XPATH = "//input[@name='account.address1']";
	private static final String ADDRESS2_XPATH = "//input[@name='account.address2']";
	private static final String CITY_XPATH = "//input[@name='account.city']";
	private static final String STATE_XPATH = "//input[@name='account.state']";
	private static final String ZIP_XPATH = "//input[@name='account.zip']";
	private static final String COUNTRY_XPATH = "//input[@name='account.country']";
	private static final String LANGUAGE_XPATH = "//select[@name='account.languagePreference']";
	private static final String FAVOURITE_CATEGORY_XPATH = "//select[@name='account.favouriteCategoryId']";
	private static final String ENABLE_MY_LIST = "//input[@name='account.listOption']";
	private static final String ENABLE_MY_BANNER = "//input[@name='account.bannerOption']";
	private static final String BTNSAVE_XPATH = "//input[@name='newAccount']";
	private static final String BTNEDIT_XPATH = "//input[@name='editAccount']";
	
	public Registration(WebDriver wd) {
		driver = wd;
	}

	
	public WebElement getUserId() {
		return driver.findElement(By.xpath(USERID_XPATH));
	}
	
	public void clickUserId() {
		getUserId().click();
	}
	
	public void inputUserId(String name) {
		getUserId().clear();
		getUserId().sendKeys(name);
	}
	
	public WebElement getNewPassword() {
		return driver.findElement(By.xpath(NEWPASSWORD_XPATH));
	}
	
	public void clickNewPassword() {
		getNewPassword().click();
	}
	
	public void inputNewPassword(String name) {
		getNewPassword().clear();
		getNewPassword().sendKeys(name);
	}
	
	public WebElement getRepeatPassword() {
		return driver.findElement(By.xpath(REPEATPASSWORD_XPATH));
	}
	
	public void clickRepeatPassword() {
		getRepeatPassword().click();
	}
	
	public void inputRepeatPassword(String name) {
		getRepeatPassword().clear();
		getRepeatPassword().sendKeys(name);
	}
	
	public WebElement getFirstName() {
		return driver.findElement(By.xpath(FIRSTNAME_XPATH));
	}
	
	public void clickFirstName() {
		getFirstName().click();
	}

	public void inputFirstName(String name) {
		getFirstName().clear();
		getFirstName().sendKeys(name);
	}

	public WebElement getLastName() {
		return driver.findElement(By.xpath(LASTNAME_XPATH));
	}

	public void clickLastName() {
		getLastName().click();
	}

	public void inputLastName(String name) {
		getLastName().clear();
		getLastName().sendKeys(name);
	}
	
	public WebElement getMail() {
		return driver.findElement(By.xpath(MAIL_XPATH));
	}
	
	public void clickMail() {
		getMail().click();
	}

	public void inputMail(String name) {
		getMail().clear();
		getMail().sendKeys(name);
	}
	
	public WebElement getPhone() {
		return driver.findElement(By.xpath(PHONE_XPATH));
	}
	
	public void clickPhone() {
		getPhone().click();
	}

	public void inputPhone(String name) {
		getPhone().clear();
		getPhone().sendKeys(name);
	}
	
	public WebElement getAddress1() {
		return driver.findElement(By.xpath(ADDRESS1_XPATH));
	}
	
	public void clickAddress1() {
		getAddress1().click();
	}

	public void inputAddress1(String name) {
		getAddress1().clear();
		getAddress1().sendKeys(name);
	}
	
	public WebElement getAddress2() {
		return driver.findElement(By.xpath(ADDRESS2_XPATH));
	}
	
	public void clickAddress2() {
		getAddress2().click();
	}

	public void inputAddress2(String name) {
		getAddress2().clear();
		getAddress2().sendKeys(name);
	}
	
	public WebElement getCity() {
		return driver.findElement(By.xpath(CITY_XPATH));
	}
	
	public void clickCity() {
		getCity().click();
	}

	public void inputCity(String name) {
		getCity().clear();
		getCity().sendKeys(name);
	}
	
	public WebElement getState() {
		return driver.findElement(By.xpath(STATE_XPATH));
	}
	
	public void clickState() {
		getState().click();
	}

	public void inputState(String name) {
		getState().clear();
		getState().sendKeys(name);
	}
	
	public WebElement getZip() {
		return driver.findElement(By.xpath(ZIP_XPATH));
	}
	
	public void clicZip() {
		getZip().click();
	}

	public void inputZip(String name) {
		getZip().clear();
		getZip().sendKeys(name);
	}
	
	public WebElement getCountry() {
		return driver.findElement(By.xpath(COUNTRY_XPATH));
	}
	
	public void clickCountry() {
		getCountry().click();
	}

	public void inputCountry(String name) {
		getCountry().clear();
		getCountry().sendKeys(name);
	}
	
	public Select getLanguage() {
		return new Select(driver.findElement(By.xpath(LANGUAGE_XPATH)));
	}
	
	public void inputLanguage(String data) {
		getLanguage().selectByVisibleText(data);
	}
	
	public Select getFavourite() {
		return new Select(driver.findElement(By.xpath(FAVOURITE_CATEGORY_XPATH)));
	}
	
	public void inpuFavourite(String data) {
		getFavourite().selectByVisibleText(data);
	}
	
	public WebElement getEnableList() {
		return driver.findElement(By.xpath(ENABLE_MY_LIST));
	}
	
	public void clickEnableList() {
		getEnableList().click();
	}
	
	public WebElement getEnableBanner() {
		return driver.findElement(By.xpath(ENABLE_MY_BANNER));
	}
	
	public void clickEnableBanner() {
		getEnableBanner().click();
	}
	
	public WebElement getBtnSave() {
		return driver.findElement(By.xpath(BTNSAVE_XPATH));
	}

	public void clickBtnSave() {
		getBtnSave().click();
	}
	
	public WebElement getBtnEdit() {
		return driver.findElement(By.xpath(BTNEDIT_XPATH));
	}

	public void clickBtnEdit() {
		getBtnEdit().click();
	}

}
