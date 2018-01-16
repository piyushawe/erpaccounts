package stepdefinitions;

import cucumber.api.java.en.Then;
import pageobjects.reports.*;

import static webdriver.AppDriver.driver;

public class TestSteps {
//daily cash status
    @Then("^open daily cash status page$")
    public void open_daily_cash_status_page() throws Throwable {
        new DailyCashStatus(driver).openDailyCashStatus();
    }

    @Then("^select cash account with index \"([^\"]*)\" on daily cash status report$")
    public void select_cash_account_with_index_on_daily_cash_status_report(int arg1) throws Throwable {
        new DailyCashStatus(driver).selectCashAccount(arg1);
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on daily cash status$")
    public void select_from_date_as_month_year_and_day_on_daily_cash_status(String arg1, String arg2, String arg3) throws Throwable {
        new DailyCashStatus(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click consolidated report on daily cash status$")
    public void click_consolidated_report_on_daily_cash_status() throws Throwable {
        new DailyCashStatus(driver).clickConsolidatedReport();
    }

    @Then("^click show on daily cash status report$")
    public void click_show_on_daily_cash_status_report() throws Throwable {
        new DailyCashStatus(driver).clickShow();
    }

//bank ledger
    @Then("^open bank ledger page$")
    public void open_bank_ledger_page() throws Throwable {
        new BankLedger(driver).openBankLedger();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on bank ledger$")
    public void select_from_date_as_month_year_and_day_on_bank_ledger(String arg1, String arg2, String arg3) throws Throwable {
        new BankLedger(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select bank account with index \"([^\"]*)\" on bank ledger$")
    public void select_bank_account_with_index_on_bank_ledger(int arg1) throws Throwable {
        new BankLedger(driver).selectBankAccount(arg1);
    }

    @Then("^click show on bank ledger$")
    public void click_show_on_bank_ledger() throws Throwable {
        new BankLedger(driver).clickShow();
    }

//depreciation chart
    @Then("^open depreciation chart page$")
    public void open_depreciation_chart_page() throws Throwable {
        new DepreciationChart(driver).openDepreciationChart();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on depreciation chart$")
    public void select_from_date_as_month_year_and_day_on_depreciation_chart(String arg1, String arg2, String arg3) throws Throwable {
        new DepreciationChart(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click show on depreciation chart$")
    public void click_show_on_depreciation_chart() throws Throwable {
        new DepreciationChart(driver).clickShow();
    }

//depreciation detail item wise
    @Then("^open depreciation detail item wise page$")
    public void open_depreciation_detail_item_wise_page() throws Throwable {
        new DepreciationDetailItemWise(driver).openDepreciationDetailItemWise();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on depreciation detail item wise$")
    public void select_from_date_as_month_year_and_day_on_depreciation_detail_item_wise(String arg1, String arg2, String arg3) throws Throwable {
        new DepreciationDetailItemWise(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click show on depreciation detail item wise$")
    public void click_show_on_depreciation_detail_item_wise() throws Throwable {
        new DepreciationDetailItemWise(driver).clickShow();
    }

//income and expenditure
    @Then("^open income and expenditure page$")
    public void open_income_and_expenditure_page() throws Throwable {
        new IncomeAndExpenditure(driver).openIncomeAndExpenditure();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on income and expenditure$")
    public void select_from_date_as_month_year_and_day_on_income_and_expenditure(String arg1, String arg2, String arg3) throws Throwable {
        new IncomeAndExpenditure(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click show on income and expenditure$")
    public void click_show_on_income_and_expenditure() throws Throwable {
        new IncomeAndExpenditure(driver).clickShow();
    }

//profit and loss
    @Then("^open profit and loss page$")
    public void open_profit_and_loss_page() throws Throwable {
        new ProfitAndLoss(driver).openProfitAndLoss();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on profit and loss$")
    public void select_from_date_as_month_year_and_day_on_profit_and_loss(String arg1, String arg2, String arg3) throws Throwable {
        new ProfitAndLoss(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click show on profit and loss$")
    public void click_show_on_profit_and_loss() throws Throwable {
        new ProfitAndLoss(driver).clickShow();
    }

//journal ledger book
    @Then("^open journal ledger book page$")
    public void open_journal_ledger_book_page() throws Throwable {
        new JournalLedgerBook(driver).openJournalLedgerBook();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on journal ledger book$")
    public void select_from_date_as_month_year_and_day_on_journal_ledger_book(String arg1, String arg2, String arg3) throws Throwable {
        new JournalLedgerBook(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click show on journal ledger book$")
    public void click_show_on_journal_ledger_book() throws Throwable {
        new JournalLedgerBook(driver).clickShow();
    }

//day book
    @Then("^open day book page$")
    public void open_day_book_page() throws Throwable {
        new DayBook(driver).openDayBook();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on day book$")
    public void select_from_date_as_month_year_and_day_on_day_book(String arg1, String arg2, String arg3) throws Throwable {
        new DayBook(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click consolidated report on day book$")
    public void click_consolidated_report_on_day_book() throws Throwable {
        new DayBook(driver).clickConsolidatedReport();
    }

    @Then("^click student wise on day book$")
    public void click_student_wise_on_day_book() throws Throwable {
        new DayBook(driver).clickStudentWise();
    }

    @Then("^click show on day book report$")
    public void click_show_on_day_book_report() throws Throwable {
        new DayBook(driver).clickShow();
    }

//balance sheet
    @Then("^open balance sheet page$")
    public void open_balance_sheet_page() throws Throwable {
        new BalanceSheet(driver).openBalanceSheet();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on balance sheet$")
    public void select_from_date_as_month_year_and_day_on_balance_sheet(String arg1, String arg2, String arg3) throws Throwable {
        new BalanceSheet(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select radio button \"([^\"]*)\" on balance sheet$")
    public void select_radio_button_on_balance_sheet(String arg1) throws Throwable {
        new BalanceSheet(driver).clickButton(arg1);
    }

    @Then("^click show on balance sheet report$")
    public void click_show_on_balance_sheet_report() throws Throwable {
        new BalanceSheet(driver).clickShow();
    }

//entry type wise report
    @Then("^open entry type wise report page$")
    public void open_entry_type_wise_report_page() throws Throwable {
        new EntryTypeWiseReport(driver).openEntryTypeWiseReport();
    }

    @Then("^select entry type with index \"([^\"]*)\" on entry type wise report$")
    public void select_entry_type_with_index_on_entry_type_wise_report(int arg1) throws Throwable {
        new EntryTypeWiseReport(driver).selectEntryType(arg1);
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on entry type wise report$")
    public void select_from_date_as_month_year_and_day_on_entry_type_wise_report(String arg1, String arg2, String arg3) throws Throwable {
        new EntryTypeWiseReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select consolidated report on entry type wise report$")
    public void select_consolidated_report_on_entry_type_wise_report() throws Throwable {
        new EntryTypeWiseReport(driver).clickConsolidatedReport();
    }

    @Then("^click show on entry type wise report report$")
    public void click_show_on_entry_type_wise_report_report() throws Throwable {
        new EntryTypeWiseReport(driver).clickShow();
    }

//group wise report
    @Then("^open group wise report page$")
    public void open_group_wise_report_page() throws Throwable {
        new GroupWiseReport(driver).openGroupWiseReport();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on group wise report$")
    public void select_from_date_as_month_year_and_day_on_group_wise_report(String arg1, String arg2, String arg3) throws Throwable {
        new GroupWiseReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select ledger group on group wise report$")
    public void select_ledger_group_on_group_wise_report() throws Throwable {
        new GroupWiseReport(driver).selectLedgerGroup();
    }

    @Then("^select account on group wise report$")
    public void select_account_on_group_wise_report() throws Throwable {
        new GroupWiseReport(driver).selectAccount();
    }

    @Then("^click show on group wise report report$")
    public void click_show_on_group_wise_report_report() throws Throwable {
        new GroupWiseReport(driver).clickShow();
    }

//trial balance new
    @Then("^open trial balance new page$")
    public void open_trial_balance_new_page() throws Throwable {
        new TrialBalanceNew(driver).openTrialBalanceNew();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on trial balance new$")
    public void select_from_date_as_month_year_and_day_on_trial_balance_new(String arg1, String arg2, String arg3) throws Throwable {
        new TrialBalanceNew(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select ledger group on trial balance new$")
    public void select_ledger_group_on_trial_balance_new() throws Throwable {
        new TrialBalanceNew(driver).selectLedgerGroup();
    }

    @Then("^select account on trial balance new$")
    public void select_account_on_trial_balance_new() throws Throwable {
        new TrialBalanceNew(driver).selectAccount();
    }

    @Then("^select without zero amount on trial balance new$")
    public void select_without_zero_amount_on_trial_balance_new() throws Throwable {
        new TrialBalanceNew(driver).clickWithoutZeroAmount();
    }

    @Then("^select closing without zero amount on trial balance new$")
    public void select_closing_without_zero_amount_on_trial_balance_new() throws Throwable {
        new TrialBalanceNew(driver).clickClosingWithoutZeroAmount();
    }

    @Then("^click show on trial balance new report$")
    public void click_show_on_trial_balance_new_report() throws Throwable {
        new TrialBalanceNew(driver).clickShow();
    }

//ledger report detail
    @Then("^open ledger report detail page$")
    public void open_ledger_report_detail_page() throws Throwable {
        new LedgerReportDetail(driver).openLedgerReportDetail();
    }

    @Then("^select ledger group on ledger report detail$")
    public void select_ledger_group_on_ledger_report_detail() throws Throwable {
        new LedgerReportDetail(driver).selectLedgerGroup();
    }

    @Then("^select account on ledger report detail$")
    public void select_account_on_ledger_report_detail() throws Throwable {
        new LedgerReportDetail(driver).selectAccount();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on ledger report detail$")
    public void select_from_date_as_month_year_and_day_on_ledger_report_detail(String arg1, String arg2, String arg3) throws Throwable {
        new LedgerReportDetail(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click consolidated report on ledger report detail$")
    public void click_consolidated_report_on_ledger_report_detail() throws Throwable {
        new LedgerReportDetail(driver).clickConsolidatedReport();
    }

    @Then("^click student wise on ledger report detail$")
    public void click_student_wise_on_ledger_report_detail() throws Throwable {
        new LedgerReportDetail(driver).clickStudentWise();
    }

    @Then("^click show on ledger report detail$")
    public void click_show_on_ledger_report_detail() throws Throwable {
        new LedgerReportDetail(driver).clickShow();
    }

//ledger report detail new
    @Then("^open ledger report detail new page$")
    public void open_ledger_report_detail_new_page() throws Throwable {
        new LedgerReportDetailNew(driver).openLedgerReportDetailNew();
    }

    @Then("^select ledger group on ledger report detail new$")
    public void select_ledger_group_on_ledger_report_detail_new() throws Throwable {
        new LedgerReportDetailNew(driver).selectLedgerGroup();
    }

    @Then("^select account on ledger report detail new$")
    public void select_account_on_ledger_report_detail_new() throws Throwable {
        new LedgerReportDetailNew(driver).selectAccount();
    }

    @Then("^click show on ledger report detail new$")
    public void click_show_on_ledger_report_detail_new() throws Throwable {
        new LedgerReportDetailNew(driver).clickShow();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on ledger report detail new$")
    public void select_from_date_as_month_year_and_day_on_ledger_report_detail_new(String arg1, String arg2, String arg3) throws Throwable {
        new LedgerReportDetailNew(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click consolidated report on ledger report detail new$")
    public void click_consolidated_report_on_ledger_report_detail_new() throws Throwable {
        new LedgerReportDetailNew(driver).clickConsolidatedReport();
    }

    @Then("^click student wise on ledger report detail new$")
    public void click_student_wise_on_ledger_report_detail_new() throws Throwable {
        new LedgerReportDetailNew(driver).clickStudentWise();
    }

    @Then("^click without remark on ledger report detail new$")
    public void click_without_remark_on_ledger_report_detail_new() throws Throwable {
        new LedgerReportDetailNew(driver).clickWithoutRemark();
    }

//negative ledger report
    @Then("^open negative ledger report page$")
    public void open_negative_ledger_report_page() throws Throwable {
        new NegativeLedgerReport(driver).openNegativeLedgerReport();
    }

    @Then("^select radio button \"([^\"]*)\" on negative ledger report$")
    public void select_radio_button_on_negative_ledger_report(String arg1) throws Throwable {
        new NegativeLedgerReport(driver).clickButton(arg1);
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on negative ledger report$")
    public void select_from_date_as_month_year_and_day_on_negative_ledger_report(String arg1, String arg2, String arg3) throws Throwable {
        new NegativeLedgerReport(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select financial year with index \"([^\"]*)\" on negative ledger report$")
    public void select_financial_year_with_index_on_negative_ledger_report(int arg1) throws Throwable {
        new NegativeLedgerReport(driver).selectFinancialYear(arg1);
    }

    @Then("^click show on negative ledger report$")
    public void click_show_on_negative_ledger_report() throws Throwable {
        new NegativeLedgerReport(driver).clickShow();
    }

//reconciliation statement
    @Then("^open reconciliation statement page$")
    public void open_reconciliation_statement_page() throws Throwable {
        new ReconciliationStatement(driver).openReconciliationStatement();
    }

    @Then("^select bank with index \"([^\"]*)\" on reconciliation statement$")
    public void select_bank_with_index_on_reconciliation_statement(int arg1) throws Throwable {
        new ReconciliationStatement(driver).selectBank(arg1);
    }

    @Then("^select cheque status with index \"([^\"]*)\" on reconciliation statement$")
    public void select_cheque_status_with_index_on_reconciliation_statement(int arg1) throws Throwable {
        new ReconciliationStatement(driver).selectChequeStatus(arg1);
    }

    @Then("^select order by with index \"([^\"]*)\" on reconciliation statement$")
    public void select_order_by_with_index_on_reconciliation_statement(int arg1) throws Throwable {
        new ReconciliationStatement(driver).selectOrderBy(arg1);
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on reconciliation statement$")
    public void select_from_date_as_month_year_and_day_on_reconciliation_statement(String arg1, String arg2, String arg3) throws Throwable {
        new ReconciliationStatement(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^click consolidated report on reconciliation statement$")
    public void click_consolidated_report_on_reconciliation_statement() throws Throwable {
        new ReconciliationStatement(driver).clickConsolidatedReport();
    }

    @Then("^click student wise on reconciliation statement$")
    public void click_student_wise_on_reconciliation_statement() throws Throwable {
        new ReconciliationStatement(driver).clickStudentWise();
    }

    @Then("^click show on reconciliation statement$")
    public void click_show_on_reconciliation_statement() throws Throwable {
        new ReconciliationStatement(driver).clickShow();
    }

//cash bank book
    @Then("^open cash bank book page$")
    public void open_cash_bank_book_page() throws Throwable {
        new CashBankBook(driver).openCashBankBook();
    }

    @Then("^select radio button \"([^\"]*)\" on cash bank book$")
    public void select_radio_button_on_cash_bank_book(String arg1) throws Throwable {
        new CashBankBook(driver).clickButton(arg1);
    }

    @Then("^select ledger group on cash bank book$")
    public void select_ledger_group_on_cash_bank_book() throws Throwable {
        new CashBankBook(driver).selectLedgerGroup();
    }

    @Then("^select account on cash bank book$")
    public void select_account_on_cash_bank_book() throws Throwable {
        new CashBankBook(driver).selectAccount();
    }

    @Then("^select from date as month \"([^\"]*)\" year \"([^\"]*)\" and day \"([^\"]*)\" on cash bank book$")
    public void select_from_date_as_month_year_and_day_on_cash_bank_book(String arg1, String arg2, String arg3) throws Throwable {
        new CashBankBook(driver).selectFromDate(arg1, arg2, arg3);
    }

    @Then("^select detail on cash bank book$")
    public void select_detail_on_cash_bank_book() throws Throwable {
        new CashBankBook(driver).clickDetail();
    }

    @Then("^click show on cash bank book report$")
    public void click_show_on_cash_bank_book_report() throws Throwable {
        new CashBankBook(driver).clickShow();
    }
}