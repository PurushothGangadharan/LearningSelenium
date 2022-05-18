package week2day5assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		//get title
		
		////System.out.println("the title is:"+driver.getTitle());
		//if(driver.getTitle().contains("Testleaf"))
		//{
		//System.out.println("I confirm the title has Testleaf");
		//}
		//else
		//{
			//System.out.println("the title does not have the word Testleaf");

		//}
		////System.out.println("the url is:"+driver.getCurrentUrl());
		////System.out.println("the source:"+driver.getPageSource());
		
		//attributes
		//System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
	    
		//link
		//System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		
		//CssSelector
		//System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//text
		//System.out.println(driver.findElement(By.id("color")).getText());
		
		//location
		//System.out.println(driver.findElement(By.id("color")).getLocation().getY());

		//System.out.println(driver.findElement(By.id("color")).getLocation());
		
		//size
		//System.out.println(driver.findElement(By.id("color")).getSize().getHeight());
		//System.out.println(driver.findElement(By.id("color")).getSize().getWidth());
		//System.out.println(driver.findElement(By.id("color")).getSize());
		
		//Tagname
		//System.out.println(driver.findElement(By.id("color")).getTagName());
		
		//Textcolor
		//System.out.println(driver.findElement(By.id("color")).isDisplayed());
		
		//System.out.println(driver.findElement(By.name("username")).isEnabled());
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")).isEnabled());
		
		//checkbox
		
		//System.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]")).isSelected());
        
		
		System.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/input")).isSelected());
		
		
		

		
		
		//driver.close();
		
	}
}
