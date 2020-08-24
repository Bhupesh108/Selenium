package day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning {

public static void main(String[] args) throws InterruptedException {
	

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/selenium/deprecated.html");
		    driver.manage().window().maximize();
		    driver.switchTo().frame("classFrame");
		    driver.findElement(By.linkText("Deprecated")).click();
		    driver.close();
           /* driver.navigate().refresh();
            Thread.sleep(5000);
            driver.quit();
			
			
            driver.findElement(By.id("Username")).click();
		    driver.findElement(By.xpath("//input(@class='inputLogin')")).click();
		*/

}
}
	


