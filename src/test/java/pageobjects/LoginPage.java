package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseActionElement;
import utils.Browser;

public class LoginPage extends BaseActionElement {

    @FindBy( css = "input[data-qa='login-email']" )
    private WebElement inputEmail;

    @FindBy( css = "input[data-qa='login-password']" )
    private WebElement inputPassword;

    @FindBy( css = "button[data-qa='login-button']" )
    private WebElement btnLogin;

    @FindBy( css = "a[href='/logout']" )
    private WebElement btnLogout;

    public void fillInputCredentials( String email, String pass ) {

        inputEmail.sendKeys( email );
        inputPassword.sendKeys( pass );
        btnLogin.click();

    }

    public void pressBtnLogout() { btnLogout.click(); }
    
    public LoginPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }

}
