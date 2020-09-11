package basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Login_Amazon {

	public static void main(String[] args) {
		// Here we set the property
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Launch the chrome driver
		
		ChromeDriver driver=new ChromeDriver();
		//Launch the Amazon Url
        
		driver.get("https://www.amazon.in/");
        //Maximaze the Window
       
		driver.manage().window().maximize();
        
        //Enter 'outslayer' in the searchbox and enter key
       
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("outslayer",Keys.ENTER);
		
		//Here we have used the XPath of Webelements got the return type List.
        List<WebElement> pricelist = driver.findElementsByXPath("//span[@class='a-price-whole']");
        
       /* //Here iterate the value of i//
      for (int i=0;i<elements.size();i++) {
    	  
    	 // Here value of single element i
    	  WebElement element = elements.get(i);
    	  
    	  //Print the value of get Text
    	  System.out.println(element.getText());
    	  */
    	  
		ArrayList<Integer>price=new ArrayList<Integer>();
		for(WebElement webelement:pricelist) {
			price.add(Integer.valueOf(webelement.getText().replace(",", "")));
		}
System.out.println("Price list after sorting");
  pricelist.get(price.indexOf(Collections.max(price))).click();
  System.out.println(price.indexOf(Collections.max(price)));
     System.out.println(price.indexOf(Collections.min(price)));
     Collections.sort(price);
		for (Integer integer : price) {
			System.out.print(integer + ", ");
		}
		ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles());
		if (!availableWindows.isEmpty()) {
			driver.switchTo().window(availableWindows.get(1));
		}
		String selecctedProdName = driver.findElementByXPath("//span[@id='productTitle']").getText().trim();
		String selectprodCost = driver.findElementById("priceblock_saleprice").getText();
		System.out
				.println("\nSelected product is: " + selecctedProdName + "\n And product Price is =" + selectprodCost);
	
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		driver.findElement(By.id("continue")).click();
		String errorMsg = "";
		try {
			errorMsg = driver.findElementByXPath("//div[@id='auth-email-missing-alert']/div/div").getText();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			errorMsg = driver.findElementByXPath("(//div[@class='a-alert-content'])[1]/ul/li/span").getText();
		}
		if (!errorMsg.isEmpty()) {
			System.out.println("\nError messgae: " + errorMsg);
		}
		driver.quit();
	}

     
      }
	
	
	
