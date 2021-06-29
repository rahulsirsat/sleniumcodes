package maven11.feb21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchedgee {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\A Utkarsha testing\\libs\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

}
