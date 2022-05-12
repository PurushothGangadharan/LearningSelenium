package week2day3assignment;

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class XPath {
	    public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		link.click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("INFOSYS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("PURUSHOTHAMAN");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("PURUSHOTHAMAN");
		driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Mr.");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("QA");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("400000");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("GANGADHARAN");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("GANGADHARAN");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("102342");
		driver.findElement(By.xpath("//input[@id='createLeadForm_tickerSymbol']")).sendKeys("WORK");
		driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("10/10/1000");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("team member");
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("team member");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select dd1=new Select(ele);
		dd1.selectByVisibleText("Employee");
		
		Select dd2=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']")));
		dd2.selectByIndex(3);
		
		Select dd3=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']")));
		dd3.selectByValue("OWN_CCORP");
		
		Select dd4=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']")));
		dd4.selectByVisibleText("Automobile");
		
		Select dd5=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']")));
		dd5.selectByVisibleText("INR - Indian Rupee");
		
		//contact information
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("916473");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("Employee");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("friend");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("gp@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("gp.com");
	   
		//primary address
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("purushoth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("rio");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("tkm");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("nei");
		 Select dd6=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']")));
		 dd6.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("chennai");
		 Select dd7=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
		 dd7.selectByVisibleText("TAMILNADU");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("603102");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("603102");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("INFOSYS");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
		//CONTACT INFORMATION    
		////textarea[@name='description']
	}
	}

