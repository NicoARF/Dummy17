package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    @FindBy(xpath = "//div[@id=\"header_container\"]//span[@class='title']")
    private WebElement span_title;

    public InventoryPage(WebDriver driver){ PageFactory.initElements(driver, this);}

    public boolean valTitle(){
        return span_title.isDisplayed();
    }
}
