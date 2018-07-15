package biz.stevens.page.google;

import biz.stevens.object.google.SearchObjects;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.page;

public class SearchPage {
    private SearchObjects searchObjects;

    public SearchPage() {
        searchObjects = page(SearchObjects.class);
    }

    public void search(String keyword) {
        searchObjects.getSearchBox().sendKeys(keyword);
        searchObjects.getSearchBox().sendKeys(Keys.ENTER);
    }
}
