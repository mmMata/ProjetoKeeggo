package br.com.automationpractice.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverElement {
	
	
	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Projeto Keeggo\\ProjetoAutomationpractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(1200, 1500));
		return driver;
	}
	
	public static void quitDriver(WebDriver driver) {
		if (driver != null)
			driver.quit();
	}
}


