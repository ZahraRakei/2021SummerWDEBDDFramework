Feature: As a user, I should be able to search for an item on the ebay homepage

  Scenario: User should be able to enter valid search term and click the search button
    Given user is at Ebay homepage
    When user enters a search term in the search bar
    And user selects category from dropdown
    And user clicks the search button
    Then user should be navigated to search results page
