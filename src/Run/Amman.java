package Run;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.BaseClass;
import POM.CurrencyCheck;

public class Amman {
	WebDriver driver;

	@Test(priority = 1)
	public void SetUp() {
		BaseClass bc = new BaseClass(driver);
		bc.SetUp();
	}
	
	@Test(priority=1) 
	public void CheckTheCountry() throws InterruptedException { 
		BaseClass bc=new BaseClass(driver);
		bc.CheckTheCountry();
	 
	 }
	
	@Test(priority=2)
	public void EgyptCheck() {
		BaseClass BB=new BaseClass(driver);
		BB.AmmanSelection();
		
		CurrencyCheck CC=new CurrencyCheck();
		CC.CheckAmmanCurrency();
	}
}
