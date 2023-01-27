package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseActionElement;
import utils.Browser;

public class forgotLoginPage extends BaseActionElement {

    @FindBy( id = "firstName")
    private WebElement inputFirstname;

    @FindBy( id = "lastName")
    private WebElement inputLastName;
    
    @FindBy( id = "address.street")
    private WebElement inputStreet;

    @FindBy( id = "address.city")
    private WebElement inputCity;
    
    @FindBy( id = "address.state")
    private WebElement inputState;

    @FindBy( id = "address.zipCode")
    private WebElement inputZipCode;

    @FindBy( id = "ssn")
    private WebElement inputSsn;
    
    @FindBy( css = "input[value='Find My Login Info']")
    private WebElement btnFind;
    
    public void fillInputFirstName( String text ) {

        inputFirstname.sendKeys( text );

    }

    public void fillInputLastName( String text ) {

        inputLastName.sendKeys( text );

    }

    public void fillInputStreet( String text ) {

        inputStreet.sendKeys( text );

    }

    public void fillInputCity( String text ) {

        inputCity.sendKeys( text );

    }

    public void fillInputState( String text ) {

        inputState.sendKeys( text );

    }

    public void fillInputZipCode( String text ) {

        inputZipCode.sendKeys( text );

    }

    public void fillInputSsn( String text ) {

        inputSsn.sendKeys( text );

    }

    public void pressBtnFind() {

        btnFind.click();

    }

    public forgotLoginPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }
    
}
