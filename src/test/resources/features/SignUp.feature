Feature: Sign Up to Digital Bank website

  @Smoke
  Scenario: User is able sign up a new account
    When user is on login page
    Then user clicks on Sign Up Here button
    Then user chooses Title
    Then user enters First Name
    Then user enters Last Name
    Then user chooses Gender
    Then user enters Date of Birth
    Then user enters SSN
    Then User enters Email Address
    Then user enters Password
    Then user confirms Password
    Then user clicks Next button
    Then user enters Address
    Then user enters Locality
    Then user enters Region
    Then user enters Postal Code
    Then user enters Country
    Then user enters Home Phone
    Then user enters Mobile Phone
    Then user enters Work Phone
    Then user Agrees to Terms and Policy
    Then user clicks Register Button
    Then registration success message is displayed
