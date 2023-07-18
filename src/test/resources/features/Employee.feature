Feature:

  @B29G44-195
  Scenario: Verify "Company Structure" should be displayed for HR user
   Given the user logged in as "hr"
   When user navigate to the Employee page
   Then user should verify Company Structure is displayed

  @B29G44-202
  Scenario: Verify "Company Structure" should be displayed for HelpDesk user
    Given the user logged in as "helpdesk"
    When user navigate to the Employee page
    Then user should verify Company Structure is displayed

  @B29G44-203
  Scenario: Verify "Company Structure" should be displayed for Marketing user
    Given the user logged in as "marketing"
    When user navigate to the Employee page
    Then user should verify Company Structure is displayed

  @B29G44-196
  Scenario: Verify Hr user should be able to add a department from the company structure.
    Given the user logged in as "hr"
    When user navigate to the Employee page
    Then user should verify there is "ADD DEPARTMENT" option for HR

  @B29G44-197
  Scenario: Verify There is no “ADD DEPARTMENT” option for Helpdesk users
    Given the user logged in as "helpdesk"
    When user navigate to the Employee page
    Then user should verify there is no "ADD DEPARTMENT" option

  @B29G44-204
    Scenario: Verify There is no “ADD DEPARTMENT” option for Marketing users.
      Given the user logged in as "marketing"
      When user navigate to the Employee page
      Then user should verify there is no "ADD DEPARTMENT" option



