Feature: PaymentDetails
Scenario: Invalid cardHolder name
Given user is on 'PaymentDetails' page
When user enters invalid name
Then displays 'Please fill the Card holder name'

Scenario: Invalid Debit Card Number
Given user is on 'PaymentDetails' page
When user enters invalid Debit Card Number
Then displays 'Please fill the Debit card Number'


Scenario: Invalid CVV
Given user is on 'PaymentDetails' page
When user enters invalid cvv
Then displays 'Please fill the CVV'

Scenario: Invalid expiration month
Given user is on 'PaymentDetails' page
When user enters invalid expiration month
Then displays 'Please fill expiration month'

Scenario: Invalid expiration year
Given user is on 'PaymentDetails' page
When user enters invalid expiration year
Then displays 'Please fill the expiration year'

Scenario: Valid Booking details
Given user is on 'PaymentDetails' page
When user enters valid payment details
Then displays 'Pan Card Registration Done successfully!!!' 