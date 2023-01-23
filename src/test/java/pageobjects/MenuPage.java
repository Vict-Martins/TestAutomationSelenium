package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseActionElement;
import utils.Browser;

public class MenuPage extends BaseActionElement {

    @FindBy( xpath = "//a[contains(text(), \"Register\")]")
    private WebElement menuRegister;

    public void goToRegister() {

        menuRegister.click();

    }
    
    public MenuPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }

}