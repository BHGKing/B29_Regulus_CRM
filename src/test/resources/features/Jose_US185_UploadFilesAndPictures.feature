@B29G44-185
Feature: Users should be able to upload files and pictures

  User Story:
  As a user, I should be able to upload files and pictures as messages
  Accounts: hr, helpdesk, marketing
  #Supported file formats .pdf, .txt, .jpeg, .png, .docx

  Background: User should be able to upload files and pictures.
    Given user is on the login page of the CRM application

@B29G44-235
  Scenario: Verify user can upload files and pictures
    Given the user logged in as "hr"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded

  @B29G44-237
  Scenario: Verify user can insert files and images into messages
    Given the user logged in as "hr"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded
    Then the user selects insert in text button
    #Then verify if the user sees the file in message box

  @B29G44-238
  Scenario: Verify user can delete files and images after inserting
    Given the user logged in as "hr"
    Then the user is on the home page
    Then the user selects the message dropdown button
    Then the user selects the picture button
    Then the user selects the upload files and images button
    Then verify if the user sees the file uploaded
    Then the user selects to remove the uploaded file or image
    #Then verify the file is removed

#@B29G44-235A
#  Scenario: Verify user can upload as helpdesk
#    Given the user logged in as "helpdesk"
#    Then the user is on the home page
#    Then the user selects the message dropdown button
#    Then the user selects the picture button
#    Then the user selects the upload files and images button
#    Then verify if the user sees the file uploaded
#
#@B29G44-235B
#  Scenario: Verify user can upload as marketing
#    Given the user logged in as "marketing"
#    Then the user is on the home page
#    Then the user selects the message dropdown button
#    Then the user selects the picture button
#    Then the user selects the upload files and images button
#    Then verify if the user sees the file uploaded



#@B29G44-237A
#  Scenario: Verify user can insert files and images into messages as helpdesk
#    Given the user logged in as "helpdesk"
#    Then the user is on the home page
#    Then the user selects the message dropdown button
#    Then the user selects the picture button
#    Then the user selects the upload files and images button
#    Then verify if the user sees the file uploaded
#    Then the user selects insert in text button
#    #Then verify if the user sees the file in message box
#
#@B29G44-237B
#  Scenario: Verify user can insert files and images into messages as marketing
#    Given the user logged in as "marketing"
#    Then the user is on the home page
#    Then the user selects the message dropdown button
#    Then the user selects the picture button
#    Then the user selects the upload files and images button
#    Then verify if the user sees the file uploaded
#    Then the user selects insert in text button
#    #Then verify if the user sees the file in message box



#@B29G44-238A
#  Scenario: Verify user can delete files and images after inserting as helpdesk
#    Given the user logged in as "helpdesk"
#    Then the user is on the home page
#    Then the user selects the message dropdown button
#    Then the user selects the picture button
#    Then the user selects the upload files and images button
#    Then verify if the user sees the file uploaded
#    Then the user selects to remove the uploaded file or image
#    #Then verify the file is removed

#@B29G44-238B
#  Scenario: Verify user can delete files and images after inserting as marketing
#    Given the user logged in as "marketing"
#    Then the user is on the home page
#    Then the user selects the message dropdown button
#    Then the user selects the picture button
#    Then the user selects the upload files and images button
#    Then verify if the user sees the file uploaded
#    Then the user selects to remove the uploaded file or image
#    #Then verify the file is removed