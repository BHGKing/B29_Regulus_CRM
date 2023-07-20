@B29G44-229
Feature: Default


  @B29G44-228
  Scenario: Verify the users view the following 6 modules on the Drive page.
    Given the user logged in as "helpdesk"
    When user clicks on the Drive button
    Then user should be able to see following modules
      | My Drive            |
      | All Documents       |
      | Company Drive       |
      | Sales and Marketing |
      | More                |