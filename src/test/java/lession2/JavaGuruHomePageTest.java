package lession2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This test is opening JavaGuru home page
 */
public class JavaGuruHomePageTest {
    private static final By QA_COURSE_PAGE_LINK = By.xpath(".//span[text()='Курс Тестирования(QA)']");

    private String HOME_PAGE = "http://javaguru.lv";

    @Test
    public void myFirstTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
        WebElement articleTitle = driver.findElement(By.id("id"));
        WebElement qaLink = driver.findElement(QA_COURSE_PAGE_LINK);
        qaLink.click();
        Assert.assertEquals("Title is wrong!","Ushakov privet!", articleTitle.getText());
    }

    @Test
    public void secondTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
        //........
    }

    @Test
    public void thirdTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
        //........
    }

}
