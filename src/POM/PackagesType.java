package POM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PackagesType {
	WebDriver driver;
	
	public void CheckTheLightPack() {
		WebElement packTypeLight;
		packTypeLight=driver.findElement(By.id("name-لايت"));
		assertEquals(packTypeLight, "لايت");
	}
	public void CheckTheBasicPack() {
		WebElement packTypeBasic;
		packTypeBasic=driver.findElement(By.id("name-الأساسية"));
		assertEquals(packTypeBasic, "الأساسية");
	}
	
	public void CheckThePremiumPack() {
		WebElement packTypePremium;
		packTypePremium=driver.findElement(By.id("name-بريميوم"));
		assertEquals(packTypePremium, "بريميوم");
	}

}
