package biz.stevens.test.google;

import biz.stevens.page.google.ResultPage;
import biz.stevens.page.google.SearchPage;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class BasicTest {
    SearchPage searchPage;
    ResultPage resultPage;

    @BeforeClass
    public static void setBrowser() {
        System.setProperty("selenide.browser", "Chrome");
    }

    @Before
    public void setup() {
        searchPage = page(SearchPage.class);
        resultPage = page(ResultPage.class);
        open("http://www.google.com");
    }

    @Test
    public void simpleSearch() {
        searchPage.search("Robert Stevens");
        Selenide.sleep(1000);
        resultPage.getResults().forEach(System.out::println);
    }
}
