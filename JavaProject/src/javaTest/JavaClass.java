package javaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class JavaClass {
	
	
		


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			   WebDriver driver = new FirefoxDriver(); 
			   driver.get("https://www.facebook.com/"); //Dont Forget to type http:// 
			   driver.manage().window().maximize(); 
			   driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("tejas178@yahoo.com");
			 //  driver.findElement(By.xpath("//*[@id='gsc-i-id1']")).sendKeys("study java");
			//   driver.findElement(By.xpath("//*[@id='___gcse_0']/div/div/form/table[1]/tbody/tr/td[2]/input")).click();
			   driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("");
			   driver.findElement(By.xpath(".//*[@id='u_0_v']")).click();

	}
	}



