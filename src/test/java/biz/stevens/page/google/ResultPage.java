package biz.stevens.page.google;

import biz.stevens.object.google.ResultObjects;
import com.codeborne.selenide.SelenideElement;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.page;

public class ResultPage {
    private ResultObjects resultObjects;

    public ResultPage() {
        resultObjects = page(ResultObjects.class);
    }

    public List<String> getResults() {
        System.out.println(resultObjects.getResultList().size());
        return resultObjects.getResultList().stream().map(SelenideElement::getText).collect(Collectors.toList());
    }

    public void openLink(int index) {
        resultObjects.getResultList().get(index).click();
    }

    public void openLink(String result) {
        openLink(getResults().indexOf(result));
    }

}
