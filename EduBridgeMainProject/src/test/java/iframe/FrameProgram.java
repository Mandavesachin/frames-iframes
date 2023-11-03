package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameProgram {

		public static void main(String[] args) 

		{

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			WebElement w=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
			
			//switching to frame 'w'
			driver.switchTo().frame(w)	;

			//click try button of the frame
			driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

			//driver.switchTo().alert().accept();
		//	driver.switchTo().alert().dismiss();
			
		//	driver.quit();
		}
} 


