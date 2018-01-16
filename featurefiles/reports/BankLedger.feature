Feature: Bank Ledger
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open bank ledger page

  @verify_with_filters @scenario1
  Scenario: To verify bank ledger report with filters
    And select bank account with index "1" on bank ledger
    Then click show on bank ledger

  @verify_with_no_filters @scenario2
  Scenario: To verify bank ledger report without selecting any filter
    And select from date as month "April" year "2017" and day "1" on bank ledger
    And select bank account with index "1" on bank ledger
    Then click show on bank ledger