@Amin_US192
Feature: Files and picture Upload
  User story :As a user, I should be able to upload files and pictures while sending appreciation


  Scenario Outline: User should be able to upload files and pictures.
  Supported file formats .pdf, .txt, .jpeg, .png, .docx

    Given user is on the  the home page
    Then user click on the more module of the home page
    Then user Select the Apprecition
    Then user click on the files upload icon
    Then user choose "<supported>" file from local directory
    Then user able to upload "<chosen>" file

    Examples:
      | supported | chosen |
      | pdf       | pdf    |
      | txt       | txt    |
      | jpeg      | jpeg   |
      | png       | png    |
      | docx      | docx   |


  Scenario: User should be able to insert the files and images into the text
    Given user is on the  the home page
    Then  user click on text area
    Then user click on the files upload icon
    Then user choose file from local repository
    Then user insert file into text area
    Then user choose image
    Then  user insert image into text area

    Scenario: User should be able to remove the images from text area befor sending
      Given user is on the  the home page
      Then  user click on text area
      Then user click on the files upload icon
      Then user choose image
    Then user insert image into text area
    Then user remove image before sending
