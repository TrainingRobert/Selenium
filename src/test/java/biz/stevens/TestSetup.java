package biz.stevens;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestSetup {

    @Test
    public void setupTest() {
        System.setProperty("selenide.browser", "Chrome");
        open("http://google.com");
        String title = Selenide.title();
        assert title.contains("Google");
    }

}
