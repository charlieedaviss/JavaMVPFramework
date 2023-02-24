Feature: Logout Feature

  @Smoke

    # For the logout feature, the user needs to be logged in first.
    # We should use Background: to implement the Login step.

  Scenario: Verify user is able to logout successfully
    Given user is logged in
    When user clicks on the profile icon and the log out button
    Then verify user is back on log in page