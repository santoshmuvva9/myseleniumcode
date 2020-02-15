package testa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","//Users//sunnymuvva//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("sunnysunny");
		driver.findElement(By.id("pass")).sendKeys("abcdefgh");;
		driver.findElement(By.id("loginbutton")).click();;
		

	}

}
