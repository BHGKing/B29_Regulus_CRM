
Feature: Users should be able to upload files and pictures

  User Story:
  As a user, I should be able to upload files and pictures as messages
  #Supported file formats .pdf, .txt, .jpeg, .png, .docx
  Accounts: hr, helpdesk, marketing

  Background: For all scenarios user is on the login page of the CRM application
    Given user is on the login page of the CRM application


@B29G44-186
  Scenario: Verify user can upload as hr
    Given the user logged in as "hr"
    Then the user selects the more dropdown
    Then selects the file element

@B29G44-187
  Scenario: Verify user can upload as helpdesk
    Given the user logged in as "helpdesk"
    Then the user selects the more dropdown
    Then selects the file element

@B29G44-188
  Scenario: Verify user can upload as marketing
    Given the user logged in as "marketing"
    Then the user selects the more dropdown
    Then selects the file element