@smoke
  Feature: login
    Scenario: user can login
      Given user go to login page
      And user enter valid email
      And user enter valid password
      Then user click on login button