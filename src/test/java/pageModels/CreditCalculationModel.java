package pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreditCalculationModel extends BaseModel{

    @FindBy(id="t-credit-price")
    public WebElement txtCreditPrice;

    @FindBy(className="multiple-module-head")
    public WebElement tblCreditCalculation;

    @FindBy(xpath="//label[@for='insuredType2']")
    public WebElement chkUninsured;

    @FindBy(xpath="//label[@for='insuredType1']")
    public WebElement chkInsured;

    @FindBy(className="ui-slider-range-min")
    public WebElement hoverBall;

    public void setCreditPrice(String text){
        clear(txtCreditPrice);
        sendKeys(txtCreditPrice,text);
    }

    public void chooseInsurance(String key) {
        scrollToElement(tblCreditCalculation);

        if (key.equals("SİGORTASIZ")) {
            clickElement(chkUninsured);
        } else if (key.equals("SİGORTALI")) {
            clickElement(chkInsured);
        } else {
            System.out.println("Existing value selected");
        }
    }

    public void chooseMaturity(String key){
        if (key.equals("20AY")) {
            actions.dragAndDropBy(hoverBall,10,0).build().perform();
        }
        else {
            System.out.println("Existing value selected");
        }
    }
}
