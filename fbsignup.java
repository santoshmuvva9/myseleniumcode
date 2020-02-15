package testa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		System.setProperty("webdriver.chrome.driver","//Users//sunnymuvva//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("sunny");
		driver.findElement(By.name("lastname")).sendKeys("muvva");
		driver.findElement(By.name("reg_email__")).sendKeys("sunnymuvva@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sunnymuvva@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("muvvamuvva123@");
		driver.findElement(By.name("birthday_month")).click();
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("2");
		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByValue("20");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1994");
		//driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
		/*using index
		 driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		 */
		
		/* by parent[space]child
		 driver.findElement(By.xpath("//div[@id='u_0_y'] //input[@value='2']")).click();
		 */
	
		driver.findElement(By.name("websubmit")).click();
		
	}
}

