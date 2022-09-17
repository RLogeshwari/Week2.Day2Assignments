package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver leaftaps=new ChromeDriver();
		
		leaftaps.get("http://leaftaps.com/opentaps/control/main");
		
		leaftaps.manage().window().maximize();
		
		leaftaps.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		leaftaps.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		
		leaftaps.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		leaftaps.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		leaftaps.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		leaftaps.findElement(By.xpath("//a[text()='Leads']")).click();
		
		leaftaps.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		leaftaps.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Logeshwari");
		
		leaftaps.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		leaftaps.findElement(By.xpath("//a[text()='11487']")).click();
		
		leaftaps.findElement(By.xpath("//a[text()='Edit']")).click();
		
		leaftaps.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		leaftaps.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TestLeaf");
		
		leaftaps.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	
		leaftaps.close();
		
		}

}