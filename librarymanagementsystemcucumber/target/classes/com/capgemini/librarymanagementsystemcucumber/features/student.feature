Feature: Student can request,return and able to view books

Background:

Given Student is on Login page
When Student enters username and password
|deepthi@gmail.com|Deepthik@1|
Then Student should be logged in

Scenario: Student should be able to request books
Given Student is on request book page
When Student clicks on request button
Then Book Requested Successfully
Then student logout page
Then close browser page

Scenario: Student should be able to return books
Given Student is on returning book page
When Student clicks on return button
Then Book Returned Successfully
Then student logout page
Then close browser page
