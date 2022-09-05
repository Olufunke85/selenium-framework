@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account using a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I Click on create an account
    Then My account page is displayed

    Examples:
      | Firstname | Lastname | Email            | Password    | ConfirmPassword |
      | Adejoke   | Ayoola   | ayoola@gmail.com | #Testing567 | #Testing567     |



  Scenario Outline: Account Login with username and password
    Given I am on login page
    When I enter "<Email>" "<Password>"
    And I Click on sign in




    Examples: