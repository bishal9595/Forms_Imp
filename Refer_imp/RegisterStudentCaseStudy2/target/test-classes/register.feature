Feature: Student Registration

Scenario: Invalid studName 
Given User is on 'register' Page
When user enters invalid studName
Then display 'Please Enter Valid Student Name' 

Scenario: Empty studName 
Given User is on 'register' Page
When user enters does not enters name
Then display 'Please Enter  Student Name' 


Scenario: Empty studAddress 
Given User is on 'register' Page
When user enters does not enters address
Then display 'Please Enter  Student Address' 

Scenario: Empty studMarks 
Given User is on 'register' Page
When user enters does not enters marks
Then display 'Please Enter  Student Marks' 

Scenario: Invalid studAddress
Given User is on 'register' Page
When user enters invalid address
Then display 'Please Enter Valid Student Address' 

Scenario: Invalid studMarks
Given User is on 'register' Page
When user enters invalid marks
Then display 'Please Enter Valid Student Marks'

Scenario: Valid Details
Given User is on 'register' Page
When user enters valid details
Then display 'success' Page