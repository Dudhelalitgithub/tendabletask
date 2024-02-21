package mytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tendable_Task {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.tendable.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Our Story']")).click();
		String Page1=driver.getCurrentUrl();
		System.out.println(Page1);
		
		driver.findElement(By.xpath("//a[text()='Our Solution']")).click();
		String Page2=driver.getCurrentUrl();
		System.out.println(Page2);
		
		driver.findElement(By.xpath("//a[text()='Why Tendable?']")).click();
		String Page3 =driver.getCurrentUrl();
		System.out.println(Page3);
		
		
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		
		driver.findElement(By.xpath("//button[text()='Contact']")).click();
		
		driver.findElement(By.id("form-input-fullName")).sendKeys("Lalit Dudhe");
		
		driver.findElement(By.id("form-input-organisationName")).sendKeys("Sakav Technology");
		
		driver.findElement(By.id("form-input-cellPhone")).sendKeys("9763515513");
		
		driver.findElement(By.id("form-input-email")).sendKeys("lalitdudheofficial@gmail.com");
		
		
		WebElement JobRole=driver.findElement(By.id("form-input-jobRole"));

		Select s=new Select(JobRole);
		s.selectByIndex(5);
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("form-input-consentAgreed-0")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		Thread.sleep(3000);
		
		WebElement error=driver.findElement(By.className("ff-form-errors"));
		
		if(error.isDisplayed()) {
			System.out.println("erroe message is appeared:" + error.getText());
		}
		
		else {
			System.out.println("erroe message not appeared");
		}
	
	}

}
