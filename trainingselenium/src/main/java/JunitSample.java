import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JunitSample {

    protected static WebDriver driver;
    protected static final String sampleBankBaseURL = "http://localhost:8080/samplebank/index";

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("setUpBeforeClass");


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
        System.out.println("tearDownAfterClass");

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
    public void logInTest(){
        System.out.println("Able to login");
        Assert.assertEquals("Error logging in","Welcome, admin (logout)", driver.findElement(By.id("sb-username")).getText());

    }

    @Test
    public void createAccountTest() throws InterruptedException {
        System.out.println("Create Account");

        driver.findElement(By.xpath("//*[@href='addAccount']")).click();
        driver.findElement(By.id("ownerCpf")).sendKeys("12345678910");

        driver.findElement(By.xpath("//*[@value='Create Account']")).click();

        Assert.assertEquals("Error Creating Account","Operation completed with success", driver.findElement(By.id("sb-return-message")).getText());
    }

    @Test
    public void makeDepositTest(){
        System.out.println("Make Deposit");
        driver.findElement(By.xpath("//*[@href='deposit']")).click();
        Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        drpAccount.selectByVisibleText("17891023564");
        driver.findElement(By.id("ammount")).sendKeys("100000");
        driver.findElement(By.xpath("//*[@value='Deposit']")).click();

        Assert.assertEquals("Error Making a Deposit","Operation completed with success", driver.findElement(By.id("sb-return-message")).getText());

    }

    @Test
    public void makeWithdrawTest(){
        System.out.println("Make Withdraw");
        driver.findElement(By.xpath("//*[@href='withdraw']")).click();
        Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        drpAccount.selectByVisibleText("17891023564");
        driver.findElement(By.id("ammount")).sendKeys("20000");
        driver.findElement(By.xpath("//*[@value='Withdraw']")).click();
        Assert.assertEquals("Error Making a Withdraw","Operation completed with success", driver.findElement(By.id("sb-return-message")).getText());

    }

    // Fazer TRANSFER

    @Test
    public void makeTranferTest() throws InterruptedException {
        System.out.println("Make Transfer");
        driver.findElement(By.xpath("//*[@href='transfer']")).click();
        Select originAccount = new Select(driver.findElement(By.id("sourceAccount")));
        originAccount.selectByVisibleText("17891023564");
        Select destinyAccount = new Select(driver.findElement(By.id("targetAccount")));
        destinyAccount.selectByVisibleText("01234567891");
        driver.findElement(By.id("ammount")).sendKeys("30000");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@value='Transfer']")).click();
        Assert.assertEquals("Error Making a Withdraw","Operation completed with success", driver.findElement(By.id("sb-return-message")).getText());

    }
}
