@B29G44-215
Feature: poll creation feature.


  @B29G44-210
  Scenario: The delivery should be to 'All employees' by default
    Given  user is on the home page.
    When  user clicks on poll tab at the top.
    Then user should see delivery to all employees by default.


  @B29G44-211
    #make sure both quotes are the exact same and not repeating because you cant have the same poll twice
  Scenario:  User should be able to create a poll by adding questions and multiple answers.
    Given user is on the home page.
    Then  user clicks on poll tab at the top.
    Then user should be able to click ask "hai?"
    Then user should be able to provide the answers and click send.
    Then user should be able to see "hai?" posted as a poll


  @B29G44-212
  Scenario: User should be able to select the “Allow multiple choice” checkbox.
    Given user is on the home page.
    Then user clicks on poll tab at the top.
    Then user should be able to select the allow multiple choices checkbox.


  @B29G44-213
    #make sure you change the parameterization everytime or else it will not work
  Scenario: Mandatory fields should give error messages : Message title, recipient, 1 question, 1 answer
    Given user is on the home page.
    Then user clicks on poll tab at the top.
    Then if user does no give any questionns or answers and tries to creat poll they should get The message title is not specified error.
    And if user enters question and answer wihtout selecting who to deliver to, user should see Please specify at least one person. error.
    And if user only provides title and answer but not question user should see The question text is not specified.
    And if user only provides the title and the question "hello", user should see The question "hello" say has no answers. error.