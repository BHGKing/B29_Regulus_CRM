@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

@wip
 Scenario: Verify login with hr user types
   Given the user logged in as "hr"
   #Given the user logged in with username as "hr1@cydeo.com" and password as "UserUser"

  Scenario: Verify login with helpdesk user types
   Given the user logged in as "helpdesk"
    #Given the user logged in with username as "helpdesk1@cydeo.com" and password as "UserUser"


  Scenario: Verify login with marketing user types
   Given the user logged in as "marketing"
    #Given the user logged in with username as "marketing1@cydeo.com" and password as "UserUser"






