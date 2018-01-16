Feature: Daily Cash Status
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open daily cash status page

  @verify_with_filters @scenario1
  Scenario: To verify daily cash status report with filters
    And select cash account with index "1" on daily cash status report
    Then click show on daily cash status report

  @verify_with_no_filters @scenario2
  Scenario: To verify daily cash status report without selecting any filter
    And select from date as month "April" year "2017" and day "1" on daily cash status
    And select cash account with index "1" on daily cash status report
    And click consolidated report on daily cash status
    Then click show on daily cash status report