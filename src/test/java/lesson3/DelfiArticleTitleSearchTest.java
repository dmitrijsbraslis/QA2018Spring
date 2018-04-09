package lesson3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ArticlePage;
import pages.BaseFunc;
import pages.HomePage;

import java.util.List;

import static org.junit.Assert.*;

public class DelfiArticleTitleSearchTest {
    private BaseFunc baseFunc = new BaseFunc();

    private static final String TITLE = "Rimšēvičam jānoliek pilnvaras, paziņo Reizniece-Ozola";
    private static final String MAIN_PAGE_WEB_URL = "http://www.delfi.lv/";
    private static final String MAIN_PAGE_MOBILE_URL = "http://m.delfi.lv/";


    @Test
    public void articleTitleSearchTest() {
//       Open main page of the Web version
        baseFunc.goToUrl(MAIN_PAGE_WEB_URL);

        HomePage homePage = new HomePage(baseFunc);

//       Find all titles and add them to a list
        List<WebElement> articleTitles = homePage.getAllTitles();

//       Check if list is not empty
        assertFalse("Title list is empty", articleTitles.isEmpty());

//      Go to the first article page
        ArticlePage articlePage = homePage.goToFirstArticle();




//       Go through a list and getText() from WebElement
        boolean isTitlePresent = false;

        for (WebElement articleTitle : articleTitles) {
//          Compare every String element to TITLE variable
            if (articleTitle.getText().equals(TITLE)) {
//              Exit loop in case if TITLE is present
                isTitlePresent = true;
                break;
            }
        }

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(Expe)

//       If we don't find element that matches TITLE - Display message "Article not found"
        assertTrue("Article is not found", isTitlePresent);

//       Open main page of the Mobile version
//       Find all titles and add them to a list
//       Check if list is not empty
//       Go through a list and getText() from WebElement
//       Exit loop in case if TITLE is present
//       Compare every String element to TITLE variable
//       If we don't find element that matches TITLE - Display message "Title not found"
//       Close browser window
    }
}
