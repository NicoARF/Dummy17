package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user-name")
    private WebElement input_username;

    @FindBy(id = "password")
    private WebElement input_password;

    @FindBy(id = "login-button")
    private WebElement input_login;

    @FindBy(xpath = "//div[@class='error-message-container error']//h3")
    private WebElement h3_errorMessage;

    public LoginPage(WebDriver driver){ PageFactory.initElements(driver, this);}

    public void sendKeysUsername(String username){
        input_username.sendKeys(username);
    }
    public void sendKeysPassword(String password){
        input_password.sendKeys(password);
    }
    public void clickLogin(){
        input_login.click();
    }

    public String valMessageError(){
        return h3_errorMessage.getText();
    }
}
