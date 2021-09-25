package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage //extends BaseTest
{

    //<properties>
    //        <maven.compiler.source>15</maven.compiler.source>
    //        <maven.compiler.target>15</maven.compiler.target>
    //    </properties> This is for backup as deleted from pom
    WebDriver driver;

    @FindBy(id="gender-male")
    public WebElement maleRadioButton;
    @FindBy(id="gender-female")
    public WebElement femaleRadioButton;

    @FindBy(id = "FirstName")
    public WebElement firstname;

    @FindBy(id = "LastName")
    public WebElement lastname;

    @FindBy(name = "DateOfBirthDay")
    public WebElement dayofbirth;

    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement psswrd;
    @FindBy(id = "ConfirmPassword")
    public WebElement confmpsswrd;
    @FindBy(id = "register-button")
    public WebElement register;
    @FindBy(css = "div.result")
    public WebElement conftext;

    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

//action

    public void clickmaleradiobutton()
    {
        maleRadioButton.click();
    }
    public void clickfemaleradiobutton()
    {
        femaleRadioButton.click();
    }


    public void enterFirstname(String fn)

    {
        firstname.sendKeys("fn");
    }
    public void enterlastName(String ln)


    {
        lastname.sendKeys("ln");
    }

    public void enteremail(String Email)

    {
        email.sendKeys("Email");
    }

    public void selectdateofbirth(String date)
    {
        Select select=new Select(dayofbirth);
        select.selectByValue(date);
    }



    public void enterpassword(String Password)

    {
        psswrd.sendKeys("Password");
    }
    public void enterconfirmpassword(String ConfirmPassword)

    {
        confmpsswrd.sendKeys("ConfirmPassword");
    }

    public void clickonregister()

    {
        register.click();
    }
  public String confmessage()
    {
      return conftext.getText();
    }


public String getPageTitle()
        
{
    return driver.getTitle();
}




}
