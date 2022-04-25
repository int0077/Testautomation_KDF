package config;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class ActionKeywords {
	public static WebDriver driver;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void navigate() {
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(null)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

	}
	
	public static void SwitchToWindow() {
		String currentHandle= driver.getWindowHandle();
		// Searching for Headphones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple MacBook air 14inch", Keys.ENTER);

		//Clicking on search button
		driver.findElement(By.partialLinkText("2020 Apple MacBook Pro")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String actual: handles) {
		if(!actual.equalsIgnoreCase(currentHandle)) {
		//Switch to the opened tab
		driver.switchTo().window(actual); 
		
		}
		}
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")).click();
	}

	public static void input_Username() {
		
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/ul/li[6]/div/a/button/img")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7303738614");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}

	public static void input_Password() {
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("quick@123");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
	}

	
	public static void payment_Page() {
		driver.findElement(By.xpath("//*[@id=\"address-book-entry-0\"]/div[2]/span/a")).click();
		driver.findElement(By.name("ppw-instrumentRowSelection")).click();
		/*
		 * WebElement radioEle =
		 * driver.findElement(By.name("ppw-instrumentRowSelection")); boolean select =
		 * radioEle.isSelected(); System.out.print(select);
		 * 
		 * // performing click operation if element is not already selected if (select
		 * == false) { radioEle.click(); }
		 */
		
		driver.findElement(By.xpath("//*[@id=\"pp-RQdjbO-85\"]")).click();
	}
	
	public static void waitFor() throws Exception {
		Thread.sleep(5000);
	}

	public static void closeBrowser() {
		driver.quit();
	}

}
