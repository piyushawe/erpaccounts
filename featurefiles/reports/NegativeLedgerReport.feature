Feature: negative ledger report
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open negative ledger report page

  @verify_with_filters @scenario1
  Scenario: To verify negative ledger report report without selecting any filter date wise
    And select radio button "rdoDate" on negative ledger report
    And select from date as month "April" year "2017" and day "1" on negative ledger report
    Then click show on negative ledger report

  @verify_with_filters @scenario2
  Scenario: To verify daily cash status report without selecting any filter financial year wise
    And select radio button "rdoFyId" on negative ledger report
    And select financial year with index "1" on negative ledger report
    Then click show on negative ledger report