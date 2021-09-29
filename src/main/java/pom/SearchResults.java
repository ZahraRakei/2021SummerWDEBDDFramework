package pom;

import baseAPI.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults extends BaseClass {

    @FindBy (css = "div.srp-controls__control.srp-controls__count > h1 > span:nth-child(2)")
    public WebElement searchTermSpan;

    public SearchResults() {
        PageFactory.initElements(driver, this);
    }

    public String getSearchTerm() {
        return searchTermSpan.getText();
    }

}
