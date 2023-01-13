package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;
import utils.BaseTest;
import static utils.Browser.driver;

public class LoginTest extends BaseTest {

    private final LoginPage login = new LoginPage();
    private final RegisterPage register = new RegisterPage();

    @Test
    public void loginWithTheCorrectCredentials() throws InterruptedException {

        register.pressBtnSignIn();
        delay( 2 );
        login.fillInputCredentials( "realguard4@gmail.com" , "123mudar" );
        delay( 2 );
        assertTrue( driver.getPageSource().contains( "Jose Martins" ) );

    }

    @Test
    public void loginWithTheIncorrectCredentials() throws InterruptedException {

        register.pressBtnSignIn();
        delay( 2 );
        login.fillInputCredentials( "realguard4@gmail.com" , "12345" );
        delay( 2 );
        assertTrue( driver.getPageSource().contains( "Your email or password is incorrect!" ) );

    }

    @Test
    public void loginAndOut() throws InterruptedException {

        register.pressBtnSignIn();
        delay( 2 );
        login.fillInputCredentials( "realguard4@gmail.com" , "123mudar" );
        delay( 2 );
        login.pressBtnLogout();
        assertTrue( driver.getCurrentUrl().contains( "automationexercise.com/login" ) );

    }

    @Test
    public void registerUserWithExistingEmail() throws InterruptedException {

        register.pressBtnSignIn();
        delay( 2 );
        register.fillNewUserSignUp( randomString( 6 ) , "realguard4@gmail.com" );
        delay( 2 );
        assertTrue( driver.getPageSource().contains( "Email Address already exist!" ) );

    }

}
