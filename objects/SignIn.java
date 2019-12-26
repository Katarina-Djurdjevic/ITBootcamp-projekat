package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	WebDriver driver;
	
	private static final String SIGN_IN = "//a[contains(text(),'Sign In')]";
	private static final String SIGN_OUT = "//a[contains(text(),'Sign Out')]";
	private static final String MY_ACCOUNT = "//a[contains(text(),'My Account')]";
	private static final String REGISTER = "//a[contains(text(),'Register Now!')]";
	private static final String USERNAME = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	private static final String PASSWORD = "//input[@name='password']";
	private static final String LOGIN = "//input[@name='signon']";
	
	
	public SignIn(WebDriver wd) {
		driver = wd;
	}
	
	public WebElement getSignInLink() {
		return driver.findElement(By.xpath(SIGN_IN));
	}
	
	public void clickSignIn() {
		getSignInLink().click();
	}
	
	public WebElement getUsername() {
		return driver.findElement(By.xpath(USERNAME));
	}
	
	public void inputUsername(String username) {
		getUsername().sendKeys(username);
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.xpath(PASSWORD));
	}
	
	public void inputPassword(String password) {
		getPassword().clear();
		getPassword().sendKeys(password);
	}
	
	private WebElement getLogin() {
		return driver.findElement(By.xpath(LOGIN));
	}
	
	public void clickLogin() {
		getLogin().click();
	}
	
	public WebElement getSignOutLink() {
		return driver.findElement(By.xpath(SIGN_OUT));
	}
	
	public WebElement getMyAccount() {
		return driver.findElement(By.xpath(MY_ACCOUNT));
	}
	
	public void clickMyAccount() {
		getMyAccount().click();
	}


	public WebElement getRegister() {
		return driver.findElement(By.xpath(REGISTER));
	}
	
	public void clickRegister() {
		getRegister().click();
	}

}
