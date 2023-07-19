Feature: Files and picture Upload
  User story :As a user, I should be able to upload files and pictures while sending appreciation

  Scenario: User should be able to upload files and pictures.

  Supported file formats .pdf, .txt, .jpeg, .png, .docx
    Given user is on the appreciation module of the home page
    Then user click on the files upload icon
    Then user choose file from local directory
    Then user able to upload Supported file formats .pdf, .txt, .jpeg, .png, .docx
