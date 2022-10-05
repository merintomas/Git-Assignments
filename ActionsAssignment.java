package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		//builder.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
		//moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		WebElement source = driver.findElement(By.id("draggable"));
		
	    builder.dragAndDropBy(source, 135, 40).build().perform();
	}
	
}
