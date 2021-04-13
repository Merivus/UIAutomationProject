package pageModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCalculationDetailModel extends  BaseModel {

    @FindBy(className="open-tooltip")
    public WebElement calculationDetails;

    @FindBy(xpath="//div[@class='tabs-content oran active'][@id='content-1']")
    public WebElement checkCostRatio;

    @FindBy(xpath="//div[@class='tabs-content plan active jspScrollable'][@id='content-2']")
    public WebElement checkPaymentPlan;

    @FindBy(id="accordion2")
    public WebElement btnPaymentPlan;

    @FindBy(xpath="//*[@class='table2']//tr[21]")
    public WebElement scrollLastElement;

    @FindBy(className="jspDrag")
    public WebElement jspDrag;

    public void clickCalculationDetails(){
        clickElement(calculationDetails);
    }

    public boolean checkCost(String key){
        if (key.equals("Masraf ve Maliyet Oranları")) {
            return isElementDisplayed(checkCostRatio);
        }
        else if (key.equals("Ödeme Planı")) {
            return isElementDisplayed(checkPaymentPlan);
        }
        else {
            return false;
        }
    }

    public void clickPaymentPlan(){
        clickElement(btnPaymentPlan);
    }

    public void scrollToLastElement(){
        scrollToElement(checkPaymentPlan);
        actions.dragAndDropBy(jspDrag,0,300).build().perform();
    }
}
