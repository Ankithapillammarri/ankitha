Feature: Admin can add,delete,update,issue books and able to view books

Background:

Given Admin is on Login page
When Admin enters username and password
|shailu@gmail.com|Shailaja@1|
Then Admin should be logged in

Scenario: Admin should be able to add books
Given Admin is on adding book page
When Admin enters book details
|Biology|Ratnakar|Sm publications|science|Added Successfully|
Then Admin logout page
Then close browser page
 

Scenario: Admin should be able to remove books
Given Admin is on removing book page
Then Book deleted successfully
Then Admin logout page
Then close browser page

Scenario: Admin should be able to issue books 
Given Admin is on issuing book page
When Admin move hover on issuse
Then Book issued successfully
Then Admin logout page
Then close browser page

Scenario: Admin should be to view books
Given Admin is on view book page
When Admin clicks on show books
Then Admin viewed booked sucessfully
Then Admin logout page
Then close browser page