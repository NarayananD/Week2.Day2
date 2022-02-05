package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_DuplicateLead {
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
        driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
        driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Duplicate@leaf.com");
       
        driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
       Thread.sleep(2000);
        WebElement DupliateLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
        String Firstname = DupliateLead.getText();
        System.out.println("The First name is" + Firstname);
        DupliateLead.click();
        driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        System.out.println("The Duplicate Lead name is as same as the Captured name" + driver.findElement(By.id("viewLead_firstName_sp")).getText());
     
}
}
	