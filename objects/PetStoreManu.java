package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreManu {
	
	private WebDriver driver;

	public static final String URL_Page = "https://petstore.octoperf.com/actions/Catalog.action";

	// SIDE
	private static final String FISH_SIDE = "//div[@id='Content']//a[1]//img[1]";
	private static final String DOGS_SIDE = "//div[@id='Content']//a[2]//img[1]";
	private static final String CATS_SIDE = "//div[@id='Content']//a[3]//img[1]";
	private static final String REPTILES_SIDE = "//div[@id='Content']//a[4]//img[1]";
	private static final String BIRDS_SIDE = "//div[@id='Content']//a[5]//img[1]";

	// TOP
	private static final String FISH_TOP = "//div[@id='QuickLinks']//a[1]//img[1]";
	private static final String DOGS_TOP = "//div[@id='Header']//a[2]//img[1]";
	private static final String REPTILES_TOP = "//div[@id='Header']//a[3]//img[1]";
	private static final String CATS_TOP = "//div[@id='Header']//a[4]//img[1]";
	private static final String BIRDS_TOP = "//div[@id='Header']//a[5]//img[1]";

	// IMG
	private static final String BIRDS_IMG = "//body//area[1]";
	private static final String FISH_IMG = "//body//area[2]";
	private static final String DOGS_IMG = "//body//area[3]";
	private static final String REPTILES_IMG = "//body//area[4]";
	private static final String CATS_IMG = "//body//area[5]";
	private static final String BIRDS2_IMG = "//body//area[6]";

	private static final String BTNSIGNIN = "//a[contains(text(),'Sign In')]";
	private static final String CATALOG_TITLE = "//*[@id=\"Catalog\"]/h2";
	private static final String FIRST_BIRD = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a";
	private static final String ADD_TO_CART = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a";
	private static final String PRODUCT_ID = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[2]";

	public PetStoreManu(WebDriver wd) {
		driver = wd;
	}

	// METODE ZA PRISTUPANJE SIDE MENIJU

	public WebElement getFishSide() {
		return driver.findElement(By.xpath(FISH_SIDE));
	}

	public void clickFishSide() {
		getFishSide().click();
	}

	public WebElement getDogsSide() {
		return driver.findElement(By.xpath(DOGS_SIDE));
	}

	public void clickDogsSide() {
		getDogsSide().click();
	}

	public WebElement getCatsSide() {
		return driver.findElement(By.xpath(CATS_SIDE));
	}

	public void clickCatsSide() {
		getCatsSide().click();
	}

	public WebElement getReptilesSide() {
		return driver.findElement(By.xpath(REPTILES_SIDE));
	}

	public void clickReptilesSide() {
		getReptilesSide().click();
	}

	public WebElement getBirdsSide() {
		return driver.findElement(By.xpath(BIRDS_SIDE));
	}

	public void clickBirdsSide() {
		getBirdsSide().click();
	}

	// METODE ZA PRISTUPANJE TOP MENIJU

	public WebElement getFishTop() {
		return driver.findElement(By.xpath(FISH_TOP));
	}

	public void clickFishTop() {
		getFishTop().click();
	}

	public WebElement getDogsTop() {
		return driver.findElement(By.xpath(DOGS_TOP));
	}

	public void clickDogsTop() {
		getDogsTop().click();
	}

	public WebElement getReptilesTop() {
		return driver.findElement(By.xpath(REPTILES_TOP));
	}

	public void clickReptilesTop() {
		getReptilesTop().click();
	}

	public WebElement getCatsTop() {
		return driver.findElement(By.xpath(CATS_TOP));
	}

	public void clickCatsTop() {
		getCatsTop().click();
	}

	public WebElement getBirdsTop() {
		return driver.findElement(By.xpath(BIRDS_TOP));
	}

	public void clickBirdsTop() {
		getBirdsTop().click();
	}

	// METODE ZA PRISTUPANJE IMG MENIJU

	public WebElement getBirdsImg() {
		return driver.findElement(By.xpath(BIRDS_IMG));
	}

	public void clickBirdsImg() {
		getBirdsImg().click();
	}

	public WebElement getFishImg() {
		return driver.findElement(By.xpath(FISH_IMG));
	}

	public void clickFishImg() {
		getFishImg().click();
	}

	public WebElement getDogsImg() {
		return driver.findElement(By.xpath(DOGS_IMG));
	}

	public void clickDogsImg() {
		getDogsImg().click();
	}

	public WebElement getReptilesImg() {
		return driver.findElement(By.xpath(REPTILES_IMG));
	}

	public void clickReptilesImg() {
		getReptilesImg().click();
	}

	public WebElement getCatsImg() {
		return driver.findElement(By.xpath(CATS_IMG));
	}

	public void clickCatsImg() {
		getCatsImg().click();
	}

	public WebElement getBirds2Img() {
		return driver.findElement(By.xpath(BIRDS2_IMG));
	}

	public void clickBirds2Img() {
		getBirds2Img().click();
	}

	// METODE ZA PRISTUPANJE SIGN IN DUGMETU

	public WebElement getBtnSignIn() {
		return driver.findElement(By.xpath(BTNSIGNIN));
	}

	public void clickBtnSignIn() {
		getBtnSignIn().click();
	}

	public WebElement getCatalogTitle() {
		return driver.findElement(By.xpath(CATALOG_TITLE));
	}

	public WebElement getFirstBirdLink() {
		return driver.findElement(By.xpath(FIRST_BIRD));
	}

	public void clickFirstBird() {
		getFirstBirdLink().click();
	}
	
	public WebElement getAddToCartBtn() {
		return driver.findElement(By.xpath(ADD_TO_CART));
	}

	public void clickAddToCartBtn() {
		getAddToCartBtn().click();
	}
	
	public WebElement getProductId() {
		return driver.findElement(By.xpath(PRODUCT_ID));
	}

}
