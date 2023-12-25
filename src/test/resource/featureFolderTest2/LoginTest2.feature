Feature: This feature is for login functionality

@LoginTest2
Scenario: verify user can able to login with valid credentials 

Given launch "<URL>"
When user is in homepage and click login link
And enter username, password and click login button
Then verify user can successfully logged in
Then user can successfully logged out