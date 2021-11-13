#Amazon
Feature: Searching on Amazon

  Background: verify Loginpage
    Given user go to the homepage
    When user enters username and password
    And user click on signin button
    Then user should get homepage

  Scenario: Search the product on amazon
    When the user is on searchbox
    And user is signin
    And user enter the product on search box
    Then user sees the various of product

  Scenario: To Buying the procuct on amazon
    When user is adding to cart
    And user is click on perticular product
    Then user Sees the buying the product
