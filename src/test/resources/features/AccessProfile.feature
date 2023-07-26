@regression
@B29G44-183 @wip
Feature: Accessing my profile page functionality
  User story: As a user, I want to access my profile page.

  Background: User is already on the log in page
    Given the user is on the login page
    When User enter bellow correct credentials

      | username | helpdesk2@cydeo.com |
      | password | UserUser            |

    And user clicks to login button
    Then user should be able to access the profile page

  @B29G44-217 @wip
  Scenario:Verify the users view the following options on my profile page
    Given  user click on his profile
     When user click on My Profile option
     Then user should be able to see the following options on the profile page

       | General        |
       | Drive          |
       | Tasks          |
       | Calendar       |
       | Conversations  |

    @B29G44-218 @wip
    Scenario:Verify email address under the General tub
      When user click on his profile
      And user click on My Profile option
      And user should be able to access the profile page
      Then Verify email address under the General tub
