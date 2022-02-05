package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println(driver.getTitle());
    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	//driver.findElement(By.linkText("Log Out")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	//driver.close();
	
}
}
