package step_definitions;

import baseAPI.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pom.Homepage;
import pom.SearchResults;

public class SearchSteps extends BaseClass {

    Homepage homepage;
    SearchResults searchResults;

    @Before
    public void setUp() {
        setUp("Chrome", "https://ebay.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Given("user is at Ebay homepage")
    public void user_is_at_ebay_homepage() {
        driver.get("https://ebay.com");
    }

    @When("user enters a search term in the search bar")
    public void user_enters_a_search_term_in_the_search_bar() {
        homepage = new Homepage();
        homepage.sendKeysToSearchBox("Playstation 5");
    }

    @When("user selects category from dropdown")
    public void user_selects_category_from_dropdown() {
        homepage = new Homepage();
        homepage.selectCategoryByVisibleText("Video Games & Consoles");
    }

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {
        homepage = new Homepage();
        homepage.clickSearchButton();
    }

    @Then("user should be navigated to search results page")
    public void user_should_be_navigated_to_search_results_page() {
        homepage = new Homepage();
        searchResults = homepage.clickSearchButton();

        Assert.assertEquals("Playstation 5".toLowerCase(), searchResults.getSearchTerm().toLowerCase());
    }

}
