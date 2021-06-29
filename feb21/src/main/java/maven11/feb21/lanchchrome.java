package maven11.feb21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class lanchchrome {
	
	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\A Utkarsha testing\\libs\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

}
