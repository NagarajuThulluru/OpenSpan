package verifications;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenSpan_Login {
	static WebDriver driver;
	
	public static void InvokeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public static void Login() {
		driver.get("https://training.openspan.com/login");
		driver.findElement(By.id("user_name")).sendKeys("kaiu");
		driver.findElement(By.id("user_pass")).sendKeys("JASUYG");
		driver.findElement(By.id("login_button")).click();
		driver.close();
	}
	public static void main(String[] args) {
		
		OpenSpan_Login.InvokeBrowser();
		OpenSpan_Login.Login();

		
	}
	

}
