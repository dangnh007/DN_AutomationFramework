@feature-guru-03 @order-and-return
Feature: User Management
  As a user
  I want to order and return

  @mc-0301 @sanity @smoke
  Scenario: Register New User
    Given I access Login Page
    When I access Register Page
    Then I access SiteMap Page
    Then I access HomePage Page