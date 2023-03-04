Feature:


  Background: Verify user is able to login with valid credentials
    #Always start with Given or When
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account

  @QuickTest
  Scenario: Verify user is able to transfer to different account
    When user clicks on transfer between accounts

    Then verify user is on Internal Transfer page
    When user select from account "transfer.from.account"
    And user select to account "transfer.to.account"
    And user enter amount "transfer.amount"
    And clicks on submit button

    Then verify user is on View Accounts Page
    And verify transaction history displayed for the new transaction
    And verify transaction details getting updated into the database

