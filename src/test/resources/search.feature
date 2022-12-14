@search
Feature: Search
  As a end user
  I want to search for a product
  So that i can view the respective product

  @wip @rk
  Scenario Outline: Search for product
    Given I am on homepage
    And I search for a product "<item>"
    Then I should be able to see the respective products
    Examples:
    | item |
    | nike |














