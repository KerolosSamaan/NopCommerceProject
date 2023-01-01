@smoke
Feature: checkout page
  Scenario: user checkout the order

    Given user go to login page
    And user enter valid email
    And user enter valid password
    Then user click on login button
    Given user click on shopping cart
    And user accept the terms
    Then user check out the order
    And user choose the country
    And user choose the state
    And user enter the city name
    And user enter address 1
    And user enter postal code
    And user enter phone number
    Then user click on continue button
    And user click on continue1 button
    And user click on continue2 button
    And user click on continue3 button
    Then user click on confirm button