package biz.stevens.object.google;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultObjects {
    private static final String RESULT_CONTAINER_XPATH = "//div[@class='srg']";
    private static final String RESULT_LINK_XPATH = ".//h3[@class='r']/a";

    @FindBy(xpath = RESULT_CONTAINER_XPATH)
    private SelenideElement resultContainer;

    private By resultLinkBy = By.xpath(RESULT_LINK_XPATH);

    public List<SelenideElement> getResultList() {
        return resultContainer.findAll(resultLinkBy);
    }
}
