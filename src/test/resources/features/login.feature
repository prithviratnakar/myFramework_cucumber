 Feature: Ess user login
 
  Scenario: Successful login
	Given user is on the login page
	When user enters vaild credentials
	And clicks on login button
	Then user should able to logged in successfully 
 
	
#	| username | password  |
  #| suraj    | suraj@123 |
	 
	
	Scenario: Unsuccessful login
	Given user is on the login page
	When user enters invaild credentials
	And clicks on login button
	Then user should not be able to login and dashboard should not be displayed

	
#	| username | password  |
  #| prithvi    | prithvi@123 |
#	
	Scenario: Unsuccessful login
	Given user is on the login page
	When user enters vaild username and invalid password
	And clicks on login button
	Then user should not be able to login and dashboard should not be displayed
	  
#	
#	
#	| username | password  |
  #| suraj    | efnfn@12 |
#	
	Scenario: Unsuccessful login
	Given user is on the login page
	When user enters invaild username and valid password
	And clicks on login button
	Then user should not be able to login and dashboard should not be displayed
	  
#	
#	| username | password  |
  #| sdfuhf    | suraj@123 |
#	
	Scenario: Forgot password
	Given user is on the login page
	When  user forgot the password
	And clicks on Forgot your password 
	Then reset password page should be displayed 