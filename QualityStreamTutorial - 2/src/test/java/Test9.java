import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Test9 {


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
	       WebElement btnCyT = driver.findElement(By.linkText("Condiciones y Términos de Uso"));
	       TimeUnit.SECONDS.sleep(5);
	       btnCyT.click();
	       TimeUnit.SECONDS.sleep(5);
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	      assertEquals("Test boton cotizar ", driver.getTitle());
	   }
	   @After
	   public void tearDown() {
	       driver.quit();
	   }
}
