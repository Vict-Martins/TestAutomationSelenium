package utils;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import static utils.Browser.driver;

public class BaseActionElement extends BaseTest {
    
    /* 
     * Se determinado elemento estiver visível, método retorna true, se não, retorna false.
    */
    public boolean isElementExisting( WebElement element ) {

        try {

            element.isDisplayed();
            return true;

        } catch( NoSuchElementException e ) {

            return false;

        }

    }

    /*
     *Confirma se a mensagem está contida em determinado elemento.  
    */
    public boolean returnMessage( WebElement element, String message ) {

        try {

            assertTrue( element.getText().contains( message ) );
            return true;

        } catch( NoSuchElementException e ) {

            return false;
            
        }

    }

    /* 
     * Confirma se determinada cadeia de caracteres está contigo na estrutura html. 
    */
    public boolean returnElementExistingInHtml( String Element ) {

        try {

            assertTrue( driver.getPageSource().contains( Element ) );
            return true;

        } catch( NoSuchElementException e ) {

            return false;
            
        }

    }

}