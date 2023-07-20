@B29G44-224
Feature: Default

  US: As a user, I should be able to log out

  Background:
    Given User on the login page
    When User enter email and password
    Then User should be able to login

  @B29G44-222

  Scenario: User sees 5 options under the profile name
    When the user clicks on their profile name or avatar icon
    Then the user should see the following options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

  @B29G44-223

  Scenario: User can log out from the app
    Given the user is on the homepage
    When the user clicks on the Log out button
    Then the user should be redirected to the login or splash screen


