package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseActionElement;
import utils.Browser;
import static utils.Browser.driver;

public class CasesPage extends BaseActionElement {

    @FindBy( css = "a[href='/test_cases']" )
    private WebElement btnTestCases;

    @FindBy( id = "aswift_5" )
    private WebElement iframeAd;

    @FindBy( id = "ad_iframe" )
    private WebElement iframe2;
    
    public void selectIframe() throws InterruptedException {

        delay( 2 );
        driver.switchTo().frame( iframeAd );
        delay( 2 );
        driver.switchTo().frame( iframe2 );

    }

    public void pressBtnTestCases() { 
        
        Actions action = new Actions( driver );
        action.moveToElement( btnTestCases ).click().build().perform();

    }

    public CasesPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }
    
}
