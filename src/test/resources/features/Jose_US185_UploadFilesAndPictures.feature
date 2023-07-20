@B29G44-185
Feature: Users should be able to upload files and pictures

  User Story:
  As a user, I should be able to upload files and pictures as messages
  Accounts: hr, helpdesk, marketing
  #Supported file formats .pdf, .txt, .jpeg, .png, .docx

  Scenario Outline: User should be able to upload files and pictures.
    Given user is on the login page of the CRM application

    Examples:
      | selectable | chosen |
      | pdf       | pdf    |
      | txt       | txt    |
      | jpeg      | jpeg   |
      | png       | png    |
      | docx      | docx   |

@B29G44-186
  Scenario: Verify user can upload as hr
    Given the user logged in as "hr"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded

@B29G44-186A
  Scenario: Verify user can upload as helpdesk
    Given the user logged in as "helpdesk"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded

@B29G44-186B
  Scenario: Verify user can upload as marketing
    Given the user logged in as "marketing"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded

@B29G44-187
  Scenario: Verify user can insert files and images into messages as hr
    Given the user logged in as "hr"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded
    Then the user selects insert in text button
    #Then verify if the user sees the file in message box

@B29G44-187A
  Scenario: Verify user can insert files and images into messages as helpdesk
    Given the user logged in as "helpdesk"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded
    Then the user selects insert in text button
    #Then verify if the user sees the file in message box

@B29G44-187B
  Scenario: Verify user can insert files and images into messages as marketing
    Given the user logged in as "marketing"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded
    Then the user selects insert in text button
    #Then verify if the user sees the file in message box

@B29G44-188
  Scenario: Verify user can delete files and images after inserting as hr
    Given the user logged in as "hr"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded
    Then the user selects to remove the uploaded file or image