package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_EditLead {
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
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Onee");
        driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
        Thread.sleep(1500);
        WebElement LeadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
        String EditLeadID = LeadID.getText();
        System.out.println("The First LeadID is" + LeadID);
        LeadID.click();
        driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("XYZ Company");
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
        System.out.println("The New Company Label" + driver.findElement(By.id("viewLead_companyName_sp")).getText());
        
        
	    
	}
}
