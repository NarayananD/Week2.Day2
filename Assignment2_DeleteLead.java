package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
	    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9898989898");
	    driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
	    Thread.sleep(2000);
	    WebElement lead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
	    String leadId = lead.getText();
	    System.out.println("The leadId is " + leadId);
	    lead.click();
	    
	    driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
	    driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
	    
	    if(driver.findElement(By.xpath("//div[@class='x-paging-info']")).isDisplayed())
	    {
	    	System.out.println("No records to display");
	    }
	    else
	    {
	    	System.out.println("Records displayed");
	    }
	    
	
	}
}
