import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSample {

    protected static WebDriver driver;
    protected static final String sampleBankBaseURL = "http://localhost:8080/samplebank/index";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL383600\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(sampleBankBaseURL);

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("admin");

        driver.findElement(By.className("sb-button")).click();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        //System.out.println("tearDownAdterClass");

        driver.close();
        driver.quit();
    }

    @Before
    public void setUp() throws Exception
    {
        System.out.println("setUp");
    }

    @After
    public void tearDown()throws Exception
    {
        System.out.println("tearDown");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

}
