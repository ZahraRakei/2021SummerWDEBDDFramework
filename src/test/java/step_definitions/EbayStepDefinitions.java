package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pom.Homepage;
import pom.SearchResultsPage;

public class EbayStepDefinitions {

    SharedStepsUI sharedStepsUI;
    Homepage homepage;
    SearchResultsPage searchResultsPage;

    public EbayStepDefinitions() {
        sharedStepsUI = new SharedStepsUI();
        homepage = new Homepage();
        searchResultsPage = new SearchResultsPage();
    }

    @Given("user is at Ebay homepage")
    public void user_is_at_ebay_homepage() {
        sharedStepsUI.navigateToEbayApplication();
    }

    @When("user enters a search term in the search bar")
    public void user_enters_a_search_term_in_the_search_bar() {
        sharedStepsUI.sendKeysToSearchBox("Playstation 5");
    }

    @When("user selects category from dropdown")
    public void user_selects_category_from_dropdown() {
        sharedStepsUI.selectCategoryByVisibleText("Video Games & Consoles");
    }

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {
        sharedStepsUI.clickSearchButton();
    }

    @Then("user should be navigated to search results page")
    public void user_should_be_navigated_to_search_results_page() {
        searchResultsPage = sharedStepsUI.clickSearchButton();

        Assert.assertEquals("Playstation 5".toLowerCase(), searchResultsPage.getSearchTerm().toLowerCase());
    }

}
