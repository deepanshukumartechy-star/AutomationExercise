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