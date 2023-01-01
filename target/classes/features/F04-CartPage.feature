@smoke
Feature: shopping Cart Page
  Scenario: user go to cart page
    Given user go to login page
    And user enter valid email
    And user enter valid password
    Then user click on login button
    Given user click on shopping cart
    And user accept the terms
    Then user check out the order