Feature: Product purchase

  Background:
    Given Entry to the page
    When add with username and password
      | user          | password     |
      | standard_user | secret_sauce |
  @ProductPurchase
  Scenario: buy a product
    Given I add products to the cart to confirm the purchase
    When I add the purchase data to continue
      | firsname | lastname  | postalCode |
      | Isabo    | Arredondo | 2221457    |
    Then I check the message "THANK YOU FOR YOUR ORDER"