Feature: Deposit money into an existing account

  Background: Login to an existing account, verify on Home Page
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account
  @Wip
  Scenario: Deposit money into an existing account
    When user clicks on "deposit" menu item
    Then verify user is on the "http://18.116.88.132:8080/bank/account/deposit" page
    Then user selects "AutomationTest10 (Savings)" for deposit from dropdown
    Then user enters deposit "5000" and clicks on submit button
    Then verify user is on the "http://18.116.88.132:8080/bank/account/savings-view" page
