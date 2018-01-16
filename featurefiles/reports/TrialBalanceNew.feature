Feature: Trial Balance New
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open trial balance new page

  @verify_with_filters @scenario1
  Scenario: To verify trial balance new report without selecting any filter with summary
    And select from date as month "April" year "2017" and day "1" on trial balance new
    And select ledger group on trial balance new
    And select account on trial balance new
    And select without zero amount on trial balance new
    And select closing without zero amount on trial balance new
    Then click show on trial balance new report