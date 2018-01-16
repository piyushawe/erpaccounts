Feature: Balance Sheet
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open balance sheet page

  @verify_with_filters @scenario1
  Scenario: To verify balance sheet report without selecting any filter with summary
    And select from date as month "April" year "2017" and day "1" on balance sheet
    And select radio button "rdosummury" on balance sheet
    Then click show on balance sheet report

  @verify_with_filters @scenario2
  Scenario: To verify balance sheet report without selecting any filter with details
    And select from date as month "April" year "2017" and day "1" on balance sheet
    And select radio button "Rdodtl" on balance sheet
    Then click show on balance sheet report