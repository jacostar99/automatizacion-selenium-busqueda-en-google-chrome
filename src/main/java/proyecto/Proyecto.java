package proyecto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proyecto {

	public static void main(String[] args) {

		// Configuracion del driver para conectarse al navegador
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/?hl=es");

		try {
			driver.findElement(By.name("q")).sendKeys("Hola mundo");
			Thread.sleep(1000);
			driver.findElement(By.name("btnK")).click();	
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".LC20lb.DKV0Md")).click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		finally {
			//finalizar el driver
			driver.quit();
			
		}
		
		

	}

}
