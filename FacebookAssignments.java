package Week2.Day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignments {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Hustle");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Karate");
	driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9677263025");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Demo@123");
	WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
	Select Dropdown1 = new Select(Date);
	Dropdown1.selectByIndex(10);
	WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
	Select Dropdown2 = new Select(Month);
	Dropdown2.selectByIndex(4);
	WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
	Select Dropdown3 = new Select(Year);
	Dropdown3.selectByVisibleText("1993");
	driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
	
}
}
	