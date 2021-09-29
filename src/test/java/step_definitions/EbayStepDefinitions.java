package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pom.DealsPage;
import pom.DealsSearchResultsPage;
import pom.Homepage;
import pom.SearchResultsPage;

public class EbayStepDefinitions {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    SearchResultsPage searchResultsPage;
    DealsPage dealsPage;
    DealsSearchResultsPage dealsSearchResultsPage;

    public EbayStepDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        searchResultsPage = new SearchResultsPage();
        dealsPage = new DealsPage();
        dealsSearchResultsPage = new DealsSearchResultsPage();
    }

    @Given("user is at Ebay homepage")
    public void user_is_at_ebay_homepage() {
        sharedStepsUI.navigateToEbayApplication();
    }

    @When("user enters a {string} in the search bar")
    public void user_enters_a_search_term_in_the_search_bar(String searchTerm) {
        sharedStepsUI.sendKeysToSearchBox(searchTerm);
    }

    @When("user selects {string} from dropdown")
    public void user_selects_category_from_dropdown(String category) {
        sharedStepsUI.selectCategoryByVisibleText(category);
    }

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {
        sharedStepsUI.clickSearchButton();
    }

    @When("user clicks on the Deals button")
    public void userClicksOnTheDealsButton() {
        homepage.navigateToDealsPage();
    }

    @Then("user should be navigated to search results page and {string} should be displayed")
    public void user_should_be_navigated_to_search_results_page_and_search_term_should_be_displayed(String searchResult) {
        Assert.assertEquals(searchResult.toLowerCase(), searchResultsPage.getSearchTerm().toLowerCase());
    }

    @Then("user should be navigated to deals search results page and {string} should be displayed")
    public void userShouldBeNavigatedToDealsSearchResultsPageAndShouldBeDisplayed(String searchTerm) {
        Assert.assertEquals(searchTerm.toLowerCase(), dealsSearchResultsPage.getSearchTerm().toLowerCase());
    }
}
