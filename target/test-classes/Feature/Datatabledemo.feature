#Testing login feature
# asLists :used for get the data from DATATABLE
Feature: Login action

  Scenario: Successful Login with valid Credentials
     Given User is on Home page
     When User navigate to Login Page
     And User enters Credentials
     | VIN | ABc123 |
     | Kapil | bik1 |
     | jayu | lkj34 |
     
     
     Then massage Displayed login Successfully

