package step_definitions;

import baseAPI.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pom.Homepage;
import pom.SearchResultsPage;

public class SharedStepsUI extends BaseClass {

    @FindBy(id = "gh-ac")
    public WebElement searchBox;

    @FindBy (id = "gh-cat")
    public WebElement categoryComboBox;

    @FindBy (id = "gh-btn")
    public WebElement searchButton;

    public SharedStepsUI() {
        PageFactory.initElements(driver, this);
    }

    @Before
    public void setUp() {
        String browser = "Chrome";
        setUp(browser);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    public Homepage navigateToEbayApplication() {
        String url = "https://ebay.com";
        driver.get(url);

        return new Homepage();
    }

    public void sendKeysToSearchBox(String searchTerm) {
        searchBox.sendKeys(searchTerm);
    }

    public void selectCategoryByVisibleText(String visText) {
        Select select = new Select(categoryComboBox);

        select.selectByVisibleText(visText);
    }

    public SearchResultsPage clickSearchButton() {
        searchButton.click();

        return new SearchResultsPage();
    }

}
