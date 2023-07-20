@B29G44-185
Feature: Users should be able to upload files and pictures

  User Story:
  As a user, I should be able to upload files and pictures as messages
  Accounts: hr, helpdesk, marketing
  #Supported file formats .pdf, .txt, .jpeg, .png, .docx

  Background: For all scenarios user is on the login page of the CRM application
    Given user is on the login page of the CRM application


@B29G44-186
  Scenario: Verify user can upload as hr
    Given the user enters username and password for hr
    Then user should be able to login
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
