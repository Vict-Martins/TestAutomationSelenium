package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseActionElement;
import utils.Browser;
import static utils.Browser.driver;

public class RegisterPage extends BaseActionElement {

    @FindBy( xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a" )
    private WebElement btnSignIn;

    @FindBy( css = ".signup-form > form:nth-child(2) > input:nth-child(2)" )
    private WebElement inputName;

    @FindBy( css = ".signup-form > form:nth-child(2) > input:nth-child(3)" )
    private WebElement inputEmail;

    @FindBy( css = "button.btn:nth-child(5)" )
    private WebElement btnSignUp;

    @FindBy( css = "div.radio-inline:nth-child(3) > label:nth-child(1)")
    private WebElement labelTitle;

    @FindBy( css = "#password")
    private WebElement inputPassword;

    @FindBy( css = "#days")
    private WebElement selectDay;

    @FindBy( css = "#months")
    private WebElement selectMonths;

    @FindBy( css = "#years")
    private WebElement selectYears;

    @FindBy( css = "#first_name" )
    private WebElement inputFirstName;

    @FindBy( css = "#last_name" )
    private WebElement inputLastName;

    @FindBy( css = "#company" )
    private WebElement inputCompany;

    @FindBy( css = "#address1")
    private WebElement inputAddress;

    @FindBy( css = "#address2" )
    private WebElement inputAddress2;

    @FindBy( css = "#country" )
    private WebElement selectCountry;

    @FindBy( css = "#state" )
    private WebElement inputState;

    @FindBy( css = "#city" )
    private WebElement inputCity;

    @FindBy( css = "#zipcode" )
    private WebElement inputZipCode;

    @FindBy( css = "#mobile_number" )
    private WebElement inputMobileNumber;

    @FindBy( css = "button.btn:nth-child(22)" )
    private WebElement btnCreateAccount;

    @FindBy( xpath = "//*[@id=\"form\"]/div/div/div/div" )
    private WebElement btnContinue;

    @FindBy( id= "aswift_2" )
    private WebElement iframeAd;

    @FindBy( id= "ad_iframe" )
    private WebElement iframe2;

    @FindBy( id = "dismiss-button" )
    private WebElement btnClosed;

    @FindBy( xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a" )
    private WebElement btnDeleteAccount;

    @FindBy( xpath = "//*[@id=\"form\"]/div/div/div/h2/b" )
    private WebElement msgDeleteAccountValidator;

    public void pressBtnSignIn() { btnSignIn.click(); }

    public void fillNewUserSignUp( String name, String email ) {

        inputName.sendKeys( name );
        inputEmail.sendKeys( email );
        btnSignUp.click();

    }

    public void pressLabelTitle(){ labelTitle.click(); }

    public void fillInputPassword( String text ) {

        inputPassword.sendKeys( text );
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,250)", "");

    }

    public void selectDate( int day, int months, String year ) throws InterruptedException {

        Select selectD = new Select( selectDay );
        selectD.selectByIndex( day );
        delay( 1 );
        Select selectM = new Select( selectMonths );
        selectM.selectByIndex( months );
        delay( 1 );
        Select selectY = new Select( selectYears );
        selectY.selectByValue( year );
        delay( 1 );

    }

    public void fillName( String first, String last) throws InterruptedException {

        inputFirstName.sendKeys( first );
        delay(1);
        inputLastName.sendKeys( last );

    }

    public void fillCompany( String text ) { inputCompany.sendKeys( text ); }

    public void fillAddress( String one, String two) throws InterruptedException {

        inputAddress.sendKeys( one );
        delay( 1 );
        inputAddress2.sendKeys( two );

    }

    public void fillCountry( String country ) {

        Select select = new Select( selectCountry );
        select.selectByValue( country );

    }

    public void fillInputState( String text ){ inputState.sendKeys( text ); }

    public void fillCity( String text ){ inputCity.sendKeys( text ); }

    public void fillZipCode( String text ){ inputZipCode.sendKeys( text ); }

    public void fillMobileNumber( String number ) {

        inputMobileNumber.sendKeys( number );
        btnCreateAccount.click();

    }

    public void pressBtnContinue() throws InterruptedException {

        delay( 1 );
        btnContinue.click();

    }

    public void selectIframe() throws InterruptedException {

        delay( 1 );
        driver.switchTo().frame( iframeAd );
        delay( 1 );
        driver.switchTo().frame( iframe2 );

    }

    public void pressBtnClosed() throws InterruptedException {

        delay( 1 );
        btnClosed.click();

    }

    public void pressBtnDeleteAccount() throws InterruptedException {

        delay( 1 );
        btnDeleteAccount.click();


    }

    public boolean returnMsgDeleteAccount( String text ) {

       return returnMessage( msgDeleteAccountValidator, text );

    }

    public RegisterPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }
    
}
