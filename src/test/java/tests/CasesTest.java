package tests;

import static org.junit.Assert.assertTrue;
import utils.BaseTest;
import static utils.Browser.driver;

import org.junit.Test;

import pageobjects.CasesPage;
import pageobjects.RegisterPage;

public class CasesTest extends BaseTest {

    private final CasesPage cases = new CasesPage();
    private final RegisterPage register = new RegisterPage();

    @Test
    public void checkPageTestCases() throws InterruptedException {

        delay( 10 );
        cases.pressBtnTestCases();
        delay( 10 );
        cases.selectIframe();
        delay( 10 );
        register.pressBtnClosed();
        delay( 2 );
        assertTrue( driver.getCurrentUrl().contains( "automationexercise.com/test_cases" ) );

    }
    
}
