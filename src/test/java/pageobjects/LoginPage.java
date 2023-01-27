package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.github.cdimascio.dotenv.Dotenv;
import utils.BaseActionElement;
import utils.Browser;

public class LoginPage extends BaseActionElement {

    @FindBy( css = "input[name='username']" )
    private WebElement inputEmail;

    @FindBy( css = "input[name='password']" )
    private WebElement inputPassword;

    @FindBy( css = "input[type='submit']" )
    private WebElement btnLogin;

    @FindBy( xpath = "//a[contains(text(), 'Log Out')]" )
    private WebElement btnLogout;

    private final Dotenv dotenv = Dotenv.load();

    public void fillInputCredentials( String email, String pass ) {

        inputEmail.sendKeys( dotenv.get( email ) );
        inputPassword.sendKeys( dotenv.get( pass ) );
        btnLogin.click();

    }

    public void pressBtnLogout() { btnLogout.click(); }
    
    public LoginPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }

}
