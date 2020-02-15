package testa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class root {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//sunnymuvva//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.movierulz.ms");
		System.out.println(driver.getTitle());
	
	}

}
