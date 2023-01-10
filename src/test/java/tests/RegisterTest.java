package tests;

import org.junit.Test;
import pageobjects.RegisterPage;
import utils.BaseTest;

public class RegisterTest extends BaseTest {

    private final RegisterPage register = new RegisterPage();

    @Test
    public void RegisterUserTest() throws InterruptedException {

        register.pressBtnSignIn();
        register.fillNewUserSignUp( randomString( 6), randomEmail() );
        register.pressLabelTitle();
        register.fillInputPassword( randomNumber( 25000000, 50000000) );
        delay( 1 );
        register.selectDate( 29, 03, "1996" );
        register.fillName( randomString(6), randomString(6) );
        register.fillCompany( "CEPEDI" );
        register.fillAddress( randomString(7), randomString(7) );
        register.fillCountry( "United States" );
        register.fillInputState( randomString(6) );
        register.fillCity( randomString(6) );
        register.fillZipCode( randomNumber( 1000000, 9999999 ) );
        register.fillMobileNumber( randomNumber( 1000000, 9999999 ) );
        delay( 1 );
        register.pressBtnContinue();
        delay( 1 );
        register.selectIframe();
        delay( 1 );
        register.pressBtnClosed();
        delay( 1 );
        register.pressBtnDeleteAccount();
        delay( 1 );
        register.returnMsgDeleteAccount( "ACCOUNT DELETED!" );
        delay( 1 );

    }

}
