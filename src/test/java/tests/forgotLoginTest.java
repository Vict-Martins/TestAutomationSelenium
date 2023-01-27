package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.github.javafaker.Faker;
import pageobjects.LoginPage;
import pageobjects.MenuPage;
import pageobjects.RegisterPage;
import pageobjects.forgotLoginPage;
import utils.BaseTest;
import static utils.Browser.driver;

public class forgotLoginTest extends BaseTest {

    private final forgotLoginPage forgot = new forgotLoginPage();
    private final MenuPage menu = new MenuPage();
    private final RegisterPage register = new RegisterPage();
    private final Faker faker = new Faker();
    private final LoginPage login = new LoginPage();

    @Test
    public void forgotAuthenticationTest() throws InterruptedException {

        String firstName = faker.name().firstName(), 
               lastName = faker.name().lastName(),
               address = faker.address().streetAddress(),
               city = faker.address().city(),
               state = faker.address().state(),
               zipCode = faker.address().zipCode(),
               phone = String.valueOf( faker.number().numberBetween( 1000000, 9999999 ) ),
               ssn = String.valueOf( faker.number().numberBetween( 10000, 99999) ),
               userName = faker.name().username(),
               pass = faker.internet().password();
               
        menu.goToRegister();
        delay( 1 );
        register.fillInputFirstName( firstName );
        register.fillInputLastName( lastName );
        register.fillInputAddress( address );
        register.fillInputCity( city );
        register.fillInputState( state );
        register.fillInputZipCode( zipCode );
        register.fillInputPhone( phone );
        register.fillInputSsn( ssn );
        register.fillInputUserName( userName );
        register.fillInputPassword( pass, pass );
        delay( 1 );
        register.pressBtnRegister();
        delay( 1 );
        login.pressBtnLogout();
        menu.menuForgot();
        forgot.fillInputFirstName( firstName );
        forgot.fillInputLastName( firstName );
        forgot.fillInputStreet( address );
        forgot.fillInputCity( city );
        forgot.fillInputState( state );
        forgot.fillInputZipCode( zipCode );
        forgot.fillInputSsn( ssn );
        forgot.pressBtnFind();
        delay( 1 );
        assertTrue( driver.getPageSource().contains( userName ) && driver.getPageSource().contains( pass ) );

    }
}
