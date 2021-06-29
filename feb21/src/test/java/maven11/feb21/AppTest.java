package maven11.feb21;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void slaunchchrome() {
    	
    	System.setProperty("webdriver.edge.driver", "F:\\A Utkarsha testing\\libs\\msedgedriver.exe");
 		WebDriver driver =new EdgeDriver();
 		driver.get("https://www.facebook.com");
 		driver.manage().window().maximize();
 	
    	}
    @Test
    public void lshouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("DONE");
    }
    
}

