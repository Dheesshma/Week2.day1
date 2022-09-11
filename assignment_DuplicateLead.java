package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment_DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dheesh");
		driver.findElement(By.name("submitButton")).click();
		String Title1=driver.getTitle();
		System.out.println(Title1);

	}

}
