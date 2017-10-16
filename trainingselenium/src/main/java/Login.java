import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

    public static void main(String[] args) throws InterruptedException {

        // ctrol + alt + l

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AL383600\\Desktop\\chromedriver.exe");
        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("http://localhost:8080/samplebank/index");

        //WebElement username = driver.findElement(By.id("username")).sendKeys("admin");
        //WebElement password = driver.findElement(By.id("password")).sendKeys("admin");

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");

        driver.findElement(By.className("sb-button")).click();

        //driver.findElement(By.id("sb-username"));
        Assert.assertEquals("Welcome, admin (logout)", driver.findElement(By.id("sb-username")).getText());

        // ou xpath sempre caminho relativo
        //driver.findElement(By.xpath("//*[@value='Login']")).click();

        //Chegar na pagina Add Account

        driver.findElement(By.xpath("//*[@href='addAccount']")).click();

        //Input do Add Account
        driver.findElement(By.id("ownerCpf")).sendKeys("12345678910");

        driver.findElement(By.xpath("//*[@value='Create Account']")).click();

        //Verificar se criou conta
        Assert.assertEquals("Sucess","Operation completed with success", driver.findElement(By.id("sb-return-message")).getText());

        driver.findElement(By.xpath("//*[@href='deposit']")).click();

        Select drpAccount = new Select(driver.findElement(By.id("targetAccount")));
        drpAccount.selectByVisibleText("17891023564");
        Thread.sleep(5000);

        driver.findElement(By.id("ammount")).sendKeys("10000");
        driver.findElement(By.xpath("//*[@value='Deposit']")).click();


        Assert.assertEquals("Erro ao logar?","Operation completed with success" , driver.findElement(By.id("sb-return-message")).getText());

        Thread.sleep(5000);

        driver.close();
        driver.quit();


    }
}
