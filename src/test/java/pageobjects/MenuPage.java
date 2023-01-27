package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseActionElement;
import utils.Browser;

public class MenuPage extends BaseActionElement {

    @FindBy( xpath = "//a[contains(text(), \"Register\")]")
    private WebElement menuRegister;

    @FindBy( xpath = "//a[contains(text(), 'Forgot login info?')]" )
    private WebElement menuForgot;

    public void goToRegister() { menuRegister.click(); }
    public void menuForgot() { menuForgot.click(); }
    
    public MenuPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }

}