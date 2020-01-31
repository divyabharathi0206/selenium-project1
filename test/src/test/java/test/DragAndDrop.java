package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divi keerthi\\Desktop\\test\\lib\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement desc = driver.findElement(By.id("pass"));
	Actions a=new Actions(driver);
  
}
}
