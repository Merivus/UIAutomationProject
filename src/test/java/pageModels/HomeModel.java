package pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeModel extends BaseModel {

    @FindBy(id="ctl00_ucFooterMenu_rptMain_ctl02_rptChild_ctl00_linkChild")
    public WebElement btnCreditCalculation;

    public void goToUrl(String key){
        webDriver.get(key);
    }

    public void clickCalculator(){
        clickElement(btnCreditCalculation);
    }
}
