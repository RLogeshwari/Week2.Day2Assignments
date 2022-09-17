package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver facebook = new ChromeDriver();
		
		facebook.get("https://en-gb.facebook.com/");
		
		facebook.manage().window().maximize();
		
		facebook.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		facebook.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		facebook.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Logeshwari");
		
		facebook.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ravi");
		
		facebook.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("Logeshwari261997@gmail.com");
		
		facebook.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("Logeshwari261997@gmail.com");
		
		facebook.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("logeshwari26");
		
		WebElement birth = facebook.findElement(By.xpath("//select[@name='birthday_day']"));
		Select Date=new Select(birth);
		Date.selectByValue("26");
		
		WebElement birthmonth = facebook.findElement(By.xpath("//select[@name='birthday_month']"));
		Select Month=new Select(birthmonth);
		Month.selectByVisibleText("Oct");
		
		WebElement birthyear = facebook.findElement(By.xpath("//select[@name='birthday_year']"));
		Select Year=new Select(birthyear);
		Year.selectByIndex(25);
		
		facebook.findElement(By.xpath("//label[text()='Female']")).click();

		facebook.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		}

}
