package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		


		//navigate to url
		driver.get("https://demoqa.com/frames");

		
		//Switch to Frame using id of the frame
	//	driver.switchTo().frame("frame1");

		     //Locating frame1 using its id
		WebElement frame1=driver.findElement(By.id("frame1"));

		//        Switching the WebDriver context to frame1
		driver.switchTo().frame(frame1);
		//        
		//Identifying the heading in webelement
		WebElement frame1Heading= driver.findElement(By.id("sampleHeading"));

		//Finding the text of the heading
		String frame1Text=frame1Heading.getText();

		//Print the heading text
		System.out.println(frame1Text);

		//closing the driver
		driver.close();
	}

}
