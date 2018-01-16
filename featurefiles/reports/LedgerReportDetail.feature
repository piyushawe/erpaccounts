Feature: Ledger Report Detail
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open ledger report detail page

  @verify_with_filters @scenario1
  Scenario: To verify ledger report detail report without selecting any filter
    And select ledger group on ledger report detail
    And select account on ledger report detail
    Then click show on ledger report detail

  @verify_with_no_filters @scenario2
  Scenario: To verify daily cash status report without selecting any filter
    And select from date as month "April" year "2017" and day "1" on ledger report detail
    And select ledger group on ledger report detail
    And select account on ledger report detail
    And click consolidated report on ledger report detail
    And click student wise on ledger report detail
    Then click show on ledger report detail