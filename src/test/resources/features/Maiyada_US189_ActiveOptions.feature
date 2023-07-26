Feature: options on the Activity stream page
  As a user, I should be able to see all the options on the Activity stream page

  Background:
    Given User is on the CRM login page
    When User enter username and password
    Then User should be able to login

  Scenario: Activity stream options
    Given the user is on the homepage
    Then user should be able to see the following options on the Activity Stream
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |


  Scenario: More Tab options
    Given User click on More tab
    Then User should be able to see the following options

      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |


