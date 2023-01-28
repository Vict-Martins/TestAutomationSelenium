package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseActionElement;
import utils.Browser;


public class LinksPage extends BaseActionElement {

    @FindBy( css = "li[class='Solutions']" )
    private WebElement menuSolutions;

    @FindBy( css = "ul[Class='leftmenu'] > li > a[href*='about']" )
    private WebElement menuAboutUs;

    @FindBy( css = "ul[Class='leftmenu'] > li > a[href*='services']" )
    private WebElement menuServices;

    @FindBy( css = "ul[Class='leftmenu'] > li > a[href*='product']" )
    private WebElement menuProduct;

    @FindBy( css = "ul[Class='leftmenu'] > li > a[href*='contacts.jsp']" )
    private WebElement menuLocations;

    @FindBy( css = "ul[Class='leftmenu'] > li > a[href*='admin']" )
    private WebElement menuAdmin;

    @FindBy( css = "div[id='footerPanel'] > ul > li > a[href*='index']" )
    private WebElement footerHome;

    @FindBy( css = "div[id='footerPanel'] > ul > li > a[href*='about']" )
    private WebElement footerAbout;

    @FindBy( css = "div[id='footerPanel'] > ul > li > a[href*='services']" )
    private WebElement footerServices;

    @FindBy( css = "div[id='footerPanel'] > ul > li > a[href*='products']" )
    private WebElement footerProducts;

    @FindBy( css = "div[id='footerPanel'] > ul > li > a[href*='contacts']" )
    private WebElement footerLocation;

    @FindBy( css = "div[id='footerPanel'] > ul > li > a[href*='forums']" )
    private WebElement footerForums;

    @FindBy( css = "div[id='footerPanel'] > ul > li > a[href*='sitemap']" )
    private WebElement footerSiteMap;

    @FindBy( css = "div[id='footerPanel'] > ul > li > a[href*='contact.htm']" )
    private WebElement footerContactUs;

    public void pressMenuSolutions() { menuSolutions.click(); }

    public void pressMenuAboutUs() { menuAboutUs.click(); }

    public void pressMenuServices() { menuServices.click(); }

    public void pressMenuProduct() { menuProduct.click(); }

    public void pressMenuLocation() { menuLocations.click(); }

    public void pressMenuAdmin() { menuAdmin.click(); }

    public void pressFooterHome() { footerHome.click(); }

    public void pressFooterAbout() { footerAbout.click(); }

    public void pressFooterServices() { footerServices.click(); }

    public void pressFooterProduct() { menuProduct.click(); }

    public void pressFooterLocation() { footerLocation.click(); }

    public void pressFooterForums() { footerForums.click(); }

    public void pressFooterSiteMap() { footerSiteMap.click(); }

    public void pressFooterContactUs() { footerContactUs.click(); }

    public LinksPage() { PageFactory.initElements( Browser.getCurrentDriver(), this ); }

}
