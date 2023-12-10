Feature: This feature is for signup functionality

@SignupTest2

Scenario: verify user can successfully sign up to Demo blaze

Given Launch "<URL>"
When user validate home page title and click sign up link
And enter user name, password and click signupButton
Then verify user successfully signed up