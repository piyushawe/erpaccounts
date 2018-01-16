Feature: Reconciliation Statement
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open reconciliation statement page

  @verify_with_filters @scenario1
  Scenario: To verify reconciliation statement report without selecting any filter
    And select bank with index "1" on reconciliation statement
    And select cheque status with index "1" on reconciliation statement
    And select order by with index "1" on reconciliation statement
    Then click show on reconciliation statement

  @verify_with_no_filters @scenario2
  Scenario: To verify daily cash status report without selecting any filter
    And select from date as month "April" year "2017" and day "1" on reconciliation statement
    And select bank with index "1" on reconciliation statement
    And click consolidated report on reconciliation statement
    And click student wise on reconciliation statement
    Then click show on reconciliation statement