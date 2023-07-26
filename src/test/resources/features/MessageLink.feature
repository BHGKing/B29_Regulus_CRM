@regression

@B29G44-184
Feature: As a user, I should be able to send messages by clicking on Message tab under Activity Stream.

  Background: User should be able to access to the home page
    Given user is on the login page of the CRM application

  @B29G44-205
  Scenario: Verify user should be able to send a message
    Given the user logged in as "hr"
    Then the user selects the message dropdown button
    Then user "this is a test2" enters message
    Then user clicks to Send message ...
    Then user clicks SEND button
    And user should be able to see the message "this is a test2" that user sent before


  @B29G44-208
  Scenario: User should be able to see the error message "The message title is not specified"
    Given the user logged in as "hr"
    Then the user selects the message dropdown button
    Then user clicks to Send message ...
    Then user does not enters message
    Then user clicks SEND button
    Then user should be able to see the error message The message title is not specified


  @B29G44-234
  Scenario: User should be able to see the error message "Please specify at least one person."
    Given the user logged in as "hr"
    Then the user selects the message dropdown button
    Then user clicks to Send message ...
    Then user delete default recipient "All employees"
    And user does not choose recipient
    Then user clicks SEND button
    Then user should be able to see the error message Please specify at least one person.


  @B29G44-206
  Scenario: The message delivery should be to 'All employees' by default.
    Given the user logged in as "hr"
    Then the user selects the message dropdown button
    Given user clicks to Send message ...
    Then user should be able to see default recipient All employees


  @B29G44-207
  Scenario: User should be able to cancel sending messages at any time before sending.
    Given the user logged in as "hr"
    Then the user selects the message dropdown button
    Given user clicks to Send message ...
    Then user "this is a test2" enters message
    Then user clicks cancel button