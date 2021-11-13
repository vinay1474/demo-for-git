#  login features
Feature:Login Page Validation
 
Scenario: Test the login page flow

  Given The user go on Login page
  When  the user enters "ABC" and "XYZ123"
  And   the user click on login button
  Then  user go on the home page
  
 Scenario: After completion process user can logout
   Given  user go on logout option
   Then   Massage display Successfully 
    
  