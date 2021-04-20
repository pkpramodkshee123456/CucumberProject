Feature: Login Page Features

Scenario: Login with valid credentials
Given user is on login page
Then user enters username and password
Then user clicks on login button
And user gets the title of the page
Then quit the browser

