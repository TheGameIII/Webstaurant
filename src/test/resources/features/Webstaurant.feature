
@regression
Feature: Assignment

 @regression 
  Scenario: Checking search results
    Given Go to 'webstaurantstore website'
    When Search for 'string'
    Then Check the search result ensuring every product item has the word 'Table' its title.
    And Add the last of found items to Cart.
    Then Empty Cart.

