package verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validation {
	WebDriver driver;
	
	public void salesforce_login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.close();
		}
public static void main(String[] args) {
		validation login=new validation();
		login.salesforce_login();
	}

}
