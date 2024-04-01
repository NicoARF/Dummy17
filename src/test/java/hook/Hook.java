package hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hook {
    public WebDriver driver;

    public Hook(){
        // Obtener la ruta absoluta del ChromeDriver
        String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chrome/chromedriver";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
    }
    @BeforeTest
    public void setUp(){ driver.get("https://www.saucedemo.com/"); }

    @AfterTest
    public void tearDown(){
        if(driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver(){ return  driver; }
}
