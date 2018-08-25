package sampleGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleGit {
	@Test
 public void login(){
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.bing.com");
		WebElement data = wd.findElement(By.name("q"));
		data.sendKeys("abc");
		data.submit();
	}
	

}
