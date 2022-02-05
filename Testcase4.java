package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        WebElement Sourcedropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select dropdown = new Select(Sourcedropdown);
        dropdown.selectByVisibleText("Employee");
        
        WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select Dropdown1 = new Select(Industry);
        Dropdown1.selectByValue("IND_SOFTWARE");
        //select keyword
        WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select Dropdown2 = new Select(Ownership);
        Dropdown2.selectByIndex(2);
        
        
        
        
	}
}
