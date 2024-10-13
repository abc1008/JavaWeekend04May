Feature: Change Password functionality


Scenario:Verify Change Password
	Given User clicks on profile icon
	And Selects 'Change Password' option
	And Enters new passwords
	And Clicks on Save button
	Then Password should be changed successfully and a toaster message should be dispalyed

