@smoke
Feature: register page
  Scenario: user go to register page
    Given user click on register icon
    And user choose gender type
    And user enter first name
    And user enter last name
    And user choose birthday
    And user choose birth month
    And user choose birth year
    And user enter email address
    And user enter company name
    And user check newsletter
    And user enter password
    And user enter confirm password
    Then user click on register button
