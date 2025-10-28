Feature: Automation Exercise Website Testing

  @SmokeTest
  Scenario: Home Page Verification
    Given navigate to "https://automationexercise.com/"
    Then verify that home page is visible successfully


  @SmokeTest
    Scenario: Product Page Navigation
    Given navigate to "https://automationexercise.com/"
    When I click on Products button
    Then I should be navigated to products page successfully

    @SmokeTest
    Scenario: Add Product to Cart
    Given navigate to "https://automationexercise.com/"
    When I click on Products button
    And I click on view product
    Then I click on add to cart button
    Then click on continue shopping button


    @SmokeTestt
    Scenario: Verify Functionality of Signup Login Page
    Given navigate to "https://automationexercise.com/"
    When I click on Signup Login button
      Then I fill the signup form with the following data:
        | name         | email                 |
        | TestUser123  | dnshu994@gmail.com |
      Then I click on signup button
    Then I should be navigated to Enter Account Information page
      Then I fill the account information form with the following data:
        | title    | password  | day | month | year | firstName | lastName | company      | address          | address2       | country   | state     | city       | zipCode | mobileNumber  |
        | Mr.      | Test@1234 | 10  | May   | 1994 | Test      | User     | TestCompany  | 123 Test Street  | Apt 456        | Canada    | TestState | TestCity   | T3S1A1  | 1234567890    |
      Then I click on create account button
    Then I should see a message 'ACCOUNT CREATED!'

@smokeTest


