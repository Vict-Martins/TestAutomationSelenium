package tests;

import org.junit.Test;

import pageobjects.ContactUsPage;
import utils.BaseTest;

public class ContactUsTest extends BaseTest {
    
    private final ContactUsPage contact = new ContactUsPage();
    
    @Test
    public void createContactUs() throws InterruptedException {

        contact.pressBtnContactUs();
        delay( 1 );
        contact.fillInputName( randomString( 6 ) );
        delay( 1 );
        contact.fillInputEmail( randomEmail() );
        delay( 1 );
        contact.fillInputSubject( randomString( 6 ) );
        delay( 1 );
        contact.fillInputTextArea( randomString( 6 ) );
        delay( 1 );
        contact.pressUploadFile();
        delay( 1 );
        scrollPage( "50" );
        contact.pressBtnSubmit();
        delay( 2 );
        contact.acceptAlert();
        delay( 1 );
        contact.returnMsgValidator( "Success! Your details have been submitted successfully." );

    }

}
