package sauceDemo;

import hook.Hook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.InventoryPage;
import page.LoginPage;

public class TestLoginSauce extends Hook {

    public WebDriver driver = getDriver();
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);
    @Test
    public void loginHp(){
        loginPage.sendKeysUsername("standard_user");
        loginPage.sendKeysPassword("secret_sauce");
        loginPage.clickLogin();
        Assert.assertTrue(inventoryPage.valTitle());
    }
}
