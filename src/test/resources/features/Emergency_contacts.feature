 Feature: Emergency Contacts
	
	Scenario: Successfully Add Emergency Contact
	Given user is on Emergency Contacts page
	When clicks on add button of assigned emergency contact
	And enters requuired mandatory details 
	And clicks on save button 
	Then contact should be added into emergency contact
	And contact should be displayed into records
	
	Scenario: Unsuccessful to Add Emergency Contact
	Given  user is on Emergency Contacts page
	When clicks on add button of assigned emergency contact
	And not enter required mandatory details 
	And clicks on save button 
	Then contact should not be added into emergency contact
	 
	
	
	Scenario: Edit Emergency Contact
	Given  user is on Emergency Contacts page
	When user clicks on edit button of any record 
	And enters new data
	And clicks on save button 
	Then contact should be edited into emergency contact
	And updated contact should be displayed into records
	
	Scenario: Delete a single Emergency Contact
	Given  user is on Emergency Contacts page
	When user clicks on delete button of any record of assigned emergency contact
	And clicks on yes,delete button
	Then contact should be deleted from emergency contact
	And deleted contacts should not be displayed into emergency contact records
	
	Scenario: Delete multiple Emergency Contacts
	Given  user is on Emergency Contacts page
	When  selects multiple contacts through checkbox
	And clicks on delete selected
	Then selected contacts should be deleted from emergency contact
	And deleted contact should not be displayed into emergency contact records
	
#	Scenario: Successfully Add Attachment
#	Given user is on Emergency Contacts page
#	When user  clicks on add button of add attachment feild
#	And clicks on browse button 
#	And selects the appoprite file which is less than 1MB
#	And clicks in save button
#	Then file should be added into attachments
#	And file should be displayed into atatchments records
#	
#	Scenario: Edit Attachment File
#	Given user is on Emergency Contacts page
#	When user clicks on edit button of any record of attachment record
#	And enters new data
#	And clicks on save button 
#	Then file should be edited into attachments
#	And updated file should be displayed into attachments records
#	
#	Scenario: Delete Attachment File
#	Given user is on Emergency Contacts page
#	When  user clicks on delete button of any record of attachment record
#	And clicks on yes,delete button 
#	Then file should be deleted from attachments
#	And deleted file should not be displayed into attachments records
#	
#	Scenario: Delete multiple attachments files
#	Given user is on Emergency Contacts page
#	When selects multiple files through checkbox from attachment feild
#	And clicks on delete selected
#	Then selected file should be deleted from attachments
#	And deleted files should not be displayed into attachments records
#	
#	Scenario: Download attachments files
#	Given user is on Emergency Contacts page
#	When user clicks on download button of any file of attachment feild
#	Then selected file should get downloaded
#	
#	Scenario: Unsuccessful to Add Attachment
#	Given user is on Emergency Contacts page
#	When user clicks on add button of add attachment feild
#	And did not filled mandatory feilds
#	And clicks in save button
#	Then user should not be added any file attachments
#	
#	Scenario: Unsuccessful to Add Attachment
#	Given user is on Emergency Contacts page
#	When user clicks on add button of add attachment feild
#	And clicks on browse button 
#	And selects the file which is more than 1MB
#	And clicks in save button
#	Then user should not be added any file to attachments
#	
#	
	
	 
	

 