Feature:Verify Orange hrm is working

Scenario: Test the orangehrm loginpage
 Given User is on login page
 When The user enters the vaild username and password 
 And user click on login button
 Then User go on dashbord page