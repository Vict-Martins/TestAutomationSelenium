package tests;

import com.github.javafaker.Faker;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import pageobjects.MenuPage;
import pageobjects.RegisterPage;
import utils.BaseTest;
import static utils.Browser.driver;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class RegisterTest extends BaseTest {

    private final RegisterPage register = new RegisterPage();
    private final Faker faker = new Faker();
    private final MenuPage menu = new MenuPage();

    @Test
    public void RegisterUserTest() throws InterruptedException, FileNotFoundException {

        String pass = faker.internet().password(),
               user = faker.name().username();
        FileOutputStream arq = new FileOutputStream(".env");
        PrintWriter pr = new PrintWriter( arq );
        menu.goToRegister();
        delay( 1 );
        register.fillInputFirstName( faker.name().firstName() );
        register.fillInputLastName( faker.name().lastName() );
        register.fillInputAddress( faker.address().streetAddress() );
        register.fillInputCity( faker.address().city() );
        register.fillInputState( faker.address().state() );
        register.fillInputZipCode( faker.address().zipCode() );
        register.fillInputPhone( String.valueOf( faker.number().numberBetween( 1000000, 9999999 ) ) );
        register.fillInputSsn( String.valueOf( faker.number().numberBetween( 10000, 99999) ) );
        register.fillInputUserName( user );
        register.fillInputPassword( pass, pass );
        delay( 1 );
        register.pressBtnRegister();
        delay( 1 );
        assertTrue( driver.getPageSource().contains( "Your account was created successfully. You are now logged in." ) );
        pr.println( "user=" + user );
        pr.println( "pass=" + pass );
        pr.println( "pass_incorrect=" + pass + faker.number().numberBetween( 100, 1000 ) );
        pr.close();

    }

}
