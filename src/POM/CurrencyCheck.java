package POM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrencyCheck {
	
WebDriver driver;
	
	public void CheckEgyptCurrency() {
		WebElement EgyptCurrency;
		EgyptCurrency=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[3]/div[1]/text()[2]"));
		assertEquals(EgyptCurrency," جنيه مصري/بالشهر");
	}
	
	public void CheckAmmanCurrency() {
		WebElement AmmanCurrency;
		AmmanCurrency=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[3]/div/text()[2]"));
		assertEquals(AmmanCurrency," ريال عماني/بالشهر");

	}
	public void CheckJordanCurrency() {
		WebElement JordanCurrency;
		JordanCurrency=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[3]/div/text()[2]"));
		assertEquals(JordanCurrency," دينار أردني /بالشهر");
		
	}
	


}
