package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	
	public BaseClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yasmeen\\Downloads\\latest\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.get("https://subscribe.jawwy.tv/jo-ar");
		driver.manage().window().maximize();
		
	}
	
	//hit the country button list
	public void CheckTheCountry() throws InterruptedException {
		WebElement CountryBtn;
		CountryBtn=driver.findElement(By.xpath("//*[@id=\"arrow\"]/img"));
		CountryBtn.click();
		Thread.sleep(5000);
	}
	
	//select Egypt
	public void EgyptSelection() {
		WebElement Egypt;
		Egypt=driver.findElement(By.id("eg-contry-lable"));
		Egypt.click();
		}
	
	public void AmmanSelection() {
		WebElement Amman;
		Amman=driver.findElement(By.id("om-contry-lable"));
		Amman.click();
		
	}
	
	public void JordanSelection() {
		WebElement Jordan;
		Jordan=driver.findElement(By.id("jo-contry-lable"));
		Jordan.click();
	}
	
	
	
	}

