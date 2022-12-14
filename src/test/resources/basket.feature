@basket @jira-12212
Feature: Basket
  As an end user
  I want to add product to basket
  So that i can buy the products

  @regression
  Scenario: Add product to basket
    Given I am on homepage
    When I search for a product "nike"
    And  I select any product
    And I add product to basket
    And I go to basket
    Then I should be able to see product in basket

  @regression @wip
  Scenario: Remove product from basket

  @regression @wip
  Scenario: change the quantity in the basket

  @regression @wip
  Scenario: Undo the basket




