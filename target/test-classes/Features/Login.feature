Feature: Application login


Scenario: Home page default login
Given User is on landing page
When User logs into application with username and password
Then Home page is populated
And Cards are displayed