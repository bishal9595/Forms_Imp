Feature: UserInformation

Scenario: Invalid Applicant name
Given user is on 'UserInformation' page
When user enters invalid Applicant name
Then displays 'Please fill the Applicant Name'

Scenario: Invalid first name
Given user is on 'UserInformation' page
When user enters invalid first name
Then displays 'Please fill the First Name'


Scenario: Invalid last name
Given user is on 'UserInformation' page
When user enters invalid last name
Then displays 'Please fill the Last Name'

Scenario: Invalid father name
Given user is on 'UserInformation' page
When user enters invalid father name
Then displays 'Please fill the Father Name'

Scenario: Date of birth is not entered
Given user is on 'UserInformation' page
When user does not enters Date of birth
Then display 'Please fill the DOB' 


Scenario: Invalid Date of birth
Given user is on 'UserInformation' page
When user enters Wrong Date of birth
Then display 'Please Enter valid date(dd-MM-yyyy)' 

Scenario: Gender is not selected
Given user is on 'UserInformation' page
When user does not select gender
Then display 'Please select the Gender' 

Scenario: Mobile number is not entered
Given user is on 'UserInformation' page
When user does not enter mobile number
Then display 'Please fill Mobile no' 

Scenario: Invalid Mobile Number
Given user is on 'UserInformation' page
When user enters invalid mobile number
Then display 'Please enter valid mobile no' 

Scenario: Email is not entered
Given user is on 'UserInformation' page
When user does not enter email
Then display 'Please fill the Email id'


Scenario: Invalid Landline number
Given user is on 'UserInformation' page
When user enters invalid landline number
Then display 'please fill the landline no' 


Scenario: Communication type not selected
Given user is on 'UserInformation' page
When user does not select communication type
Then display 'Please select the Type of Communication'

Scenario: Invalid Residential Address
Given user is on 'UserInformation' page
When user does not enters address
Then display 'please enter the Addresss'

Scenario:  Valid Details
Given user is on 'UserInformation' page
When user enters all valid details
Then display 'Personal details are validated.'