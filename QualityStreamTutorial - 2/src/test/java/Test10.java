import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Test10 {


	   private WebDriver driver;
	   
	   @Before
	   public void setUP() {
	      
	       System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
	       driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.seminuevoscr.com/");
	   }
	   @Test
	   public void testSeminuevosPage() throws InterruptedException {
	       WebElement btninicio = driver.findElement(By.className("sponsor_nissan"));
	       TimeUnit.SECONDS.sleep(10);
	       btninicio.click();
	       WebElement btnlogo = driver.findElement(By.className("sponsor_audi"));
	       TimeUnit.SECONDS.sleep(5);
	       btnlogo.click();
	       TimeUnit.SECONDS.sleep(10);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	      assertEquals("Test boton cotizar ", driver.getTitle());
	   }
	   @After
	   public void tearDown() {
	       driver.quit();
	   }
}
