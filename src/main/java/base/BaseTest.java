package base;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;



public class BaseTest {

    public static WebDriver driver ;//object of webdriver step 1
   public static HomePage homePage;
  public static LoginPage loginpage;//object of pom
  public static RegisterPage registerPage;
@Before
 public static void Setup() throws InterruptedException {

    WebDriverManager.chromedriver().setup();//step 2
    driver =new ChromeDriver();//step 3
    driver.manage().window().maximize();//step 4
    homePage=new HomePage(driver);//Initalization of homepage to line no 21
    loginpage=new LoginPage(driver);
  registerPage=new RegisterPage(driver);
    }
    @After
    public static void tearDown() throws InterruptedException {

       driver.quit();

    }





}
