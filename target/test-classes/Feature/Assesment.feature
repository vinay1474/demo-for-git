Feature: Verify The details on Homepage

Background:  user should be login 
    Given  User go to  the login page
    When  Users enter valid username and password 
    And  User click on login button
    Then  User go to the home page


 Scenario: Succsessfully Login go to the Homepage 
    Given  User go on homepage
    When User click on login button 
    Then  User go to the home page
 
 
  Scenario: Test the Search functionality on home page
    Given The user go on home page
    When user click on login button
    Then user sees the search option on homepage 
    
    
  Scenario: Feature product are displayed on Homepage
    Given user go on homepage
    When  user click on signup button 
    And user search product
    Then product will displayed on homepage
  
      
  Scenario: Product should be displayed on homepage is catagrised  
    Given user go on homepage
    When  user click on login button
    Then  we will sees the products are various catagerise or not on home page
    
    
  Scenario: Product displayed on home page is clickable 
    Given user go on homepage
    When  user click on login button 
    And user go on search box and search the product
    Then user will sees the product is clikable
    
  Scenario: To verify profile section on home page
    Given user go on homepage
    When  user click on login button
    Then user sees the profile section present or not on homepage
   
   
       
 
 
 
 
 
 
 
 
 
 
 
 
 
    
  