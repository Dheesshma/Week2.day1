package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dheesshma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kaarthick");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Thanu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Most Trending field");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dheesshmanz@gmail.com");
		WebElement Dropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select Dd1=new Select(Dropdown);
				Dd1.selectByValue("AL");
				
//WebElement dd=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		
		//Select dropDown = new Select(dd);
		
	//	dropDown.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
	}
}
