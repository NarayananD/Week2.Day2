package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement2_createcontact {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Testone");
	driver.findElement(By.id("lastNameField")).sendKeys("Selenium");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("LocalTestone");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LocalSelenium");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Happy & Healthy");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Josh@rc.com");
	WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select Dropdown = new Select(State);
	Dropdown.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hello");
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	System.out.println("The Page Title is:" + driver.getTitle());
	
	
}

}
