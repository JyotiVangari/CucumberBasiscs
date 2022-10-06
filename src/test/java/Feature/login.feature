Feature: Login functionality

	  Scenario Outline: Facebook Login Functionality
	    Given Land on Page
	    When Enter with <username> and <password>
	    Then Successfully login
	
	    Examples: 
	      |username|password|
	      | latha| Peacefully  |
	