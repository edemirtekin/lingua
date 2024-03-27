import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LangTest {


    @Test
    public void test01() {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.patika.dev/");

        WebElement languageBar = driver.findElement(By.xpath("//*[@class='languagedropdowntoggle w-dropdown-toggle']"));
        languageBar.click(); // click language bar

        WebElement english = driver.findElement(By.xpath("//a[@hreflang='en']"));
        english.click(); // select EN

        WebElement headText = driver.findElement(By.xpath("//*[@class='herotext']")); // any text on site you want
        System.out.println(headText.getText());

        String actualLang = TextToLangMethod.getLanguage(headText.getText());
        String expectedLang = "ENGLISH"; // e.g.: ENGLISH, FRENCH, GERMAN, SPANISH, TURKISH

        Assert.assertEquals(actualLang,expectedLang);

        //driver.quit();
    }
}
