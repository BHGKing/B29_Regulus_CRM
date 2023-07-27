@B29G44-242
  Feature: Testing sending appreciation functionality
    User story: As a user, I should be able to send appreciation by clicking on Appreciation tab under Active Stream.

    Background: User is already on home page
      Given the user is on the CRM login page
      When User enter  correct email and password
      And user clicks to login button
      Then user should be able to access the profile page

@B29G44-244
    Scenario: Verify user should be able to send an appreciation by filling in the mandatory fields.
      When User click on more tab
      And User click on Appreciation option under the More tab
      Then User should be able to send an appreciation by filling in the mandatory fields.

  @B29G44-245
      Scenario:  Verify The delivery should be to 'All employees' by default.
        When User click on More tab
        And User click on Appreciation option under the More tab
        And User should be able to send an appreciation by filling in the mandatory fields.
        Then Verify delivery is to 'All employees' by default.

    @B29G44-246
        Scenario: User should be able to cancel sending appreciation at any time before sending.
          When User click on More tab
          And User click on Appreciation option under the More tab
          And User should be able to send an appreciation by filling in the mandatory fields.
          And User be able to click Cancel button at any time before sending.