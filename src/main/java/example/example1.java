/**
 * @Author Gladson Antony
 * @Date 31-Jan-2018 
 * @Time 8:10:10 PM
 */
package example;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;

public class example1 
{
	
	@BeforeClass
	public void beforeClass()
	{
		Configuration.screenshots=true;		
		Configuration.baseUrl="https://www.google.co.in/";
		Configuration.browser="Chrome";
		getWebDriver().manage().window().maximize();
		Configuration.startMaximized=true;
		Configuration.driverManagerEnabled=true;
		ScreenShooter.captureSuccessfulTests = true;
		Configuration.reportsFolder = "target/test-result/reports";
		Configuration.savePageSource=false;
		System.setProperty("selenide.start-maximized", "true");
		
	}
	
	@Test
	public void test1()
	{
		Selenide.open("/");		
		Selenide.$(By.name("q")).val("selenide").pressEnter();
	}

}
