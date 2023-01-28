package tests;

import org.junit.Test;

import pageobjects.LinksPage;
import utils.BaseTest;

public class LinksTest extends BaseTest {

    private final LinksPage link = new LinksPage();

    @Test
    public void menuSolutionsTest() {

        link.pressMenuSolutions();
        ckeckUrl( "/parabank/index.htm" );

    }

    @Test
    public void menuAboutUsTest() {

        link.pressMenuAboutUs();
        ckeckUrl( "/parabank/about.htm" );

    }

    @Test
    public void menuServicesTest() {

        link.pressMenuServices();
        ckeckUrl( "/parabank/services.htm" );

    }

    @Test
    public void menuProductTest() {

        link.pressMenuProduct();
        ckeckUrl( "parasoft.com/products/" );

    }

    @Test
    public void menuLocationsTest() {

        link.pressMenuLocation();
        ckeckUrl( "parasoft.com/solutions/" );

    }

    @Test
    public void menuAdminTest() {

        link.pressMenuAdmin();
        ckeckUrl( "/parabank/admin.htm" );

    }

    @Test
    public void footerHomeTest() {

        link.pressFooterHome();
        ckeckUrl( "/parabank/index.htm" );

    }

    @Test
    public void footerAboutTest() {

        link.pressFooterAbout();
        ckeckUrl( "/parabank/about.htm" );

    }

    @Test
    public void footerServicesTest() {

        link.pressFooterServices();
        ckeckUrl( "/parabank/services.htm" );

    }

    @Test
    public void footerProductsTest() {

        link.pressFooterProduct();
        ckeckUrl( "parasoft.com/products/" );

    }

    @Test
    public void footerLocationTest() {

        link.pressFooterLocation();
        ckeckUrl( "parasoft.com/solutions/" );

    }
    
    @Test
    public void footerForumsTest() {

        link.pressFooterForums();
        ckeckUrl( "forums.parasoft.com/" );

    }

    @Test
    public void footerSiteMapTest() {

        link.pressFooterSiteMap();
        ckeckUrl( "/parabank/sitemap.htm" );

    }

    @Test
    public void footerContactUsTest() {

        link.pressFooterContactUs();
        ckeckUrl( "/parabank/contact.htm" );

    }
    
}
