package VM;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class access {

	WebDriver d;
	
	@BeforeSuite
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\Selenium\\Automation\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.virtualmaze.com/");
		
		PageFactory.initElements(d, elements.class);
		
		
	}
	@Test(enabled=false)
	public void chat() throws InterruptedException
	{
		d.manage().window().maximize();
		Thread.sleep(20000);
		d.switchTo().frame(0);
		elements.chat.click();
	   d.switchTo().defaultContent();
	   Thread.sleep(5000);
		d.switchTo().frame(1);	
		Thread.sleep(5000);
		elements.name.sendKeys("testing");
		elements.email.sendKeys("testing@gmail.com");
		elements.message.sendKeys("testing");
		elements.submit.click();
		d.switchTo().frame(0);
		elements.close.click();
		d.switchTo().defaultContent();
	}
	@Test(priority=1)
	public void vmmaps() throws InterruptedException
	
	{
		
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,500)");
		String base=d.getWindowHandle();
		elements.SA.click();
		Thread.sleep(5000);
		elements.Aus.click();
		Thread.sleep(5000);
		elements.NA.click();
		Thread.sleep(5000);
		elements.US.click();
		
		Thread.sleep(5000);
		
		Set<String> win=d.getWindowHandles();
		
		for(String i:win)   //making driver to land in last new window
		{
			d.switchTo().window(i);
		}
		Thread.sleep(5000);
		d.close();
		
		d.switchTo().window(base);		
	}
	@Test(priority=2)
	public void mapstab() throws InterruptedException
	{
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,-500)");
		String base=d.getWindowHandle();
		Thread.sleep(5000);
		elements.map.click();
         Set<String> win=d.getWindowHandles();
		
		for(String i:win)   //making driver to land in last new window
		{
			d.switchTo().window(i);
		}
		
		Thread.sleep(3000);
		elements.dir.click();
		elements.from.clear();
		elements.from.sendKeys("Erode");

		elements.to.sendKeys("Chennai");
		Thread.sleep(5000);
		
		d.close();
		d.switchTo().window(base);
	}
	@Test(priority=3)
	public void product() throws InterruptedException
	{
		
		elements.prod.click();
		Thread.sleep(3000);
		elements.navi.click();
		
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		elements.fb.click();
		Thread.sleep(3000);
	}
	@AfterSuite
	public void end()
	{
		d.quit();
	}
}
