package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(("https://leafground.com/select.xhtml"));
		driver.manage().window().maximize();
		WebElement dropDown=driver.findElement(By.className("ui-selectonemenu"));
		Select source=new Select(dropDown);
		source.selectByVisibleText("Puppeteer");

}
}