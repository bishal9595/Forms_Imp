Feature: Email Registration

Scenario: Invalid user name
Given user is on 'EmailRegistration' page
When user enters invalid user name
Then displays 'Please fill the valid user Name'


Scenario: Invalid Password
Given user is on 'EmailRegistration' page
When user enters invalid password
Then displays 'Please fill valid password'

Scenario: Confirm Password not match
Given user is on 'EmailRegistration' page
When user enters confirm password not matching with password field
Then display 'Passwords not matching' 


Scenario: Invalid First Name
Given user is on 'EmailRegistration' page
When user enters invalid first name
Then display 'Please fill valid first name'

Scenario:  Invalid Last Name
Given user is on 'EmailRegistration' page
When user enters invalid last name
Then display 'Please enter valid last name'


Scenario: Gender field not selected

Given user is on 'EmailRegistration' page
When user does not select radio button field gender
Then display 'Please select gender' 

Scenario: Date of field not filled
Given user is on 'EmailRegistration' page
When user does not select proper DOB
Then display 'Please Select DOB in Calendar'

Scenario: Invalid Email
Given user is on 'EmailRegistration' page
When user enters invalid email
Then displays 'Please fill valid Email'

Scenario: Invalid Address
Given user is on 'EmailRegistration' page
When user enters invalid address
Then display 'Please fill valid Address' 


Scenario: City field not selected
Given user is on 'EmailRegistration' page
When user does not select city
Then display 'Please select your city'

Scenario:  Invalid Phone
Given user is on 'EmailRegistration' page
When user enters invalid phone
Then display 'Please enter valid Phone'


Scenario: Hobbies field not selected
Given user is on 'EmailRegistration' page
When user does not select hobbies checkbox
Then display 'Please select your hobbies'

Scenario:  Valid Details
Given user is on 'EmailRegistration' page
When user enters all valid details
Then display 'Email Registration Completed'

