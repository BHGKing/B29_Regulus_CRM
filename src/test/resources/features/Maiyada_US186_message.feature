@B29G44-201
Feature: Default

	Background:
		Given User is on the CRM login page
		When User enter username and password
		Then User should be able to login

	@B29G44-198
	Scenario: Verify, user can attach link to the message area
		Given the user is on the homepage
		    And User click on the Message button
		    And User click on the link button
		    Then the user should be able to add the link and associate it with the text	


	@B29G44-199
	Scenario: Verify, use can navigate to the correct URL
		Given  the user clicks on the link
		Then the user should be able to navigate to the correct URL

	@B29G44-200
	Scenario: Verify, user can see link open in new tab
		Given the link is opened
		Then user should be able to see it open in a new tab

