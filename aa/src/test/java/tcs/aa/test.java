package tcs.aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:4200/signUp");
		driver.findElement(By.xpath("input[@type='text']")).sendKeys("narapareddy");
		driver.findElement(By.className("ng-untouched ng-pristine ng-valid")).sendKeys("narapareddy@tcs.com");
		driver.findElement(By.className("ng-untouched ng-pristine ng-valid")).sendKeys("chennai");
		driver.findElement(By.linkText("SignUp")).click();
	
		
		driver.close();

	}

}
