package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage //extends BaseTest
{
    WebDriver driver;
    WebDriverWait wait;

   @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement paswd;
    @FindBy(linkText = "Log in")
   public WebElement loginbutton;

    public LoginPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //action
    public void enterEmail(String em)// throws InterruptedException//This is called as utilites
    {
        email.sendKeys(em);
    }

    public void enterpassword(String passwrd)

    {
        paswd.sendKeys(passwrd);
    }
    public void clickLoginButton ()

    {
        loginbutton.click();
    }
}




