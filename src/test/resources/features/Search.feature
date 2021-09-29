Feature: As a user, I should be able to search for an item on the Ebay application

  Background:
    Given user is at Ebay homepage

  @Homepage
  Scenario Outline: User should be able to enter valid search term and search for an item from Homepage
    When user enters a "<search term>" in the search bar
    And user selects "<category>" from dropdown
    And user clicks the search button
    Then user should be navigated to search results page and "<search term>" should be displayed

    Examples:
      | search term    |           category              |
      | Playstation 5  |      Video Games & Consoles     |
      | Hand Sanitizer |        Health & Beauty          |
      | iPhone 13      |    Cell Phones & Accessories    |
      | Ford Mustang   |          eBay Motors            |

  @Deals
  Scenario Outline: User should be able to enter valid search term and search for an item from the Deals Page
    When user clicks on the Deals button
    And user enters a "<search term>" in the search bar
    And user clicks the search button
    Then user should be navigated to deals search results page and "<search term>" should be displayed

    Examples:
      | search term    |
      | Playstation 5  |
      | Hand Sanitizer |
      | iPhone 13      |
      | Ford Mustang   |

#  Scenario: User should be able to enter valid search term and search for an item from the Electronics Page
#    Given user is at Ebay homepage
#    When user clicks on the Electronics button
#    And user enters a search term in the search bar
#    And user clicks the search button
#    Then user should be navigated to search results page
