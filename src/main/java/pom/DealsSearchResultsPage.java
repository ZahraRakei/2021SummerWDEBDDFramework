package pom;

import baseAPI.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsSearchResultsPage extends BaseClass {

    @FindBy (css = "div.sections-container > div div.ebayui-spoke-subtitle span > span")
    public WebElement searchTermSpan;

    public DealsSearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSearchTerm() {
        return searchTermSpan.getText();
    }

}
