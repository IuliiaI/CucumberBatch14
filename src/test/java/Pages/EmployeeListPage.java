package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeListPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement empSearchIdField;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement empSearchNameField;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[text()='Personal Details']")
    public WebElement personalDetailsTextBox;

    @FindBy(xpath = "//input[@name='personal[txtEmployeeId]']")
    public WebElement empIDcreated;

    @FindBy(xpath = "//table/tbody/tr[1]/td[2]")
    public WebElement afterAddEmpAppearedID;

    @FindBy(xpath = "//a[text()='Employee List']")
    public WebElement employeeListTab;




    public EmployeeListPage(){
        PageFactory.initElements(driver,this);
    }
}
