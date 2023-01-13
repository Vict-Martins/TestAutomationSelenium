package pageobjects;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseActionElement;
import utils.Browser;
import static utils.Browser.driver;;

public class ContactUsPage extends BaseActionElement {

    @FindBy( css = "a[href='/contact_us']" )
    private WebElement btnContactUs;

    @FindBy( css = "input[name='name']" )
    private WebElement inputName;

    @FindBy( css = "input[name='email']" )
    private WebElement inputEmail;

    @FindBy( css = "input[name='subject']" )
    private WebElement inputSubject;

    @FindBy( css = "textarea[data-qa='message']" )
    private WebElement inputTextArea;

    @FindBy( css = "input[name='upload_file']" )
    private WebElement uploadFile;

    @FindBy( css = "input[data-qa='submit-button']" )
    private WebElement btnSubmit;

    @FindBy( css = "div.status.alert" )
    private WebElement msgValidator;

    public void pressBtnContactUs() { btnContactUs.click(); }

    public void fillInputName( String text ) { inputName.sendKeys( text ); }

    public void fillInputEmail( String text ) { inputEmail.sendKeys( text ); }

    public void fillInputSubject( String text ) { inputSubject.sendKeys( text ); }

    public void fillInputTextArea( String text ) { inputTextArea.sendKeys( text ); }

    public void pressUploadFile() throws InterruptedException {

        File file = new File( "public_img\\imagem_coracao.jfif" );
        delay( 2 );
        uploadFile.sendKeys( file.getAbsolutePath() );
       
    }

    public void pressBtnSubmit() {
        
        Actions action = new Actions( driver );
        action.moveToElement( btnSubmit ).click().build().perform();;        

    }

    public void acceptAlert() {

        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    public void returnMsgValidator( String text ) { msgValidator.click(); }

    public ContactUsPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }
    
}
