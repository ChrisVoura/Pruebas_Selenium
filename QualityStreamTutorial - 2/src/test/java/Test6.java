import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class Test6 {


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
	       WebElement btnVehiculos = driver.findElement(By.linkText("VEHÍCULOS"));
	       TimeUnit.SECONDS.sleep(5);
	       btnVehiculos.click();
	       TimeUnit.SECONDS.sleep(5);
	       WebElement btnVermas = driver.findElement(By.className("btnlink"));
	       TimeUnit.SECONDS.sleep(5);
	       btnVermas.click();
	       TimeUnit.SECONDS.sleep(5);
	       WebElement btnCoti = driver.findElement(By.id("coti_1"));
	       TimeUnit.SECONDS.sleep(5);
	       btnCoti.click();
	       TimeUnit.SECONDS.sleep(5);
	       
	       //Completar Nombre
	       
	       WebElement name = driver.findElement(By.id("fname"));
	       TimeUnit.SECONDS.sleep(5);
	       name.sendKeys("Steven");
	       TimeUnit.SECONDS.sleep(5);
	       
	       //Completar Apellido
	       
	       WebElement lastname = driver.findElement(By.id("lname"));
	       TimeUnit.SECONDS.sleep(5);
	       lastname.sendKeys("Morgan");	       
	       TimeUnit.SECONDS.sleep(5);
	       
	       //Completar email
	       
	       WebElement email = driver.findElement(By.id("mail"));
	       TimeUnit.SECONDS.sleep(5);
	       email.sendKeys("smorgan80686@ufide.ac.cr");
	       TimeUnit.SECONDS.sleep(5);
	       
	       //Completar telefono
	       
	       WebElement tel = driver.findElement(By.id("tel"));
	       TimeUnit.SECONDS.sleep(5);
	       tel.sendKeys("8888-8888");
	       TimeUnit.SECONDS.sleep(5);
	       
	       //Completar Comentarios
	       
	       WebElement comment = driver.findElement(By.id("comentarios"));
	       TimeUnit.SECONDS.sleep(5);
	       comment.sendKeys("Saludos desde la automatización :D");
	       TimeUnit.SECONDS.sleep(5);
	       
	       //Marcar WhatsApp
	       
	       WebElement wa = driver.findElement(By.id("wa"));
	       TimeUnit.SECONDS.sleep(5);
	       wa.click();
	       TimeUnit.SECONDS.sleep(5);
	       wa.click();
	       TimeUnit.SECONDS.sleep(5);
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
	      assertEquals("Test boton cotizar ", driver.getTitle());
	   }
	   @After
	   public void tearDown() {
	       driver.quit();
	   }
}
