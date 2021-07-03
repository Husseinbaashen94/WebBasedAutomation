Feature: Automation Practice

  Scenario: Valid Signup 
    Given User Open browser and open "http://automationpractice.com/index.php"
    Then Click on the Sign in button
		Then Insert Email Addresss "automationtesting1994@gmail.com"
		Then Click on Create an Account
		Then Choose Title
		Then Fill in the First Name "Hussein"
		Then Fill in the Last Name "Mohammed"
		Then Fill in the Password "aaaaa"
		Then Pick the Date of Birth
		Then Fill in the Company "Fave"
		Then Fill in the Address "Kuala Lumpur"
		Then Fill in the City "Kuala Lumpur"
		Then Pick the State
		Then Fill the Zip Code "00000"
		Then Pick the Country
		Then Insert Your Phone Number "0173707278"
		Then Insert Your Mobile Number "0173707278"
		Then Fill in an Alias for Email Address  "testing94@gmail.com"
		Then Click on Register
		Then Navigated to the Profile Dashboard

		