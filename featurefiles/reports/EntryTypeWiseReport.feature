Feature: Entry Type Wise Report
  As a user I want to run test cases of this page
  So that I don't have to do it myself

  Background: Steps to open account manager home page
    Given for url
    When user enter username and password
    And click sign in to open erp home page
    Then user click account manager logo
    And open entry type wise report page

  @verify_with_filters @scenario1
  Scenario: To verify entry type wise report report without selecting any filter with summary
    And select entry type with index "1" on entry type wise report
    Then click show on entry type wise report report

  @verify_with_filters @scenario2
  Scenario: To verify entry type wise report report without selecting any filter with details
    And select from date as month "April" year "2017" and day "1" on entry type wise report
    And select entry type with index "1" on entry type wise report
    And select consolidated report on entry type wise report
    Then click show on entry type wise report report