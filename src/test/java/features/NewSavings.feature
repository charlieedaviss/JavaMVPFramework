Feature: Create New Savings

  Background: Log in to existing account
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account

  Scenario: Create a new savings account
    Then user opens new savings page
    Then user submits new savings account data
    Then correct savings account information is displayed
