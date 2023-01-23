package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.PhoneNumber;

import utils.BaseActionElement;
import utils.Browser;

public class RegisterPage extends BaseActionElement {

    @FindBy( id = "customer.firstName" )
    private WebElement inputFirstName;

    @FindBy( id = "customer.lastName" )
    private WebElement inputLastName;

    @FindBy( id = "customer.address.street" )
    private WebElement inputAddress;

    @FindBy( id = "customer.address.city" )
    private WebElement inputCity;

    @FindBy( id = "customer.address.state" )
    private WebElement inputState;

    @FindBy( id = "customer.address.zipCode" )
    private WebElement inputZipCode;

    @FindBy( id = "customer.phoneNumber" )
    private WebElement inputPhone;

    @FindBy( id = "customer.ssn" )
    private WebElement inputSsn;

    @FindBy( id = "customer.username" )
    private WebElement inputUserName;

    @FindBy( id = "customer.password" )
    private WebElement inputPassword;

    @FindBy( id = "repeatedPassword" )
    private WebElement inputRepeatPassword;

    @FindBy( css = "input[value='Register']" )
    private WebElement btnRegister;

    public void fillInputFirstName( String first ) {

        inputFirstName.sendKeys( first );

    }

    public void fillInputLastName( String last ) {

        inputLastName.sendKeys( last );

    }

    public void fillInputAddress( String address ) {

        inputAddress.sendKeys( address );

    }

    public void fillInputCity( String city ) {

        inputCity.sendKeys( city );

    }

    public void fillInputState( String state ) {

        inputState.sendKeys( state );

    }

    public void fillInputZipCode( String zipcode ) {

        inputZipCode.sendKeys( zipcode );

    }

    public void fillInputPhone( String phone ) {

        inputPhone.sendKeys( phone );

    }

    public void fillInputSsn( String ssn ) {

        inputSsn.sendKeys( ssn );

    }

    public void fillInputUserName( String username ) {

        inputUserName.sendKeys( username );

    }

    public void fillInputPassword( String password, String repeatPassword ) {

        inputPassword.sendKeys( password );
        inputRepeatPassword.sendKeys( repeatPassword );

    }

    public void pressBtnRegister() {

        btnRegister.click();

    }

    public void fillRegister( String firstname, String lastname, String address, String city, String state, String zipcode, String phone, String ssn, String username, String password ) {

        inputFirstName.sendKeys( firstname );
        inputLastName.sendKeys( lastname );
        inputAddress.sendKeys( address );
        inputCity.sendKeys( city );
        inputState.sendKeys( state );
        inputZipCode.sendKeys( zipcode );
        inputPhone.sendKeys( phone );
        inputSsn.sendKeys( ssn );
        inputUserName.sendKeys( username );
        inputPassword.sendKeys( password );
        inputRepeatPassword.sendKeys( password );
        btnRegister.click();

    }

    public RegisterPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }
    
}
