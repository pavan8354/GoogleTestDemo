package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestNGGoogleDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args)  {

		beforeTest();
		test1();
		beforeTest();
			test3();

	}
	
	/**Navigate to  https://www.google.com
	 * Pass data in search functionality and click search
	 * Data - Valid Data - "Automation Step by step
	 * Data - invalid Data -""
		**/
	
	public static void beforeTest() {
		
		System.out.println("***************************Initializing Web Driver********************");
		
		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://google.com");

	}


		public static void test1() {
			
			System.out.println("***************************Valid Credentials********************");

		 driver.findElement(By.name("q")).sendKeys("Automation step by step");
		 driver.findElement(By.name("btnK")).click();
		 System.out.println("This is test1 >>>>>>!!!!");
		 driver.close();
		 driver.quit();


	}
		
		public static void test3() {
		
			System.out.println("***************************Invalid Credentials********************");
		driver.findElement(By.name("q")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@class='gNO89b']")).click();
		System.out.println("This is test3>>>>>>!!!!");
		driver.close();
		 driver.quit();

	}


}









