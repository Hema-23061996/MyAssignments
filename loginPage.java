package week2day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		 String title = driver.getTitle();
		 System.out.println(title);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemalatha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kulanthasamy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating form");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemavidhai@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);

	}

}
