package pom;

import baseAPI.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends BaseClass {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "gh-ac")
    public WebElement searchBox;

    @FindBy (id = "gh-cat")
    public WebElement categoryComboBox;

    @FindBy (id = "gh-btn")
    public WebElement searchButton;



    public void sendKeysToSearchBox(String searchTerm) {
        searchBox.sendKeys(searchTerm);
    }

    public void selectCategoryByVisibleText(String visText) {
        Select select = new Select(categoryComboBox);

        select.selectByVisibleText(visText);
    }

    public SearchResults clickSearchButton() {
        searchButton.click();

        return new SearchResults();
    }


}
