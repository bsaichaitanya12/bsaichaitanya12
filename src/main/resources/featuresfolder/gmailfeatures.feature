Feature:
	Test Gmail compose functionality
	
	Background:
		Given user need to be on gmail login page
		And user enter "bsaichaitanya12@gmail.com" in username field
		And clicks on next button in username page
		And user enter "Chaitanya66" as password
		And clicks on next button in password page
		And clicks on compose button in gmail home page
		
	Scenario:
		verify to field with blank data
		When user enter blank data " " in to field
		Then user clicks on send button in compose box
		And user gets pop "Please specify at least one recipient." message
		And close the browser
	
	Scenario:
		verify to field with valid data
		When user enter valid data "bsaichaitanya12@gmail.com"
		Then user clicks on send button in compose box
		And user gets a pop up "Send this message without a subject or text in the body?" message
		And user takes a schreenshot "with valid to field data "
		And close the browser
		
	Scenario:
		verify to field with invalid data
		When user enter invalid data "xyzzzzz" 
		Then user clicks on send button in compose box
		And user gets a pop up "Send this message without a subject or text in the body?" message
		And close the browser
		
		
	Scenario: 
		verify subject field with blank data
		When user enter valid data "bsaichaitanya12@gmail.com"
		And user enter blank data "  " in subject
		Then user clicks on send button in compose box
		And user gets a pop up "Send this message without a subject or text in the body?" message
		And close the browser
	
		
	Scenario: 
		verify subject field with valid data
		When user enter valid data "bsaichaitanya12@gmail.com"
		And user enter valid data "Incubyte" in subject
		Then user clicks on send button in compose box
		And user takes a schreenshot "with valid subject data "
		And close the browser
		
		
		Scenario: 
		verify body field with blank data
		When user enter valid data "bsaichaitanya12@gmail.com"
		And user enter valid data "Incubyte" in subject
		And user enter blank data "   " in body
		Then user clicks on send button in compose box
		And user takes a schreenshot "with blank body data data "
		And close the browser
		

		Scenario: 
		verify body field with valid data
		When user enter valid data "bsaichaitanya12@gmail.com"
		And user enter valid data "Incubyte" in subject
		And user enter blank data "Automation QA test for Incubyte" in body
		Then user clicks on send button in compose box
		And user takes a schreenshot "with valid body data data "
		And close the browser
		
		
		
			
	
		