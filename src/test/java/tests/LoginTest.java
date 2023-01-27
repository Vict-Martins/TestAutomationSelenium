package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import pageobjects.LoginPage;
import utils.BaseTest;
import static utils.Browser.driver;

public class LoginTest extends BaseTest {

    private final LoginPage login = new LoginPage();

    @Test
    public void loginWithTheCorrectCredentials() throws InterruptedException {
        
        login.fillInputCredentials( "user", "pass" );
        delay( 1 );
        assertTrue( driver.getCurrentUrl().contains( "/overview.htm" ) );

    }

    @Test
    public void loginWithTheIncorrectCredentials() throws InterruptedException {

        login.fillInputCredentials( "user", "pass_incorrect" );
        delay( 1 );
        assertTrue( driver.getPageSource().contains( "An internal error has occurred and has been logged." ) );

    }

    @Test
    public void loginAndOut() throws InterruptedException {

        delay( 1 );
        login.fillInputCredentials( "user" , "pass" );
        delay( 1 );
        login.pressBtnLogout();
        delay( 1 );
        assertTrue( driver.getCurrentUrl().contains( "index.htm?ConnType=JDBC" ) );

    }

}
