Feature: User Registration

Scenario:  User Registration with given details

Given User is on Login page
When Student enters firstName ,lastName,email,password,mobile,role,status
|krish|Emmula|krish@gmail.com|Krish@123|8979399542|student|registered successfully|
Then User should be logged in