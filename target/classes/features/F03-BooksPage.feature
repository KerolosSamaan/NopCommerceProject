@smoke
Feature: books page
  Scenario: user can add book to shopping cart
    Given user go to login page
    And user enter valid email
    And user enter valid password
    Then user click on login button
    Given user click on books icon
    And user sort the result by price from low to high
    Then user add second item to cart




