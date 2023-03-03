Feature:

  @Smoke
  Scenario: Verify user is able to login with valid credentials
    #Always start with Given or When
    Given user enters valid "valid.username" and "valid.password"
    When user clicks on sign in button
    Then verify user is successfully logged into the account


