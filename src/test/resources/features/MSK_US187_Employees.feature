@B29G44-227
Feature: Default

	#*{_}US{_}:*
	#
	#As a user, I want to access the Employees page.
	#
	#_{color:#FF0000}*AC1:*{color}_
	#
	# Verify the users view the following 8 modules in the Employees page.
	#    Company Structure
	#    Find Employee
	#    Telephone Directory
	#    Staff Changes
	#    Efficiency Report
	#    Honored Employees
	#    Birthdays
	#    New page
  Background:
    Given User is on the CRM login page
    When User enter username and password
    Then User should be able to login
  @B29G44-225
  Scenario: Verify the users view the following 8 modules in the Employees page.
    Given the user is on the homepage
    And User click on the Employees module
    Then User should able to see following modules
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

	#*US:*
	#
	#*As a user, I want to access the Employees page.*
	#
	#{color:#FF0000}*AC2:*{color}
	#Verify that user view the Company Structure by default after clicking the Employees Module
  @B29G44-226
  Scenario: Verify that user view the Company Structure by default after clicking the Employees Module
    Given the user is on the homepage
    And User click on the Employees module
    Then user sees "Company Structure" title on the page