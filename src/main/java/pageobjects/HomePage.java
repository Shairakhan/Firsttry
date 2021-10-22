package pageobjects;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
    WebDriverWait wait;

    WebDriver driver;//step 3
    // Web elements step 1 all find by 2step writtem is action ,3step is webdriver will create constutor
    @FindBy(linkText = "Register" )//step 1 the green colour is the value taken for the loactor from the inspect
    public WebElement registerlink;//step 2 the purple one you can give the related name so you can know what it is and it is a webelement

    @FindBy(linkText = "Log in" )
    public WebElement loginlink ;

    @FindBy(className = "ico-wishlist" )
    public WebElement whishlist ;

    @FindBy(className = "ico-cart")
    public WebElement Shoppingcartlink;

    @FindBy(id="small-searchterms")
    public WebElement searchtextbox;

    @FindBy(css = "button.search-box-button")
    public WebElement searchbutton;

    @FindBy(linkText = "Log out")
    public WebElement logoutlink;

    public HomePage(WebDriver driver)//step 4 will create constructor of page inside the bracket calling driver
    {
        this.driver= driver;//step to initalisation of driver
        PageFactory.initElements(driver,this);//Step to initalization of page factory when you type pagefactory dot you get option with two parameterized
    }


    //actions on webelement

    public void InavigatetoUrl(String url)

    {
        driver.navigate().to("url");//Implemengtation of url
    }

    public void clickregisterLink()

    {
        registerlink.click();
    }

    public void clickLoginlink()

    {
        loginlink.click();
    }

    public void clickwhislist()
    {
      whishlist.click();

    }

    public void Shoppingcartlink()

    {
        Shoppingcartlink.click();
    }
    public void entersearhtextbox(String item1)

    {
        searchtextbox.sendKeys(item1);
    }
    public void clicksearchbutton()

    {
        searchbutton.click();
    }
    public void Clicklogoutbutton()
    {
        logoutlink.click();
    }
public void pageReferesh()
{
    driver.navigate().refresh();
}

    public void waitforloginclickable()
    {
        wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(loginlink));
    }

    public void waitforlogoutlickable()
    {
        wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(logoutlink));
    }

    public void navigatetoUrl(String url) {
        driver.navigate().to(url);

        wait=new WebDriverWait(driver,30);
        // wait=new WebDriverWait(driver,30);

    }
}




