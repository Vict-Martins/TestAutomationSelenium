package tests;

import com.github.javafaker.Faker;
import org.junit.Test;
import pageobjects.MenuPage;
import pageobjects.RegisterPage;
import utils.BaseTest;
public class RegisterTest extends BaseTest {

    private final RegisterPage register = new RegisterPage();
    private final Faker faker = new Faker();
    private final MenuPage menu = new MenuPage();

    @Test
    public void RegisterUserTest() throws InterruptedException {

        String pass = faker.internet().password();
        menu.goToRegister();
        delay( 3 );
        register.fillInputFirstName( faker.name().firstName() );
        register.fillInputLastName( faker.name().lastName() );
        register.fillInputAddress( faker.address().streetAddress() );
        register.fillInputCity( faker.address().city() );
        register.fillInputState( faker.address().state() );
        register.fillInputZipCode( faker.address().zipCode() );
        register.fillInputPhone( String.valueOf( faker.number().numberBetween( 1000000, 9999999)) );
        register.fillInputSsn( String.valueOf( faker.number().numberBetween( 10000, 99999) ) );
        register.fillInputUserName( faker.name().username() );
        register.fillInputPassword( pass , pass );
        register.pressBtnRegister();
        delay( 3 );
       
    }

}
