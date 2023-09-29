package BrowserBoxTestng.BrowserButton;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BrowserButton {
	
	WebDriver driver;
  @Test
  public void BrowserButtonTest() {
	  
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Computer\\Desktop\\QA contents\\New folder\\SampleImage.jpg");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
