@access
Feature: Accessing my profile page functionality
  User story: As a user, I want to access my profile page.

  Background: User is already in the log in page
    Given the user is on the login page
    When User enter bellow correct credentials

      | username | helpdesk2@cydeo.com |
      | password | UserUser            |

    And user clicks to login button
    Then user should be able to access the profile page

  @access
  Scenario:Verify the users view the following options on my profile page
    Given the user is on the login page

     When user click on his profile
     And user click on My Profile option
     Then user should be able to see the following options on the profile page

       | General       |
       | Drive         |
       | Tasks         |
       | Calendar      |
       | Conversations |

    @access
    Scenario:Verify email address under the General tub
      When user click on his profile
      And user click on My Profile option
      And user should be able to access the profile page
      Then Verify email address under the General tub
