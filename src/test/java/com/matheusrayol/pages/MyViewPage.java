package com.matheusrayol.pages;

import com.matheusrayol.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyViewPage extends PageBase {

    // Page elements mapping
    // Menu
    By myViewPageLink = By.xpath("//a[@href='/my_view_page.php']");
    By viewIssuesLink = By.xpath("//a[@href='/view_all_bug_page.php']");
    By reportIssueLink = By.xpath("//a[@href='/bug_report_page.php']");
    By changeLogLink = By.xpath("//a[@href='/changelog_page.php']");
    By roadmapLink = By.xpath("//a[@href='/roadmap_page.php']");
    By summaryLink = By.xpath("//a[@href='/summary_page.php']");
    By manageLink = By.xpath("//a[@href='/manage_overview_page.php']");
    By myAccountLink = By.xpath("//a[@href='/account_page.php']");
    By logoutLink = By.xpath("//a[@href='/logout_page.php']");
    // Project Selection
    By projectComboBox = By.xpath("//form[@class='form_set_project']//select");
    By projectJumpButton = By.xpath("//form[@class='form_set_project']//input");
    // Project Search
    By projectSearchField = By.xpath("//input[@name='bug_id']");
    By projectSearchButton = By.xpath("//form[@action='/jump_to_bug.php']//input");

    // Actions
    public String retornaURL() {
        return driver.getCurrentUrl();
    }

    public void clicarMyViewPageLink() {
        click(myViewPageLink);
    }

    public void clicarViewIssuesLink() {
        click(viewIssuesLink);
    }

    public void clicarReportIssueLink() {
        click(reportIssueLink);
    }

    public void clicarChangeLogLink() {
        click(changeLogLink);
    }

    public void clicarRoadmapLink() {
        click(roadmapLink);
    }

    public void clicarSummaryLink() {
        click(summaryLink);
    }

    public void clicarManageLink() {
        click(manageLink);
    }

    public void clicarMyAccountLink() {
        click(myAccountLink);
    }

    public void clicarLogoutLink() {
        click(logoutLink);
    }

    public void selecionarProjeto(String projeto) {
        selectComboBox(projectComboBox, projeto);
    }

    public void clicarNoBotaoProjeto() {
        click(projectJumpButton);
    }

    public void digitarProjeto(String projeto) {
        sendKeys(projectSearchField, projeto);
    }

    public void clicarNoBotaoPesquisarProjeto() {
        click(projectSearchButton);
    }
}
