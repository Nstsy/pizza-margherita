
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeTest
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        webDriver.get("https://www.pizzatempo.by/");
        webDriver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        webDriver.quit();
    }
}
