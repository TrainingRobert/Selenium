package biz.stevens.object.google;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchObjects {
    @FindBy(name = "q")
    private SelenideElement searchBox;
}
