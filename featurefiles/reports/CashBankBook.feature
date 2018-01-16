Feature: Cash Bank Book
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open cash bank book page

  @verify_with_filters @scenario1
  Scenario: To verify cash bank book report without selecting any filter
    And select radio button "rdoCashbank" on cash bank book
    And select ledger group on cash bank book
    And select account on cash bank book
    Then click show on cash bank book report

  @verify_with_filters @scenario2
  Scenario: To verify cash bank book report without selecting any filter with details
    And select from date as month "April" year "2017" and day "1" on cash bank book
    And select radio button "rdoother" on cash bank book
    And select detail on cash bank book
    And select ledger group on cash bank book
    And select account on cash bank book
    Then click show on cash bank book report