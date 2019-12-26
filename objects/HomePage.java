package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private static final String ENTER_STORE_LINK_XPATH = "//a[contains(text(),'Enter the Store')]";

	private WebDriver driver;
	
		public static final String URL = "https://petstore.octoperf.com/";
		
		
		public HomePage(WebDriver wd) {
			this.driver = wd;
		}
		
		public WebElement getEnterStoreLink() {
			return driver.findElement(By.xpath(ENTER_STORE_LINK_XPATH));
		}
		
		public void openPage() {
			driver.get(URL);
		}

		public void navigateToPage() {
			driver.navigate().to(URL);
		}

		public void enterStore() {
			getEnterStoreLink().click();
		}
	}


