//1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
//2. How to get the Count of number of check boxes present in the page





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		driver.findElement(By.id("//input[@id='checkBoxOption1']")).click();
//		System.out.println(driver.findElement(By.id("//*[@id='checkBoxOption1']")).isSelected());
		driver.quit();

	}

}
