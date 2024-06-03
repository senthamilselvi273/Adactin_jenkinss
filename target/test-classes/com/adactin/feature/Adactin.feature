Feature: Book a hotel in Adactin application
@page1
Scenario: user login the adactin application
Given user launch the adactin application
When user enter the user name in user name field
And user enter the password in password field 
Then click the login button 

@page2
Scenario: user search hotel in adactin appilcation 
When user select the location in location field 
And user select the hotels in hotel field 
And user select the room type in roomtype field
And user select the rooms in number of room type field
And user check in date in check in date field 
And user check out date in check out date field
And user selects the adult room in adults room field
And user select the child room in child room option 
Then user click on the search button 

@page3
Scenario: user confirms the selected hotel
When user select the hotel by clicking radio button 
Then user click on continue button ,it navigates to book a book a hotel page.

@page4
Scenario: user gives the details to book the hotel
When user enters first name in first name field
And user enters last name in last name field 
And user enters the address in biling address field 
And user enters the credit card no, in credit card no field 
And user selects the credit card type in credit card type field
And user selects the credit card  expiry month and year in  expiry date
And user enters the credit card cvv no in cvv no field
Then user click on book now button it navigates to booking confimation page

@page5
Scenario: user logout the adactin application 
When user clicks the logout button 
Then it will return to home page















