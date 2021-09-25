import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("I navigate to url {string}")
    public void iNavigateToUrl(String url)

    {
        BaseTest.homePage.navigatetoUrl(url);
    }

    @Then("I should be navigate to home page")
    public void iShouldBeNavigateToHomePage()
    {
        String HomepageTitle= BaseTest.registerPage.getPageTitle();
        System.out.println("HomepageTitle");
    }


    @When("I click on login link from the navbar")
    public void iClickOnLoginLinkFromTheNavbar()
    {
        BaseTest.homePage.clickLoginlink();
    }

    @Then("I should be navigate to login page")
    public void iShouldBeNavigateToLoginPage()
    {
        BaseTest.homePage.pageReferesh();
       String LoginPageTitle= BaseTest.registerPage.getPageTitle();
        System.out.println("LoginPageTitle");
    }



    @And("I enter password as {string}")
    public void iEnterPasswordAs(String arg0)
    {
        BaseTest.loginpage.enterpassword("passwrd");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        BaseTest.loginpage.clickLoginButton();
    }

    @Then("I should be login successfully")
    public void iShouldBeLoginSuccessfully()
    {
        String LoginPageTitle= BaseTest.registerPage.getPageTitle();
        System.out.println("LoginPageTitle");
    }


    @Then("I should be navigate to nop site")
    public void iShouldBeNavigateToNopSite()
    {
       String homepageTitle= BaseTest.registerPage.getPageTitle();
        System.out.println("homePageTitle");
    }

    @When("I click on register link")
    public void iClickOnRegisterLink()
    {
        BaseTest.homePage.clickregisterLink();
    }

    @Then("I should be navigate to register page")
    public void iShouldBeNavigateToRegisterPage()
    {
       String registerPageTitle= BaseTest.registerPage.getPageTitle();
        System.out.println("registerPageTitle");
    }

    @And("I select my gender as Female")
    public void iSelectMyGenderAsFemale()
    {
        BaseTest.registerPage.clickfemaleradiobutton();
    }


    @And("I enter my First name last name email password and confirm password")
    public void iEnterMyFirstNameLastNameEmailPasswordAndConfirmPassword(String fn,String ln,String Email,String Password,String confirmPassword)
    {
        BaseTest.registerPage.enterFirstname("Fn");
        BaseTest.registerPage.enterlastName("ln");
        BaseTest.registerPage.enteremail("Email");
        BaseTest.registerPage.enterpassword("Password");
        BaseTest.registerPage.enterconfirmpassword("confirmPassword");

    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        BaseTest.registerPage.clickonregister();
    }


    @Then("I should be register sucessfully as a new use]")
    public void iShouldBeRegisterSucessfullyAsANewUse()
    {
       String Confirmtext= BaseTest.registerPage.confmessage();
        System.out.println("Confirmation");
    }






    @When("I enter email {string}")
    public void iEnterEmail(String email) {
        BaseTest.loginpage.enterEmail(email);
    }
}
